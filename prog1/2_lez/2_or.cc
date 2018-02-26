//
// Stampa a video la tabella di verita' dell'operatore OR.
// Senza usare cicli e if.
//

#include <iostream>
using namespace std;

int main(){
  bool a, b, res;
  a = b = true;

  res = (a || b);
  cout << a << " or " << b << " = " << res <<  endl;

  b = false;
  res = (a || b);
  cout << a << " or " << b << " = " << res << endl;

  a = false;
  b= true;
  res = (a || b);
  cout << a << " or " << b << " = " << res << endl;

  b = false;
  res = (a || b);
  cout << a << " or " << b << " = " << res << endl;
}
