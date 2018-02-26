// dati 2 array a e b, restituisce un array c
// nella forma c={a1,b1, a2, b2, ...}

#include <iostream>
using namespace std;

const int DIM = 15;

void stampaArray(const char a[], int dim);
bool inserisci (char array[], int& dim, int elemento);
int trovaPos (char a[], int dim, char el);
int trovaPos(char a[], int start, int end, char el);


int main(){
  char comando, elemento;
  bool spazioEsaurito = false;
  char array[DIM]={};
  int dim=0;
  cout << ">> i per inserire un carattere nell'array" << endl;
  do {
    // cout << ">> ";
    // cin >> comando;
    comando = 'i';
    switch(comando){
    case 'I': case 'i':
      cout << "Carattere: ";
      cin >> elemento;
      if (!inserisci(array, dim, elemento)){
	cout << "Non c'è più spazio nell'array" << endl;
	spazioEsaurito = true;
      }
    }
    stampaArray(array, dim);
  } while (!spazioEsaurito);;
}


void stampaArray(const char a[], int dim){
  cout << "[ ";
  for(int i=0; i<dim; i++)
    cout << a[i] << " ";
  cout << "]" << endl;

}

bool inserisci (char a[], int& dim, int elemento){
  bool elementoInserito = false;
  // se posso inserire l'elemento
  if(dim < DIM){
    // cerco la posizione in cui inserirlo
    int i = trovaPos(a, dim, elemento);
    
    dim++;
    cerr << "Inserting " << elemento << " in pos " << i << endl;
    for(int j=dim-1; j>i; j--)
      a[j] = a[j-1];
    a[i] = elemento;
    elementoInserito = true;
  }
  return elementoInserito;
}

int trovaPos (char a[], int dim, char el){
  if (dim==0) return 0;
  return trovaPos(a, 0, dim-1, el);
}

int trovaPos(char a[], int start, int end, char el){
  int pos = (end+start)/2;
  if (start>end)
    pos = start;
  else if (a[pos] >= el)
    pos=trovaPos(a, start, pos-1, el);
  else if(a[pos] < el)
    pos = trovaPos(a, pos+1, end, el);
  return pos;
}
