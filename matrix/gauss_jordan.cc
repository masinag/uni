// Funzione che implementa l'algoritmo di Gauss-Jordan
// in maniera ricorsiva.

using namespace std;
#include <iostream>
#include <iomanip>
#include <fstream>
#include <cstdlib>

const int SIZE = 10;
const int LENGTH = 20;

void stampaMatrice(const double m[][SIZE], int rows, int cols);
void gauss_jordan (double m[][SIZE], int rows, int cols);
void gauss_jordan (double m[][SIZE], int rows, int cols, int row);
bool trovaPivot(double m[][SIZE], int rows, int cols, int row, int&r, int&c);
void scambia(double m[][SIZE], int cols, int r1, int r2);
void scambia(double& a, double& b);
void annullaColonna(double m[][SIZE], int rows, int cols, int row, int c);
void somma(double m[][SIZE], int cols, int r1, int r2, double lambda);
void leggiMatrice(int argc, char * argv[], double m[][SIZE], int& rows, int& cols);
void erroreFormato();

int main(int argc, char * argv[]){
  double m[SIZE][SIZE] = {};
  int rows, cols;
  leggiMatrice(argc, argv, m, rows, cols);
  stampaMatrice(m, rows, cols);
  gauss_jordan(m, rows, cols);
  cout << endl;
  stampaMatrice(m, rows, cols);
}

void stampaMatrice(const double m[][SIZE], int rows, int cols){
  for(int i=0; i<rows; i++){
    for (int j=0; j<cols; j++)
      cout << setw(4) << setprecision(2) <<  m[i][j] << " ";
    cout << endl;
  }

}

// wrapper
void gauss_jordan (double m[][SIZE], int rows, int cols){
  gauss_jordan(m, rows, cols, 0);
}

void gauss_jordan (double m[][SIZE], int rows, int cols, int row){
  int r, c;
  bool pivotTrovato = trovaPivot(m, rows, cols, row, r, c);
  if (pivotTrovato) {
    // stampaMatrice(m, rows, cols);
    scambia(m, cols, row, r);
    // cout << "Scambio " << row << " e " << r << endl;
    // stampaMatrice(m, rows, cols);

    annullaColonna(m, rows, cols, row, c);
    gauss_jordan(m, rows, cols, row+1);
  }
}

/*
  Cerca un pivot nella matrice m, dalla riga <row> in poi.
  Gli indici dell'elemento sono r e c; restituisce true o false
  a seconda che sia presente un pivot o meno.
 */
bool trovaPivot(double m[][SIZE], int rows, int cols, int row, int&r, int&c){
  bool pivotTrovato = false;
  for(c = 0; c < cols && !pivotTrovato; c++){
    for(r = row; r < rows && !pivotTrovato; r++)
      pivotTrovato = m[r][c] != 0;
  }
  r--, c--;
  return pivotTrovato;
}

// Scambia due righe di una matrice
void scambia(double m[][SIZE], int cols, int r1, int r2){
  if (r1 != r2){
    for(int i=0; i<cols; i++)
      scambia(m[r1][i], m[r2][i]);
  }
}

void scambia(double& a, double&b){
  int c = a;
  a = b;
  b = c;
}

// Annulla gli elementi della colonna c, a partire dalla riga <row + 1>
// effettuando operazioni elementari Eij(mu)
void annullaColonna(double m[][SIZE], int rows, int cols, int row, int c){
  for (int r = row+1; r < rows; r++){
    // cerr << "Sommo alla riga " << r << " la riga " << row
    //	    << " moltiplicata per " << -m[r][c]/(m[row][c]) << endl;
    somma(m, cols, r, row, -m[r][c]/(m[row][c]));
  }
}

// Somma alla riga r1, lambda*r2
void somma(double m[][SIZE], int cols, int r1, int r2, double lambda){
  for (int c=0; c < cols; c++){
    m[r1][c] += m[r2][c]*lambda;
  }
}

// legge una matrice dal file passato come parametro dalla linea di comando
void leggiMatrice(int argc, char * argv[], double m[][SIZE], int& rows, int& cols){
  
  if (argc < 2){
    cout << "Utilizzo: ./a.out <nomefile>" << endl;
    exit(0);
  }
  fstream file;
  file.open(argv[1], ios::in);
  if(file.fail()){
    cout << "Il file " << argv[1] << " non esiste!" << endl;
    exit(0);
  }
  file >> rows >> cols;
  if (file.fail()){
    erroreFormato();
    exit(0);
  } else if (rows > SIZE || cols > SIZE || rows <=0 || cols <= 0){
    cout << "Dimensioni " << rows << ", " << cols << " non valide. "
	 << "Dimensione massima: " << SIZE << ", " << SIZE << endl;
    exit(0);
  }

  char el[LENGTH];
  int r = 0, c = 0;
  
  while(r<rows && file >> el){
    cout << "Read " << el << endl;
    if (c >= cols){
      c = 0; r+=1;
    }
    if (r < rows) {
      m[r][c] = atof(el);
      c++;
    }
  }
  file.close();
  
}

void erroreFormato(){
  cerr << "Errore! Formato richesto: " << endl;
  cerr << "righe colonne" << endl;
  cerr << "<elementi prima   riga separati da uno spazio>" << endl;
  cerr << "<elementi seconda riga separati da uno spazio>" << endl;
  cerr << "..." << endl;
}
