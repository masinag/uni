using namespace std;
#include <iostream>
#include <cstdlib>

const int NSPECIE = 5;
enum Specie {FAGGIO, CILIEGIO, ABETE, NOCE, BETULLA};

struct Albero {
  Specie specie;
  int numero; // codice
};

Albero*** preparaGiardino(int dimX, int dimY);
void eliminaGiardino(Albero*** g, int dimX, int dimY);
void riempiGiardino(Albero***& g, int dimX, int dimY, int quanti[]);
void stampaGiardino(Albero*** g, int dimX, int dimY);

int main(int argc, char * argv[]){
  Albero*** giardino;
  // indica quanti esemplari per ogni specie (es. 3 faggi, ...)
  int quanti[NSPECIE] = {3,1,2,1,3};

  int dimX, dimY;

  do{
    cout << "Introdurre dimensione orizzontale (min 9)";
    cin >> dimX;
  } while (dimX < 9);

  do{
    cout << "Introdurre dimensione verticale (min 9)";
    cin >> dimY;
  } while (dimY < 9);

  giardino = preparaGiardino(dimX, dimY);
  riempiGiardino(giardino, dimX, dimY, quanti);
  stampaGiardino(giardino, dimX, dimY);
  eliminaGiardino(giardino, dimX, dimY);
}

Albero*** preparaGiardino(int dimX, int dimY){
  Albero*** giardino = new Albero**[dimX];
  for(int i=0; i<dimX; i++){
    giardino[i] = new Albero*[dimY];
    for(int j=0; j<dimY; j++)
      giardino[i][j] = NULL;
  }
  return giardino;
}

void eliminaGiardino(Albero*** g, int dimX, int dimY){
  for(int i=0; i<dimX; i++){
    for(int j=0; j<dimY; j++){
      delete g[i][j];
    }
    delete [] g[i];
  }
  delete [] g;
}

void riempiGiardino(Albero***& g, int dimX, int dimY, int quanti[]){
  srand(time(NULL));
  int r, c;
  for (int i=0; i<NSPECIE; i++){
    for (int j=0; j<quanti[i]; j++){
      do{
	r = rand() % dimX;
	c = rand() % dimY;
      } while (g[r][c] != NULL);
      g[r][c] = new Albero;
      g[r][c]->specie = Specie(i);
      g[r][c]->numero = i*10 + j;
    }
  }
}

void stampaGiardino(Albero*** g, int dimX, int dimY){
  for(int i=0; i<dimX; i++){
    for(int j=0; j<dimY; j++){
      if(g[i][j] != NULL){
	switch(g[i][j]->specie){
	case FAGGIO:   cout << "F "; break;
	case CILIEGIO: cout << "C "; break;
	case ABETE:    cout << "A "; break;
	case NOCE:     cout << "N "; break;
	case BETULLA:  cout << "B "; break;
	}
      }
      else
	cout << "* ";
    }
    cout << endl;
  }
}
