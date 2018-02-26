//
// Acquisire due interi a e b, stampare a video
// 1 se a e' il maggiore, 0 altrimenti.
//

#include <iostream>
using namespace std;

int main(){
  int a, b;
  bool condizione;
  
  cout << "Inserisci un intero: ";
  cin >> a;

  cout << "Inserisci un intero: ";
  cin >> b;

  condizione = (a > b);
  cout << condizione << endl;
  return 0;
}
