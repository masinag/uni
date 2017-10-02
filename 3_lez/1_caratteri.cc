//
// Acquisire da tastiera un carattere e stamparlo
// a video + inizializzare una variabile di tipo
// carattere e stamparla a video
//

#include <iostream>
using namespace std;

int main(){
  char a, b;
  cout << "Inserisci un carattere: ";
  cin >> a;
  cout << "Il carattere inserito e': " << a << endl;

  b = 't';
  cout << "Variabile inizializzata: " << b << endl;
  return 0;
}
