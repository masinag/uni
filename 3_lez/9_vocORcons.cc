//
// Acquisire da tastiera un carattere MAIUSCOLO, stampare
// a video se e' vocale o consonante.
//

#include <iostream>
using namespace std;

int main(){
  char c;

  cout << "Inserisci un carattere maiuscolo: ";
  cin >> c;

  switch(c){
  case 'A':
  case 'E':
  case 'I':
  case 'O':
  case 'U': cout << "Il carattere è una vocale" << endl; break;
  default: cout  << "Il carattere è una consonante" << endl;
  }
  
  return 0;
}
