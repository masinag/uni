// Scrivere hello fino a quando l'utente lo vuole

using namespace std;
#include <iostream>

int main(){
  char risp;

  do{
    cout << "Hello" << endl;
    cout << "Stampare ancora? [s/n] ";
    cin >> risp;
  } while (risp == 's');
  

  return 0;
}
