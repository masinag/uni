// 1) scrivere un programma che calcoli i primi 20 numeri della 
// successione di fibonacci:

// F0=0;
// F1=1;
// F_n = F_{n-1}+F_{n-2}

#include <iostream>
#include <iomanip>
using namespace std;

int main(){
  int penultimo=0, ultimo=1, fib=0;

  for (int i=0; i<20; i++){
    penultimo = ultimo;
    ultimo = fib;
    fib = penultimo + ultimo;
    cout << setw(2) << i+1 << ". " << fib << endl;
  }
  

  return 0;
}
