// Acquisito un intero n da tastiera, stampare
// a video n asterischi in obliquo destro usando
// la ricorsione.

using namespace std;
#include <iostream>
void stampa_obq(int n);
void asterischi_obliquo(int n, int spazi);
void stampa_spazi(int n);
int main(){
  int n;
  cout << "Quanti asterischi vuoi stampare? ";
  cin >> n;
  stampa_obq(n);
  return 0;
}

void stampa_obq(int n){
  asterischi_obliquo(n, 0);
}

void asterischi_obliquo(int n, int spazi){
  if (n>0){
    stampa_spazi(spazi);
    cout << "*" << endl;
    asterischi_obliquo(n-1, spazi+1);
  }
}

void stampa_spazi(int n){
  if (n > 0){
    cout << " ";
    stampa_spazi(n-1);
  }
}
