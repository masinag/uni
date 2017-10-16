//
// Stampare a video i primi n numeri della serie di
// Fibonacci utilizzando una funzione, n dato n in
// input da tastiera ( 1 1 2 3 5 8 ... )
//

#include <iostream>
using namespace std;

void fibo(int);

int main(){
  int n;
  cout << "Inserisci n: ";
  cin >> n;
  fibo(n);
  return 0;
}

void fibo(int n){
  int fib=1, ultimo=1, penultimo=0;

  for (int i=0; i<n; i++){
    cout << fib << " ";
    fib = ultimo + penultimo;
    penultimo = ultimo;
    ultimo = fib;
  }
  cout << endl;
}

