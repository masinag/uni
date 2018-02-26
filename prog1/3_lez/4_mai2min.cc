//
// Acquisire da tastiera un carattere maiuscolo,
// convertirlo in minuscolo e stamparlo a video.
//

#include <iostream>
using namespace std;

int main(){
  char a;
  cout << "Inserisci un carattere maiuscolo: ";
  cin >> a;
  
  cout << "Il carattere minuscolo e': " << char(a-('A'-'a')) << endl;

  return 0;
}
