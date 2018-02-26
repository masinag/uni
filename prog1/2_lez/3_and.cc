//
// Stampa a video la tabella di verita' dell'operatore AND.
// Senza usare cicli e if.
//

#include <iostream>
using namespace std;

int main(){
  bool a, b, res;
  a = b = true;

  res = (a && b);
  cout << a << " and " << b << " = " << res <<  endl;

  b = false;
  res = (a && b);
  cout << a << " and " << b << " = " << res << endl;

  a = false;
  b= true;
  res = (a && b);
  cout << a << " and " << b << " = " << res << endl;

  b = false;
  res = (a && b);
  cout << a << " and " << b << " = " << res << endl;

  return 0;
}
