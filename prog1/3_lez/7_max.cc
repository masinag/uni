//
// Acquisire da tastiera due numeri reali, stampare
// a video il massimo tra i due reali inseriti.
//

#include <iostream>
using namespace std;

int main(){
  float a, b;

  cout << "Inserisci due numeri reali: ";
  cin >> a >> b;

  if (a >= b)
    cout << "Il maggiore e'" << a << endl;
  else
    cout << "Il maggiore e'" << b << endl;
  
  // cout << ((a>=b) ? a : b) << endl;
  
  return 0;
}
