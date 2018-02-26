//
// Prendere in input un intero che corrisponde ai secondi
// se calcolare il numero di ore, minuti e secondi
// corrispondienti.
//

#include <iostream>
using namespace std;

int main(){
  int ore, min, sec;

  cout << "Inserisci i secondi: ";
  cin >> sec;

  ore = sec / 3600;

  sec %= 3600;

  min = sec / 60;

  sec %= 60;
  
  cout << "L'esperimento e' durato in totale " <<
    ore << " ore, " <<  sec << " secondi, " <<
    min << " minuti." << endl;
  
  return 0;
}
