// Trovare il massimo tra un numero non noto a priori
// di interi inseriti da tastiera

using namespace std;
#include <iostream>

int main(){
  int i=0, n, max;
  cout << "Inserisci un numero: ";
  while (cin >> n){
    if (i>0){
      max = (n>max) ? n : max;
    } else {
      max = n;
      i++;
    }
    cout << "Inserisci un numero: ";
  }
  cout << "Il numero massimo inserito e': " << max << endl;
  return 0;
}
