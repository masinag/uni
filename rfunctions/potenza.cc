// Programa che calcola in modo ricorsivo la potenza di un numero
using namespace std;
#include <iostream>

int potenza(int x, int n);

int main(){
  int x, n;
  cout << "Inserisci base ed esponente: ";
  cin >> x >> n;
  cout << x << "^" << n << " = " << potenza(x, n) << endl;
  return (0);
}

int potenza(int x, int n){
  int res;
  if ( n == 0 || x == 1 )
    res = 1;
  else if (x == 0)
    res = 0;
  else
    res = x * potenza(x, n-1);

  return res;

}
