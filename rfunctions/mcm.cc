//
// Acquisire da tastiera due numeri interi 
// e calcolare il minimo comune multiplo usando
// la ricorsione.
//

#include <iostream>
using namespace std;
int massimo (int a, int b);
int minimo (int a, int b);
int mcm(int a, int b);
int mcm(int a, int b, int mult);

int main(){
  float a, b, min;

  cout << "Inserisci due numeri interi: ";
  cin >> a >> b;

  min = mcm(a, b);
  cout << "Il mcm tra " << a << " e " << b
       << " e' " << min << endl;
  return 0;
}

int massimo (int a, int b){
  return (a>b) ? a : b;
}
int minimo (int a, int b){
  return (a<b) ? a : b;
}
int mcm(int a, int b){
  int max = massimo(a, b), min = minimo(a, b);
 
  return mcm (max, min, max);
}
int mcm(int a, int b, int mult){
  int res;
  if (mult % b == 0)
    res = mult;
  else
    res = mcm(a, b, mult+a);
  return res;
}
