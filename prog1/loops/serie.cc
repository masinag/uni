// Scrivere un programma che prenda in ingresso un valore reale x 
// e calcoli (un'approssimazione del)la serie
//
// Somma_i (-1)^i 1/(x^i)


using namespace std;

#include <iostream>
#include <cmath>


int main(){
  int somma=0, n;
  double x;

  cout << ("Inserisci un valore reale di x: ");
  cin  >> x;

  cout << ("Numero di iterazioni: ");
  cin  >> n;

  for (int i=0; i<n; i++){
    somma += pow(-1, i) / pow(x, i);
  }

  cout << somma << endl;
  
  return 0;
}
