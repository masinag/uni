// versione iterativa della funzione ricorsiva per il calcolo di n!

using namespace std;
#include <iostream>

long long fatt (int n) 
{
  long long res = 1;
  for(int i=0; i<n; i++){
    res*=(n-i);
  }
  return res;
}

int main() 
{
  int n;
  cout << "n? ";
  cin >> n;
  cout << "fattoriale(" << n << ") = " << fatt(n) << endl;
return 0;
}

