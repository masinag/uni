// versione iterativa
using namespace std;
#include <iostream>


void stampa (int n) {
  for (int i=0; i<=n; i++){
    cout << i << " ";
  }
  cout << endl;
}

int main() 
{
  int n;
  cout << "n? ";
  cin >> n;
  cout << "stampanumeri(" << n << ") = \n";
  stampa(n);
return 0;
}

