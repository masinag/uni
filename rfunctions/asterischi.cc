// Acquisito un intero n da tastiera, stampare
// a video n asterischi in orizzontale utilizzando
// la ricorsione.

using namespace std;
#include <iostream>

void stampa_asterischi(int n);

int main(){
  int n;
  cout << "Quanti asterischi vuoi stampare? ";
  cin >> n;
  stampa_asterischi(n);
  return 0;
}

void stampa_asterischi(int n){
  if (n==0)
    cout << endl;
  else {
    cout << "*";
    stampa_asterischi(n-1);
  }
}
