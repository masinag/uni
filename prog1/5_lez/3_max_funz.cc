//
// Acquisire da tastiera due numeri reali, 
// calcolare il massimo tra questi due numeri
// e stamparlo a video.
//

#include <iostream>
using namespace std;

float massimo(float, float);

int main(){
  float a, b, max;

  cout << "Inserisci due numeri reali: ";
  cin >> a >> b;

  max = massimo(a, b);
  cout << "Il massimo tra " << a << " e " << b
       << " e' " << max << endl;
  return 0;
}

float massimo(float a, float b){
  float max = a;
  if (b>max) max=b;
  return max;
}
