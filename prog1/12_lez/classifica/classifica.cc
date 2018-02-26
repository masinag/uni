/*
  Riceve un ingresso uno o piu' parametri, di cui il primo
sia un nr. intero. Classifica tutti i parametri dopo il primo in due
gruppi, in base alla loro lunghezza: piu' lunghi o piu'corti/uguali
rispetto al numero di cui sopra. Stampa i due gruppi separatamente.
 */

using namespace std;
#include <iostream>
#include <cstdlib>
#include <cstring>
#include "struct_queue.h"

int main(int argc, char * argv[]){
  queue l, s;
  if (argc < 3){
    cout << "Troppo pochi argomenti" << endl;
    exit(0);
  }
  int n = atoi(argv[1]);

  init(l);
  init(s);

  for(int i=2; i<argc; i++){
    if(strlen(argv[i])<n)
      enqueue(argv[i], s);
    else
      enqueue(argv[i], l); 
  }

  cout << "Stringhe più lunghe: " << endl;
  print(l);

  cout << endl << "Stringhe più corte: " << endl;
  print(s);
  
}
