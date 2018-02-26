// * scrivere una procedura che calcoli la norma di un vettore di double
// (la radice quadrata del prodotto scalare con se' stesso).
using namespace std;
#include <iostream>
#include <cmath>

const int DIM=20;

double prod_scalare(const double a1[], const double a2[], int dim);
double norma(const double a[], int dim);
bool input_array(double a[], int& dim);

int main(){
  double a[DIM];
  int dim;
  double mod;
  input_array(a, dim);
  mod = norma(a, dim);
  cout << "La norma del vettore inserito e': " << mod << endl;
}

double prod_scalare(const double a1[], const double a2[], int dim){
  double prod = 0;
  for (int i=0; i<dim; i++)
    prod += a1[i]*a2[i];
  return prod;
}

double norma(const double a[], int dim){
  return sqrt(prod_scalare(a, a, dim));
}

bool input_array(double a[], int& dim){
  bool error = false;
  cout << "Inserisci la dimensione del vettore [max 20]: ";
  cin >> dim;
  if (dim <= 20){
    cout << "Inserisci le componenti del vettore: " << endl;
    for (int i=0; i<dim; i++){
      cout << ">> " ;
      cin >> a[i];
    }
  } else error= true;

  return !error;
}
