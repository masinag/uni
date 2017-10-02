//
// Prendere in input 3 interi che corrispondono alle ore,
// minuti e secondi di un esperimento e calcolare il totale
// dei secondi.
//

#include <iostream>
using namespace std;

int main(){
  int ore, min, sec, totSec;

  cout << "Inserisci le ore: ";
  cin >> ore;

  cout << "Inserisci i minuti: ";
  cin >> min;
  
  cout << "Inserisci i secondi: ";
  cin >> sec;
  
  totSec = 3600 * ore + 60 * min + sec;
  cout << "L'esperimento e' durato in totale " <<
          totSec << " secondi." << endl;
  
  return 0;
}
