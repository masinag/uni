// * scrivere una procedura che prenda in ingresso un vettore v e la sua
//   dimensione d, un nuovo elemento x e un indice i, e aggiunga
//   l'elemento x in posizione i nel vettore, e incrementi d di uno.  Il
//   vettore passato deve avere almeno d+1 elementi.

// Esempio:
// v = [4 1 3 6 8],  d = 5, x = 7, i = 2 ===>
// v = [4 1 7 3 6 8], d = 6

using namespace std;
#include <iostream>

const int SIZE = 8;

void inserisci (int v[], int& dim, int x, int i);
void stampaArray(const int v[], int dim);
void sposta(int v[], int da, int a);

int main(){
  int v[SIZE] = {1, 2, 3, 4, 5, 6};
  int dim = 6, x = 4, i = 2;
  stampaArray(v, dim);
  //
  cout << "Inserisco " << x << " in posizione " << i << endl;
  inserisci(v, dim, x, i);
  stampaArray(v, dim);
  //
  x = 8;
  i = 8;
  cout << "Inserisco " << x << " in posizione " << i << endl;
  inserisci(v, dim, x, i);
  stampaArray(v, dim);
  //
  x = 8;
  i = 7;
  cout << "Inserisco " << x << " in posizione " << i << endl;
  inserisci(v, dim, x, i);
  stampaArray(v, dim);
  //
  x = 7;
  i = 0;
  cout << "Inserisco " << x << " in posizione " << i << endl;
  inserisci(v, dim, x, i);
  stampaArray(v, dim);
  return 0;
}

void inserisci(int v[], int& dim, int x, int i){
  if (dim < SIZE && i <= dim){
    sposta(v, dim, i);
    v[i] = x;
    dim += 1;
  } 
}

void sposta(int v[], int dim, int i){
  if (i < dim){
    v[dim] = v[dim-1];
    sposta(v, dim-1, i);
  }
}

void stampaArray(const int v[], int dim){
  cout << "[ ";
  for (int i=0; i<dim; i++)
    cout << v[i] << " ";
  cout << "]" << endl;
}

