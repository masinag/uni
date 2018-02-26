using namespace std;

#include <cstdlib>
#include <iostream>
#include "giardino.h"

Albero*** preparaGiardino(int rows, int cols){
  Albero*** giardino = new Albero**[rows];
  for(int i=0; i<rows; i++){
    giardino[i] = new Albero*[cols];
    for(int j=0; j<cols; j++)
      giardino[i][j] = NULL;
  }
  return giardino;
}

void eliminaGiardino(Albero*** g, int rows, int cols){
  for(int i=0; i<rows; i++){
    for(int j=0; j<cols; j++){
      delete g[i][j];
    }
    delete [] g[i];
  }
  delete [] g;
}

void riempiGiardino(Albero***& g, int rows, int cols, int quanti[]){
  srand(time(NULL));
  int r, c;
  for (int i=0; i<NSPECIE; i++){
    for (int j=0; j<quanti[i]; j++){
      do{
	r = rand() % rows;
	c = rand() % cols;
      } while (g[r][c] != NULL);
      g[r][c] = new Albero;
      g[r][c]->specie = Specie(i);
      g[r][c]->numero = i*10 + j;
    }
  }
}

void stampaGiardino(const Albero* const* const* g, int rows, int cols){
  for(int i=0; i<rows; i++){
    for(int j=0; j<cols; j++){
      if(g[i][j] != NULL){
	cout << iniziali_specie[g[i][j]->specie] << " ";
      }
      else
	cout << "* ";
    }
    cout << endl;
  }
}
