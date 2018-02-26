// dati 2 array a e b, restituisce un array c
// nella forma c={a1,b1, a2, b2, ...}

#include <iostream>
using namespace std;

bool leggiDim(int& n);
void leggiArray   (int a[], int n);
void stampaArray  (int a[], int n);
void mescolaArray (int a[], int b[], int c[], int n);

const int DIM = 100;

int main(){
  int n;
  int a[DIM];
  int b[DIM];
  if (leggiDim(n)){
    cout << "Array a: " << endl;
    leggiArray(a, n);
    cout << "Array b: " << endl;
    leggiArray(b, n);

    int c[2*n];
    mescolaArray(a, b, c, n);
    stampaArray(c, 2*n);
  } else {
    cout << "Dimensione non valida!" << endl;
  }
}

bool leggiDim(int& n){
  bool res = true;
  cout << "Inserisci la dimensione dell'array [massimo " << DIM << "] ";
  cin >> n;
  if (n>DIM) res = false;
  return res;
}

void leggiArray(int a[], int n){
  for (int i=0; i<n; i++){
    cout << ">> ";
    cin >> a[i];
  }
}

void stampaArray(int a[], int n){
  cout << "[ ";
  for (int i=0; i<n; i++)
    cout << a[i] << " ";
  cout << "]" << endl;
}

void mescolaArray(int a[], int b[], int c[], int n){
  int j = 0;
  for (int i=0; i<n; i++){
    c[j++] = a[i];
    c[j++] = b[i];
  }
}
