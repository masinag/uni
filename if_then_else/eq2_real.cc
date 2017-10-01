//
// 1) Scrivere un programma che risolva un'equazione di 2 grado
// nei reali

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

  if (a==0){
    if (b==0){
      if (c==0){
	cout << "L'equazione ha infinite soluzioni";
      } else {
	cout << "L'equazione non ha soluzioni";
      }
    } else {
      cout << "L'equazione ha un'unica soluzione: " << (-c/b);
    }
  } else {
    delta = b*b - 4*a*c;
      if (delta<0){
	cout << "L'equazione non ha soluzioni reali";
      } else if (delta ==0) {
	cout << "L'equazione ha un'unica soluzione: " << (-b/(2*a));
      } else {
	cout << "Le soluzioni dell'equazione sono: " <<
	  (-b-sqrt(delta))/(2*a) << " e " << (-b+sqrt(delta))/(2*a);
      }
  }
  cout << endl;
}
 

