//
// Acquisire da tastiera un carattere minuscolo,
// convertirlo in maiuscolo e stamparlo a video.
//

#include <iostream>
using namespace std;

int main(){
  char a;
  cout << "Inserisci un carattere minuscolo: ";
  cin >> a;	
  
  cout << "Il carattere maiuscolo e': " << char(a+('A'-'a')) << endl;

  return 0;
}
