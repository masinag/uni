// Calcola la media degli elementi di una matrice
#include <iostream>
using namespace std;

const int SIZE = 3;

double media(int a[][SIZE]);
int main(){
  int m[SIZE][SIZE] = {{1, 2, 3},
		       {1, 4, 3},
		       {1, 7, 3}};

  cout << "La media degli elementi della matrice e': "
       << media(m) << endl;
}

double media(int a[][SIZE]){
  int tot=0;
  for(int i=0; i<SIZE; i++)
    for(int j=0; j<SIZE; j++)
      tot += a[i][j];
  return (tot*1.0)/(SIZE*SIZE);
}
