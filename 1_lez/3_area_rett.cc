//
// Terzo programma.
// Programma che presi in input i valori interi della base
// e dell'altezza di un rettangolo e ne calcoli l'area.
//

#include <iostream> 
using namespace std;


int main()
{
  int base, altezza, area;
  cout << "Inserisci base e altezza del rettangolo (interi): ";
  cin >> base >> altezza;
  
  area = base * altezza;
  cout << "Area del rettangolo = " << area << endl;
 
  return (0);
}

