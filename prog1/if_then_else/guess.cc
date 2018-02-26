//
// 4) Scrivere un programma che "indovini" un numero tra 0 e 7
// facendo una serie di domande del tipo "s/n" all'utente. 

#include <iostream>
using namespace std;

int main(){
  char risp;
  int numero;
  cout << "Rispondi alle domande con s/n" << endl;
  cout << "Pensa ad un numero tra 0 e 7..." << endl;
  cout << "E' 4? ";
  cin >> risp;
  if (risp=='s') {
    numero = 4;
  } else {
    cout << "E' minore di 4? ";
    cin >> risp;
    if (risp == 's') {
      cout << "E' 2? ";
      cin >> risp;
      if (risp == 's'){
	numero = 2;
      } else {
	cout << "E' minore di 2? ";
	cin >> risp;
	if (risp == 's') {
	  cout << "E' 1? ";
	  cin >> risp;
	  numero = (risp == 's') ? 1 : 0;
	} else {
	  numero = 3;
	}
      }
    } else {
      cout << "E' 6? ";
      cin >> risp;
      if (risp == 's'){
	numero = 6;
      } else {
	cout << "E' minore di 6? ";
        cin >> risp;
	numero = (risp == 's') ? 5 : 7;
      }
    }
  }
  cout << "Il numero che hai pensato è " << numero << endl;
}
