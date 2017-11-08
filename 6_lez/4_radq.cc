//
// Scrivere la funzione radicequadrata con questa
// dichiarazione:
//
// double radq(double n, bool* neg);
//
// ritorna la radice quadrata di n se n>=0,
// se n<0 ritorna 0 e neg == true.
//

using namespace std;
#include <iostream>
#include <cmath>

double radq(double n, bool* neg);

int main(){
  double x, rad;
  bool neg;
  
  cout << "Inserisci un numero reale: ";
  cin >> x;
  rad = radq(x, &neg);

  if (neg) {
    cout << "X deve essere >=0" << endl;
  } else {
    cout << "La radice quadrata di " << x << " e' " << rad << endl;
  }
  return 0;
}

double radq(double n, bool* neg){
  *neg = n<0;
  if (*neg) return 0;
  else return sqrt(n);
}
