//
// Acquisire da tastiera un carattere,
// criptarlo, decriptarlo e stamparlo
// a video.
//

#include <iostream>
using namespace std;

int main(){
  char a;
  int conv;
  cout << "Inserisci un carattere: ";
  cin >> a;

  // cripto
  conv = a*3;

  cout << "Il carattere criptato e': " << char(conv) << endl;
  // decripto
  a = conv/3;
  
  cout << "Il carattere originario e': " << a << endl;

  return 0;
}
