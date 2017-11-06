// Calcola la media dei numeri presi in input in modo
// interattivo. Utilizza la ricorsione.

#include <iostream>
using namespace std;

void media(double somma, int passi);

int main(){
  media (0.0, 0);
  return 0;
}

void media(double somma, int passi){
  char risp;
  double n;

  cout << "Inserisci un numero reale: ";
  cin >> n;

  somma += n;
  passi += 1;
  cout << "La media dei numeri inseriti è: " << somma/passi << endl;
    
  cout << "Vuoi continuare? [s/n] ";
  cin >> risp;

  if(risp == 's'){
    media (somma, passi);
  }
  
}
