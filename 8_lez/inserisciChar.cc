// dati 2 array a e b, restituisce un array c
// nella forma c={a1,b1, a2, b2, ...}

#include <iostream>
using namespace std;

const int DIM = 5;

void stampaArray(const char a[], int dim);
bool inserisci (char array[], int& dim, int elemento);

int main(){
  char comando, elemento;
  bool spazioEsaurito = false;
  char array[DIM]={};
  int dim=0;
  do {
    cout << "Inserisci: i per inserire un carattere: " << endl;
    cin >> comando;

    switch(comando){
    case 'I': case 'i':
      cout << "Inserisci un carattere: ";
      cin >> elemento;
      if (!inserisci(array, dim, elemento)){
	cout << "Non c'è più spazio nell'array" << endl;
	spazioEsaurito = true;
      }
    }
    cout << dim;
    stampaArray(array, dim);
  } while (!spazioEsaurito);
  stampaArray(array, dim);
}


void stampaArray(const char a[], int dim){
  cout << "[ ";
  for(int i=0; i<dim; i++)
    cout << a[i] << " ";
  cout << "]" << endl;

}

bool inserisci (char a[], int& dim, int elemento){
  bool res = false;
  if (dim < DIM){
    int i=0;
    while (a[i] <= elemento) i++;
    dim++;
    for (int j=i; j<dim-1; j++)
      a[j+1] = a[j];
    a[i] = elemento;
    res = true;
  }
  return res;
}
