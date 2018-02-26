// Calcola la n^m utilizzando la ricorsione

#include <iostream>
using namespace std;

long long potenza(int n, int m);

int main(){
  int n, m;
  cout << "Inserisci base ed esponente: ";
  cin >> n >> m;

  cout << n << "^" << m << " = " << potenza(n, m)  << endl;
  return 0;
}

long long potenza(int n, int m){
  long long res;
  if (m==0) res = 1;
  else res = n * potenza(n, m-1);
  return res;
}
