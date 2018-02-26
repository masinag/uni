using namespace std;
#include <iostream>
#include <cstdlib>

const int NSPECIE = 5;
enum Specie {FAGGIO, CILIEGIO, ABETE, NOCE, BETULLA};
const char iniziali_specie[NSPECIE]={'F', 'C', 'A', 'N', 'B'};

struct Albero {
  Specie specie;
  int numero; // codice
};

Albero*** preparaGiardino(int rows, int cols);
void eliminaGiardino(Albero*** g, int rows, int cols);
void riempiGiardino(Albero***& g, int rows, int cols, int quanti[]);
void stampaGiardino(const Albero* const* const* g, int rows, int cols);

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
