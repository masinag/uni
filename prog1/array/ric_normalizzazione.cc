// Normalizza un vettore in modo ricorsivo.

using namespace std;
#include <iostream>
#include <cmath>

const int DIM=20;

double norma(const double a[], int dim);
bool input_array(double a[], int& dim);
void print_array(const double a[], int dim);
void normalizza(double a[], int dim);
void prod_per_scalare(double a[], int dim, double mu);

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
  int res;
  if (dim == 0)
    res = 0;
  else{
    res = a1[dim-1] * a2[dim-1] + prod_scalare(a1, a2, dim-1);
  }
  return res;
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
  cout << "# " << mod << endl;
  prod_per_scalare(a, dim, 1/mod);
}

void prod_per_scalare(double a[], int dim, double mu){
  if (dim > 0){
    cout << a[dim-1] << endl;
    a[dim-1] *= mu;
    prod_per_scalare(a, dim-1, mu);
  }
}
