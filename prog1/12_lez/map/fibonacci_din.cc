/*
  Definire la funzione ricorsiva "fibonacci" che riceve in ingresso
  un intero e un puntatore ad un array dinamico di interi,
  e ritorna l'n-esimo numero della serie di Fibonacci.

  Completare la main con l'invocazione della funzione e
  la dichiarazione e l'inizializzazione dell'array dinamico.

  Utilizzare la struttura Map per rendere piu' efficiente
  l'algoritmo.
*/

#include <iostream>
#include "map.h"

using namespace std;

int fibonacci(int, Map&);

int main(int argc, char* argv[]) {
  int n;
  cout << "Calcolo dell'n-esimo numero di Fibonacci.\n";
  cout << "n = ";
  // Test di controllo sull'input
  do {
    cin >> n;
    if(n < 1) {
      cout << "Introdurre un numero positivo.\nn = ";
    }
  } while(n < 1);
  // Allocazione dinamica nuovo array,
  // con i valori tutti inizializzati a 0
  Map fib;
  init(fib, n);
  cout << "F(n) = " << fibonacci(n, fib) << endl;
  deinit(fib);
}

int fibonacci(int n, Map& cache) {
  int ris = 0;
  // n deve essere positivo; in tutti gli altri casi,
  // F(n) ritorna 0 (e non accedo alla cache)
  if(n > 0) {
    // L'ho gia' calcolato?
    if(get(cache, n - 1) > 0) {
      // Lo impiego (cache hit)
      ris = get(cache, n - 1);
    } else {
      // Lo calcolo (cache miss)
      switch(n) {
        case 1:
        case 2:
          set(cache,n - 1, 1);
          break;
        default:
          set(cache, n - 1,fibonacci(n - 1, cache) + fibonacci(n - 2, cache));
      }
      // Ritorno quanto trovato
      ris = get(cache, n - 1);
    }
  }
  return ris;
}
