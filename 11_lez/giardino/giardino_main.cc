using namespace std;

#include <iostream>
#include "giardino.h"

int main(int argc, char * argv[]){
  Albero*** giardino;
  // indica quanti esemplari per ogni specie (es. 3 faggi, ...)
  int quanti[NSPECIE] = {3,1,2,1,3};

  int rows, cols;

  do{
    cout << "Introdurre dimensione orizzontale (min 9)";
    cin >> cols;
  } while (cols < 9);

  do{
    cout << "Introdurre dimensione verticale (min 9)";
    cin >> rows;
  } while (rows < 9);

  giardino = preparaGiardino(rows, cols);
  riempiGiardino(giardino, rows, cols, quanti);
  stampaGiardino(giardino, rows, cols);
  eliminaGiardino(giardino, rows, cols);
}
