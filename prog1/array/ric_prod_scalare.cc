// Calcola il prodotto scalare di due vettori ricorsivamente

using namespace std;
#include <iostream>

const int DIM = 20;

double prod_scalare(const double a1[], const double a2[], int dim);
bool input_array(double a1[], double a2[], int& dim);

int main(){
  double a1[DIM];
  double a2[DIM];
  double prod;
  int dim;
  if (input_array(a1, a2, dim)){
    prod = prod_scalare(a1, a2, dim);

    cout << "Il prodotto scalare dei due vettori e': " << prod << endl;  
  } else
    cout << "Dimensione non valida" << endl;
  return(0);
}

bool input_array(double a1[], double a2[], int& dim){
  bool error = false;
  cout << "Inserisci la dimensione dei due vettori [max 20]: ";
  cin >> dim;
  if (dim <= 20){
    cout << "Inserisci le componenti del primo vettore: " << endl;
    for (int i=0; i<dim; i++){
      cout << ">> " ;
      cin >> a1[i];
    }

    cout << "Inserisci le componenti del secondo vettore: " << endl;
    for (int i=0; i<dim; i++){
      cout << ">> " ;
      cin >> a2[i];
    }
  } else error= true;

  return !error;
}

double prod_scalare(const double a1[], const double a2[], int dim){
  int res;
  if (dim == 0)
    res = 0;
  else{
    res = a1[dim-1] * a2[dim-1] + prod_scalare(a1, a2, dim-1);
  }
  return res;
}
