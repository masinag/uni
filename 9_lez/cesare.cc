/*
  
 */

using namespace std;
#include <iostream>
#include <cstdlib>
#include <cstring>

const int LUNGHEZZA = 256;

int main(int argc, char * argv[]){
  char sorgente[LUNGHEZZA], dest[LUNGHEZZA];
  if(argc != 2){
    cout << "Richiesto un parametro!" << endl;
    exit(EXIT_FAILURE);
  }
  strncpy(sorgente, argv[1], LUNGHEZZA);
  caesar(destinazione, sorgente);
  cout << "Stringa codificata: " << destinazione << endl;
}
