//
// Prendere in input il valore della temperatura
// in gradi F e convertirla in C.
// C= (F-32) * 1.8
//

#include <iostream>
using namespace std;

int main(){
  float tempC, tempF;

  cout << "Inserisci la temperatura in gradi Fahreneit: ";
  cin >> tempF;
  tempC = (tempF-32) / 1.8;

  cout << tempF << " gradi Fahreneit sono " <<
          tempC << " gradi Celsius" << endl;
  
  
  return 0;
}
