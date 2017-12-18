using namespace std;
#include <iostream>
#include "lotto.h"
#include <cstdlib>

void inizializza(queue& q){
  init(q);
  int n[NUMERI];
  preparaNumeri(n);
  mescolaNumeri(q, n);
}

int main(int argc, char* argv[]){
  if(argc < 1){
    cout << "E' richiesta almeno una ruota!"<< endl;
    exit(EXIT_FAILURE);
  }
  queue* qq  = new qq[argc]-1;
  for(int i=0; i< argc-1; i++){
    qq[i] = new queue;
    inizializza(qq[i]);
  }

  for (int i=1; i<argc; i++){
    cout << argv[i] << ": " << endl;
    for(int j=0; j<NUMERI; j++){
      cout << first(q[i-1]);
    }
  }
  
}
