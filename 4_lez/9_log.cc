// Stampare un'approssimazione di log(1-x), -1<x<1
// utilizzando la sommatoria (-1)^(n+1) * x^n / n, n da 1 a inf .

using namespace std;
#include <iostream>
#include <cmath>

int main(){
  double x, sum=0;
  cout << "Inserisci un valore di x tra -1 e 1: ";
  cin >> x;

  if (x >= 1 || x <= -1){
    cout << "Valore non valido";
  } else
    {
    for (int n=1; n<10000; n++){
      sum += pow(-1, n+1) * pow(x, n) / n;
    }
    cout << "log(1 + " << x << ") = " << sum;
  }

  cout << endl;
  
  
  return 0;
}
