// T(0) = 0, T(1) = 1, T(2) = 1, T(n) = T(n-1) + T(n-2) + T(n-3)

#include <iostream>
using namespace std;

long long tribonacci(long long n);
int main(){
  int n;
  cout << "Dammi un numero: ";
  cin >> n;
  cout << "T(" << n << ") = " << tribonacci(n) << endl;
}

long long tribonacci(long long n){
  long long res;
  if (n == 0) res = 0;
  else if (n == 1 || n== 2) res = 1;
  else res = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);

  return res;
}

