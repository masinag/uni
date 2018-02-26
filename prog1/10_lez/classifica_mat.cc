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

void print(char** a, int dim);

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
    
  char** l = new char*[dim1];
  char** s = new char*[dim2];

  for(int i=2, j=0, k=0; i<argc; i++){
    if (strlen(argv[i]) >= n){
      l[j] = new char[strlen(argv[i])+1];
      strcpy(l[j], argv[i]);
      j++;
    } else {
      s[k] = new char[strlen(argv[i])+1];
      strcpy(s[k], argv[i]);
      k++;
    }
  }
  cout << "Longer or equal: " << endl;
  print(l, dim1);
  
  cout << endl << "Shorter: " << endl;
  print(s, dim2);

  delete[] l;
  delete[] s;
  return 0;

}


void print(char** a, int dim){
  for (int i = 0; i<dim; i++)
    cout << a[i] << endl;

}
