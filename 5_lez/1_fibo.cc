//
// Stampare a video i primi n numeri della serie di
// Fibonacci, n dato n in input da tastiera ( 1 1 2 3 5 8 ... )
//

#include <iostream>
using namespace std;

int main(){
  int n, fib=1, ultimo=1, penultimo=0;

  cout << "Inserisci n: ";
  cin >> n;

  for (int i=0; i<n; i++){
    cout << fib << " ";
    fib = ultimo + penultimo;
    penultimo = ultimo;
    ultimo = fib;
  }

  cout << endl;
  return 0;
}
