//
// 1) Scrivere un programma che risolva un'equazione di 2 grado
// nei reali

#include <iostream>
#include <cmath>
using namespace std;

int main(){
  double a, b, c, delta, s1, s2;
  cout << "Inserisci il coefficiente di x^2: ";
  cin >> a;

  cout << "Inserisci il coefficiente di x: ";
  cin >> b;

  cout << "Inserisci il termine noto: ";
  cin >> c;

  if (a!=0){
    delta = b*b - 4*a*c;
    if (delta > 0){
      s1 = (-b - sqrt(delta))/(2*a);
      s2 = (-b + sqrt(delta))/(2*a);
      cout << s1 << ", " << s2;
    } else if (delta == 0) {
      s1 = -b/(2*a);
      cout << s1;
    } else {
      cout << "Nessuna soluzione";
    }
  } else {
    if (b==0 && c==0){
      cout << "Infinite soluzioni";
    } else if (b==0) {
      cout << "Nessuna soluzione";
    } else {
      s1 = -c/b;
      cout << s1;
    }
  }

  cout << endl;

}
 

