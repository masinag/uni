//
// Dato un numero intero da tastiera, verifica se
// questo numero e' primo tramite una funzione ricorsiva con
// questa dichiarazione:
// bool verifica_primo(int);
//

using namespace std;
#include <iostream>
#include <cmath>

bool verifica_primo(int);
bool verifica_primo(int n, int div); 

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
  return verifica_primo(n, 2);
}

bool verifica_primo(int n, int div){
  bool res;
  if (div > sqrt(n))
    res = true; // ho controllato tutti i divisori
  else if (n%div == 0)
    res = false; // ho trovato un divisore
  else{
    div += (div>2) ? 2 : 1;
    res = verifica_primo(n, div);
  }
  return res;
}
