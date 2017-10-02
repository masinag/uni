//
// Quinto programma.
// Programma che presi in input i valori interi di base
// maggiore, base minore e altezza di un trapezio ne calcoli l'area.
//

#include <iostream> 
using namespace std;


int main()
{
  int baseMag, baseMin, altezza;
  float area;
  
  cout << "* Inserisci la base maggiore del trapezio: ";
  cin >> baseMag;

  cout << "* Inserisci la base minore del trapezio: ";
  cin >> baseMin;

  cout << "* Inserisci l'altezza del trapezio: ";
  cin >> altezza;
  
  area = (baseMag + baseMin) * altezza / 2.0;
  cout << endl << "Area del trapezio = " << area << endl;
 
  return (0);
}

