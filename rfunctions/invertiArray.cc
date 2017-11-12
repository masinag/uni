// inverte un array

#include <iostream>
using namespace std;

void leggiArray   (int a[], int& n);
void stampaArray  (int a[], int n);
void invertiArray (int a[], int n);
void invertiArray (int a[], int n, int i);
void scambia (int& a, int& b);

const int DIM = 100;


int main(){
  int n;
  int a[DIM];
  leggiArray(a, n);
  invertiArray(a, n);
  stampaArray(a, n);
}

void leggiArray(int a[], int& n){
  cout << "Quanti numeri vuoi inserire? [massimo " << DIM << "] ";
  cin >> n;
  if (n<=DIM){
    for(int i=0; i<n; i++){
      cout << ">> ";
      cin >> a[i];
    }
  } else {
    cout << "ERRORE! ";
  }
}

void stampaArray(int a[], int n){
  cout << "[ ";
  for (int i=0; i<n; i++)
    cout << a[i] << " ";
  cout << "]" << endl;
}

void invertiArray(int a[], int n){
  invertiArray(a, n, 0);
}

void invertiArray(int a[], int n, int i){
  if (i <= n/2){
    scambia(a[i], a[n-i-1]);
    invertiArray(a, n, i+1);
  }
}

void scambia (int& a, int& b){
  int c;
  c = a;
  a = b;
  b = c;
}


