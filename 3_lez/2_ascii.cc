//
// Acquisire da tastiera un carattere e stampare
// a video la sua codifica ascii.
//

#include <iostream>
using namespace std;

int main(){
  char a;
  int i;
  cout << "Inserisci un carattere: ";
  cin >> a;	
  
  i=a;
  cout << "La sua codifica ascii e': " << i << endl;

  return 0;
}
