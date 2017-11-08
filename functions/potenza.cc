// Scrivere un programma che prenda in ingresso un valore reale x
// e un intero N e calcoli x^N come prodotto di N volte X usando
// una funzione.

using namespace std;
#include <iostream>

int potenza(int, int);

int main(){
  int x, n;
  cout << "Calcola x^n." << endl;

  cout << "Inserisci x: ";
  cin >> x;
  cout << "Inserisci n: ";
  cin >> n;

  cout << x << "^" << n << " = " << potenza(x, n) << endl;
  
  return 0;
}

int potenza (int x, int n){
  int res=1;

  for (int i=0; i<n; i++)
    res *=x;
  
  return res;
}
