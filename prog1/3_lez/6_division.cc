//
// Acquisire da tastiera due numeri reali,
// calcolare i quoziente CONTROLLANDO CHE SI
// POSSA FARE LA DIVISIONE e stampando a
// video il quoziente oppure un messaggio
// di errore.
//

#include <iostream>
using namespace std;

int main(){
  float a, b;

  cout << "Inserisci due numeri reali: ";
  cin >> a >> b;

  if (b!=0)
    cout << a << "/" << b << " = " << a/b << endl;
  else
    cout << "Impossibile dividere per zero!" << endl;

  return 0;
}
