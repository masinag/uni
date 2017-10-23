//
// Dati 3 interi questi possono essere le misure dei lati
// di un triangolo se la somma di 2 e' maggiore del terzo.
//

using namespace std;
#include <iostream>
#include <cmath>

bool sono_lati(double, double, double);

int main(){
  double l1, l2, l3;
  cout << "Inserisci le misure di 3 lati: ";
  cin >> l1 >> l2 >> l3;
  
  if(sono_lati(l1, l2, l3)){
    cout << "Possono essere le misure dei lati di un triangolo";
  } else {
    cout << "Non possono essere le misure dei lati di un triangolo";
  }
  return 0;
}

bool sono_lati(double a, double b, double c){
  return (a+b>c && b+c>a && c+a>b);
}
