/*
  Riceve un ingresso uno o piu' parametri, di cui il primo
sia un nr. intero. Classifica tutti i parametri dopo il primo in due
gruppi, in base alla loro lunghezza: piu' lunghi o piu'corti/uguali
rispetto al numero di cui sopra. Stampa i due gruppi separatamente.
 */

using namespace std;
#include <iostream>
#include <cstring>
#include <cstdlib>

void print(int* a, int dim, char*argv[]);

int main(int argc, char * argv[]){
  if (argc < 3){
    cout << "Troppo pochi argomenti" << endl;
    exit(0);
  }
  int n = atoi(argv[1]);

  int dim1=0, dim2=0;
  for (int i=2; i<argc; i++){
    (strlen(argv[i]) >= n) ? dim1++ : dim2++;
  }
    
  int* l = new int[dim1];
  int* s = new int[dim2];

  for(int i=2, j=0, k=0; i<argc; i++){
    if (strlen(argv[i]) >= n)
      l[j++] = i;
    else
      s[k++] = i;
  }
  cout << "Longer: " << endl;
  print(l, dim1, argv);
  
  cout << endl << "Shorter: " << endl;
  print(s, dim2, argv);

  delete[] l;
  delete[] s;
  return 0;

}


void print(int* a, int dim, char*argv[]){
  for (int i = 0; i<dim; i++)
    cout << argv[a[i]] << endl;

}
