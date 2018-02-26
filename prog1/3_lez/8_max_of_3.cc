//
// Acquisire da tastiera tre numeri reali, stampare
// a video il massimo tra i tre reali inseriti.
//

#include <iostream>
using namespace std;

int main(){
  float a, b, c, max;

  cout << "Inserisci tre numeri reali: ";
  cin >> a >> b >> c;

  max = a;
  
  if (b>max)
    max=b;
  else if (c>max)
    max=c;

  cout << "Il massimo e': " << max <<  endl;
  
  return 0;
}
