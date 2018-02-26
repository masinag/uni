// dati 2 array a e b, restituisce un array c
// nella forma c={a1,b1, a2, b2, ...}

#include <iostream>
using namespace std;

bool leggiDim(int& n);
int* leggiArray   (int& n);
void stampaArray  (int a[], int n);
void mescolaArray (int a[], int b[], int c[], int n, int m);
int min(int n, int m);

const int DIM = 100;

int main(){
  int *a, *b, *c;
  int n, m;

  a = leggiArray(n);
  b = leggiArray(m);

  c = new int[m+n];
  mescolaArray(a, b, c, n, m);
  stampaArray(c, m+n);
  return 0;
}

int* leggiArray(int& n){
  cout << "Inserisci la dimensione dell'array: ";
  cin >> n;
  int*a = new int[n];
  for (int i=0; i<n; i++){
    cout << ">> ";
    cin >> a[i];
  }
  return a;
}

void stampaArray(int a[], int n){
  cout << "[ ";
  for (int i=0; i<n; i++)
    cout << a[i] << " ";
  cout << "]" << endl;
}

int min(int n, int m){
  return (m<n) ? m : n;
}

void mescolaArray (int a[], int b[], int c[], int n, int m){
  int j=0;
  int i;
  for (i=0; i<min(n, m); i++){
    c[j++] = a[i];
    c[j++] = b[i];
  }

  if (i == m)
    for(; i<n; i++)
      c[j++] = a[i];
  else
    for(; i<m; i++)
      c[j++] = b[i];
 
}
