/*
  Legge da un file di testo composto da piu' righe
  di numeri interi separati dal carattere ',', e che
  usi questi numeri per popolare una matrice di dimensione
  DIMxDIM.
 */

using namespace std;
#include <iostream>
#include <cstdlib>
#include <cstring>
#include <fstream>

const int DIM = 4;
const int LEN = 10;
const char DELIMITATORE = ',';

void stampaMatrice(const int m[][DIM]);

int main(int argc, char * argv[]){
  int m[DIM][DIM] = {};
  if(argc != 2){
    cerr << "E' richiesto un file di input." << endl;
    cerr << "Uso: ./a.out <fileinput>" << endl;
    exit(EXIT_FAILURE);
  }
  fstream in;

  in.open(argv[1], ios::in);
  
  if (in.fail()){
    cerr << "Il file " << argv[1] << " non esiste!" << endl;
    exit(EXIT_FAILURE);
  }

  char r[LEN];
  int row;
  int n;
  int col;
  while (in.getline(r, LEN)){
    col = 0;
    for(int i=0; i<strlen(r); i++){
      if (r[i] == DELIMITATORE){
	m[row][col] = atoi(r+i);
      } else if(r[i] == '\n') {
	row++;
      } else {
	col++;
      }
    }
  }
  cout << "STAMPO" << endl;
  stampaMatrice(m);
}

void stampaMatrice(const int m [][DIM]){
  for (int i=0; i<DIM; i++){
    for (int j=0; j<DIM; j++)
      cout << m[i][j] << " ";
    cout << endl;
  }
  
}
