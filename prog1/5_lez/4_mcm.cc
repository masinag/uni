//
// Acquisire da tastiera due numeri interi 
// e calcolare il minimo comune multiplo
// attraverso una funzione.
//

#include <iostream>
using namespace std;
int massimo (int, int);
int mcm(int, int);
int mcm2(int, int);

int main(){
  float a, b, min;

  cout << "Inserisci due numeri interi: ";
  cin >> a >> b;

  min = mcm2(a, b);
  cout << "Il mcm tra " << a << " e " << b
       << " e' " << min << endl;
  return 0;
}

int massimo(int a, int b){
  return (a>b) ? a : b;
}

int mcm(int a, int b){
  int max, mult = a*b;
  max = massimo(a, b);
  int temp = mult;

  while(temp > max){
    temp -= max;
    if (temp%a == 0 && temp%b == 0)
      mult = temp;
  }

  return mult;
}

int mcm2(int a, int b){
  int max = massimo(a, b);
  int mcm = max;
  while (mcm%a != 0 || mcm%b != 0){
    mcm += max;
  }
  return mcm;
}
