using namespace std;
#include <iostream>
#include <cstdlib>
#include "carte.h"

int main(int argc, char* argv[]){
  carta m[dim];
  preparaMazzo(m);
  queue q;
  init(q);
  mescolaMazzo(q, m);
  if(argc != 2)
    exit(EXIT_FAILURE);
  int n = atoi(argv[1]);
  carta c;
  for(int i=0; i<n; i++){
    first(c, q);
    stampa(c);
    dequeue(q);
  }  
}
