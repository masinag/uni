//
// Prendere in input il prezzo di un bene e stampare
// a video il prezzo compresivo di IVA al 22%.
//

#include <iostream>
using namespace std;

int main(){
  float prezzo;
  float prezzoConIva;
  
  cout << "Inserisci il prezzo (in €): ";
  cin >> prezzo;

  prezzoConIva = prezzo + (22 * prezzo)/100;
  cout << "Prezzo con IVA: " << prezzoConIva << "€"  << endl;

  return 0;
}
