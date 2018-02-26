// Calcola l'mcd con l'algoritmo di Euclide
// a>b : mcd (a, b) =
// -> a se b==0
// -> mcd(b, a%b) altrimenti


#include <iostream>
using namespace std;

int mcd(int x, int y);
void ordina (int& x, int& y);

int main(){
  int x, y;
  cout << "Inserire due numeri interi: ";
  cin >> x >> y;

  cout << "MCD(" << x << ", " << y << ") = "
       << mcd(x, y) << endl;
  
  return (0);
}

int mcd(int x, int y){
  ordina(x, y);
  int temp;
  while (y!=0){
    temp = x;
    x = y;
    y = temp%y;
  }
  return x;
}


void ordina (int& x, int& y){
  if (x<y) {
    int temp = x;
    x = y;
    y = temp;
  }
}
