//
// 2) Scrivere un programma che risolva un'equazione di 2 grado,
// dando anche le soluzioni complesse


#include <iostream>
#include <cmath>

using namespace std;

int main(){
  double a, b, c, delta;
  cout << "Inserisci il coefficiente di x^2: ";
  cin >> a;

  cout << "Inserisci il coefficiente di x: ";
  cin >> b;

  cout << "Inserisci il termine noto: ";
  cin >> c;
  
  if (a!=0){
  delta = b*b - 4*a*c;
    if (delta > 0) {
      cout << (-b - sqrt(delta))/(2*a) << ", "
  	   << (-b + sqrt(delta))/(2*a);
    } else if (delta == 0) {
      cout << -b/(2*a);
    } else {
      delta *= -1;
      cout << (-b)/2*a << " - i" << sqrt(delta)/(2*a) << ", "
           << (-b)/2*a << " + i" << sqrt(delta)/(2*a);
    }
  } else {
    if (b==0 && c==0){
      cout << "Infinite soluzioni";
    } else if (b==0) {
      cout << "Nessuna soluzione";
    } else {
      cout << -c/b;
    }
  }

  cout << endl;

}
 

