//
// Prendere in input tre interi che corrispondono ai coefficienti
// dell'equazione di secondo grado a*x^2 + b*x + c = 0.
// Calcolare le radici di questa equazione.
//

#include <iostream>
#include <cmath>
using namespace std;

int main(){
  float a, b, c, delta, x1, x2;

  cout << "Inserisci i coefficienti a, b e c: ";
  cin >> a >> b >> c;

  delta = sqrt(b*b - 4*a*c);

  x1 = (-1*b + delta) / (2*a);
  x2 = (-1*b - delta) / (2*a);
  
  cout << "Le radici dell'equazione " << a << "x^2 + " <<
    b << "x + " << c << " = 0 sono:" << endl;
  
  cout << x1 << endl << x2 << endl;
  
  return 0;
}
