// Scrivere un programma che prenda in ingresso un valore reale x
// e un intero N e calcoli x^N come prodotto di N volte X.

using namespace std;
#include <iostream>

int main(){
  int potenza=1, x, n;
  cout << "Calcola x^n." << endl;

  cout << "Inserisci x: ";
  cin >> x;
  cout << "Inserisci n: ";
  cin >> n;

  for (int i=0; i<n; i++)
    potenza *= x;

  cout << x << "^" << n << " = " << potenza << endl;
  
  return 0;
}
