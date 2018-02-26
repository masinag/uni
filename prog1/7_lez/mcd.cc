// Calcola l'mcd con l'algoritmo di Euclide

#include <iostream>
using namespace std;

int mcd(int x, int y);
int main(){
  int x, y;
  cout << "Inserire due numeri interi: ";
  cin >> x >> y;

  cout << "MCD(" << x << ", " << y << ") = " <<
    (x>y ? mcd(x, y) : mcd (y, x)) << endl;
  
  return (0);
}

int mcd(int x, int y){
  return (y==0) ? x : mcd(y, x%y);
}
