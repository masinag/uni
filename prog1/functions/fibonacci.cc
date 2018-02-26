// 1) scrivere un programma che calcoli i primi 20 numeri della 
// successione di fibonacci usando una funzione:

// F0=0;
// F1=1;
// F_n = F_{n-1}+F_{n-2}

#include <iostream>
#include <iomanip>
using namespace std;

void fibonacci(int);

int main(){
  fibonacci(20);

  return 0;
}


void fibonacci(int n){
  int i=0, penultimo=0, ultimo=1, fib=0;

  do {
    penultimo = ultimo;
    ultimo = fib;
    fib = penultimo + ultimo;
    cout << setw(2) << i+1 << ". " << fib << endl;
    i++;
  } while (i<n);
  
}
