// * scrivere una procedura che normalizzi un vettore, cio'che sostituisca un 
// vettore con quallo risultante dalla divisione di tutti i suoi elementi per 
// la nua norma.

using namespace std;
#include <iostream>
#include <cmath>

const int DIM=20;

double prod_scalare(const double a1[], const double a2[], int dim);
double norma(const double a[], int dim);
bool input_array(double a[], int& dim);
void print_array(const double a[], int dim);
void normalizza(double a[], int dim);

int main(){
  double a[DIM];
  int dim;
  input_array(a, dim);
  cout << "La normalizzazione del vettore" << endl;
  print_array(a, dim);
  cout << "e' " << endl;
		   normalizza(a, dim);
		   print_array(a, dim);
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

void print_array(const double a[], int dim){
  cout << "[ ";
  for (int i=0; i<dim; i++)
    cout << a[i] << " ";
  cout << "]" << endl;
}

void normalizza(double a[], int dim){
  double mod = norma(a, dim);
  for (int i=0; i<dim; i++)
    a[i] /= mod;
}
