//
// Secondo programma.
// Prende in input da tastiera due numeri interi,
// ne scambia il contenuto e li stampa a video.
//

#include <iostream> 
using namespace std;


int main()
{
  int a, b, c;
  cout << "Inserisci due numeri interi: ";
  cin >> a >> b;
  cout << "a = " << a << ", b = " << b << endl;
  
  cout << "Scambio..." << endl;
  
  c = a;
  a = b;
  b = c;
  cout << "a = " << a << ", b = " << b << endl;
 
  return (0);
}
