// dati 2 array a e b, la funzione quadratoArray mette in
// b[i] il quadrato di a[i]

#include <iostream>
using namespace std;

const int DIM = 5;
void quadratoArray(const int src[], long dst[], int dim);

int main(){
  int a[DIM] = {0, 1, 2, 3, 40000};

  long b[DIM] = {0l};

  quadratoArray(a, b, DIM);

  cout << "a = [";
  for (int i=0; i<DIM; i++){
    cout << a[i];
    if (i<DIM-1) cout << ", ";
    else cout << "]" << endl;
  }

  cout << "b = [";
  for (int i=0; i<DIM; i++){
    cout << b[i];
    if (i<DIM-1) cout << ", ";
    else cout << "]" << endl;
  }
  
}

void quadratoArray(const int src[], long dst[], int dim){
  for (int i=0; i<dim; i++)
    dst[i] = src[i]*src[i];
}
