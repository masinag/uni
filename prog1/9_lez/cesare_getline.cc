/*
  
 */

using namespace std;
#include <iostream>
#include <cstdlib>
#include <cstring>

const int LUNGHEZZA = 20;

int main(int argc, char * argv[]){
  char sorgente[LUNGHEZZA], dest[LUNGHEZZA];

  cin.getline(sorgente, LUNGHEZZA);
  cout << sorgente << endl;
  
  ca(destinazione, sorgente);
  cout << "Stringa codificata: " << destinazione << endl;
}
