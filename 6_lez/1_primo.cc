//
// Dato un numero intero da tastiera, verifica se
// questo numero e' primo tramite una funzione con
// questa dichiarazione:
// bool verifica_primo(int);
//

using namespace std;
#include <iostream>
#include <cmath>

bool verifica_primo(int);

int main(){
  int n;
  cout << "Inserisci un numero intero: ";
  cin >> n;

  if (verifica_primo(n)){
    cout << "Il numero e' primo" << endl;
  } else {
    cout << "Il numero non e' primo" << endl;
  }
  return 0;
}

bool verifica_primo(int n){
  bool divisore_trovato = false;
  int divisore = 2;
  if (n==1){
    divisore_trovato = true;
  } else {
    while (!divisore_trovato && divisore <= sqrt(n)){
      if (n%divisore == 0){
	divisore_trovato = true;
      } else {
	divisore += (divisore==2) ? 1 : 2;
      }
    }
  }

  return !divisore_trovato;
}
