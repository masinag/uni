//
// Quarto programma.
// Programma che presi in input i valori interi della base
// e dell'altezza di un rettangolo e ne calcoli l'area.
//

#include <iostream> 
using namespace std;


int main()
{
  int base, altezza;
  float area;
  cout << "Inserisci base e altezza del trianglo (interi): ";
  cin >> base >> altezza;
  
  area = (base * altezza) / 2.0;
  cout << "Area del triangolo = " << area << endl;
 
  return (0);
}

