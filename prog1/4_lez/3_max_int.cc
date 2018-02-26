// Trovare il massimo tra 10 interi inseriti
// da tastiera

using namespace std;
#include <iostream>

int main(){
  int n, max;

  for (int i=0; i<10; i++){      
    cout << "Inserisci un numero: ";

    if (i==0) cin >> max;
    else cin >> n;

    max = (n > max) ? n : max;
  }

  cout << "Il numero massimo inserito e': " << max << endl;
  return 0;
}
