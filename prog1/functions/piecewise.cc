// 3) Scrivere una funzione f:R-->R che restituisca:
// -x^3 se x<=0
// e^x-1 se x>0
// e scrivere un programma main che calcoli la funzione f nei punti
// -10,-9,...,-1,0,1,2,...,9,10


using namespace std;
#include <iostream>
#include <cmath>

double piecewise(double);

int main(){
  cout << "Sia f: R-->R" << endl;
  cout << "f(x) = {" << endl;
  cout << " \t-x^3    se x <= 0" << endl;
  cout << " \te^x - 1 se x  > 0" << endl;
  cout << "\t}" << endl;
  
  for (int i=-10; i<11; i++){
    cout << "f(" << i << ") = " << piecewise(i) << endl;
  }

  
  return 0;
}

double piecewise (double x){
  double res;
  if (x<=0) {
    res = -1 * pow(x, 3);
  } else {
    res = pow(M_E, x) -1;
  }
  return res;
}
