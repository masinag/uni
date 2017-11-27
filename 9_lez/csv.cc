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
const int LEN = 11;
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

  char riga[LEN];
  char parola[LEN];
  int row=0;
  int col;
  int j=0;
  in.getline(riga, LEN);
  while (!in.eof() && row < DIM){
    cout << "PERA" << endl;
    col = 0;
    cerr << riga << endl;
    cerr << "row: " << row <<endl;
    for(int i=0; i<strlen(riga) && col<DIM; i++){
      cerr << "//"<<endl;
      if(riga[i] == DELIMITATORE){
	parola[j] = '\0';
	cerr << "Writing " << parola << " into m[" << row << "]["<<col<<"]"<<endl;
	m[row][col++] = atoi(parola);
	j=0;
      } else {
	parola[j++] = riga[i];
      }
    }
    row++;
    if(col<DIM){
      cerr << row << ", " << col << endl;
      parola[j]='\0';
      m[row][col] = atoi(parola);
      j=0;
    }
    in.getline(riga, LEN);
  }
  stampaMatrice(m);
}

void stampaMatrice(const int m [][DIM]){
  for (int i=0; i<DIM; i++){
    for (int j=0; j<DIM; j++)
      cout << m[i][j] << " ";
    cout << endl;
  }
  
}
