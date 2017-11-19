// * scrivere una procedura che prenda un vettore v e la sua dimensione d,
// un  elemento x, ed elimina tutte le occorrenze di x (diminuemdo la 
// dimensione d del vettore)

// Esempio:
//   v = [4 1 3 6 8 4 2], d = 7, x = 4 ===>
//   v = [1 3 6 8 2], d = 5

using namespace std;
#include <iostream>

const int SIZE = 10;

void stampaArray(const int v[], int dim);
void elimina (int v[], int & dim, int x);
void eliminaElemento (int v[], int &dim, int i);
void elimina (int v[], int & dim, int x, int i);

int main(){
  int v[SIZE] = {4, 1, 3, 6, 8, 4, 2};
  int dim = 7, x;
  stampaArray(v, dim);

  x = 4;
  cout << "Elimino i " << x << endl;
  elimina(v, dim, x);
  stampaArray(v, dim);

  x = 7;
  cout << "Elimino i " << x << endl;
  elimina(v, dim, x);
  stampaArray(v, dim);
  
  x = 2;
  cout << "Elimino i " << x << endl;
  elimina(v, dim, x);
  stampaArray(v, dim);  
  
  return 0;
}

void stampaArray(const int v[], int dim){
  cout << "[ ";
  for (int i=0; i<dim; i++)
    cout << v[i] << " ";
  cout << "]" << endl;
}

void elimina (int v[], int & dim, int x){
  elimina(v, dim, x, 0);
}
void elimina (int v[], int & dim, int x, int i){
  if (i < dim){
    if (v[i] == x){
      eliminaElemento(v, dim, i);
    }
    elimina(v, dim, x, i+1);
  }
}

void eliminaElemento (int v[], int &dim, int i){
  if(i<dim-1){
    v[i] = v[i+1];
    eliminaElemento(v, dim, i+1);
  } else {
    dim--;
  }
}
