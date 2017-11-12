// versione iterativa
using namespace std;
#include <iostream>

bool pari(int n);
bool dispari(int n);

bool pari(int n) {
  bool ris= true;
  while(n>0){
    ris = !ris;
    n--;
  }
  return ris;
}


int main() 
{
  int n;
  cout << "n? ";
  cin >> n;
  if (n>=0) 
    cout << n << " e` " << (pari(n) ? "pari" : "dispari") << endl;
  else
    cout << n << " e` minore di zero" << endl;
return 0;
}

