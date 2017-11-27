/*
  Acquisito dal'utente un numero di anni, genera in
  maniera casuale statistiche mese per mese relative
  a un certo indicatore, per tutti gli anni considerati.
Calcola e stampa òa media dei valori su ciascun anno per
ogni mese. Valori compresi tra [50, 100).

 */

using namespace std;
#include <iostream>
#include <cstdlib>

const int NMESI = 12;
const int MIN_RAND = 50;
const int MAX_RAND = 100;

void stampaMatrice(int** mat, int r, int c);
double media(int** mat, int r, int c);
void dealloca(int** mat, int n);
int main(){
  int** anni;
  int n;

  srand(time(NULL));
  cout << "Numero di anni: ";
  cin >> n;
  anni = new int*[n];

  for (int i=0; i<n; i++){
    anni[i] = new int[NMESI];
    for (int j=0; j<NMESI; j++)
      anni[i][j] = rand() % (MAX_RAND-MIN_RAND) + MIN_RAND;
  }

  stampaMatrice(anni, n, NMESI);

  double m = media(anni, n, NMESI);
  cout << "La media delle temperature e' " << m << endl;
  
  dealloca(anni, n);
  return 0;
  
}

void stampaMatrice(int** mat, int r, int c){
  for (int i=0; i<r; i++){
    cout << "[ ";
    for (int j=0; j<c; j++)
      cout << mat[i][j] << " ";
    cout << "]" << endl;
  }
}

double media(int** mat, int r, int c){
  double res=0;
  for(int i=0; i<r; i++)
    for(int j=0; j<c; j++)
      res += mat[i][j];
  res /= (r*c);
  return res;
}

void dealloca(int** mat, int n){
  for(int i=0; i<n; i++)
    delete[] mat[i];
  delete[] mat;
}
