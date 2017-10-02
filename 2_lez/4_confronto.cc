//
// Prendere in input 3 variabili di tipo intero a, b, c
// e stampare a video 1 se a e' il maggiore, 0 altrimenti.
// Senza usare cicli e if.
//

#include <iostream>
using namespace std;

int main(){
  int a, b, c;
  bool res;
  cout << "Inserisci tre numeri: ";
  cin >> a >> b >> c;

  res = (a >= b) && (a >= c);
  cout << res << endl;

  return 0;
}
