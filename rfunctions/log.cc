// Stampare un'approssimazione di log(1+x), -1<x<1
// utilizzando la sommatoria (-1)^(n+1) * x^n / n, n da 1 a inf.
// Usare la ricorsione.

using namespace std;
#include <iostream>
#include <cmath>

const double STEPS = 1000;

double mylog(double x);
double mylog(double x, int steps);

int main(){
  double x, ln;
  cout << "Calcola log(1+x) con -1<=x<=1." << endl;
  cout << "Inserisci x: ";
  cin >> x;;
  ln = mylog(x);
  if (ln<-5){
    cout << "Valore non valido" << endl;
  } else 
    cout << "log(1 + " << x << ") = " << mylog(x) << endl;
  
  return 0;
}

double mylog(double x){
  double res = -10;
  if (x>=-1 && x<=1)
    res = mylog(x, 1);
  return res;
}

double mylog(double x, int i){
  double res;
  if (i > STEPS)
    res = 0;
  else {
    res = pow(-1, i+1) * pow(x, i) / i;
    res +=  mylog(x, i+1);
  }
  return res;
}
