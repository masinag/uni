// T(0) = 0, T(1) = 1, T(2) = 1, T(n) = T(n-1) + T(n-2) + T(n-3)

#include <iostream>
using namespace std;

long long tribonacci(long long n);
int main(){
  int n;
  cout << "Dammi un numero: ";
  cin >> n;
  for (int i=0; i<n; i++)
    cout << "T(" << i << ") = " << tribonacci(i) << endl;
}

long long tribonacci(long long n){
  long long trib = 0;
  if (n==0) trib = 0;
  else if (n==1 || n== 2) trib = 1;
  else{
    long long terz = 0, pen = 1, ult = 1;
    for (int i=3; i<=n; i++){
      trib = terz + pen + ult;
      terz = pen;
      pen = ult;
      ult = trib;
    }
  }
  return trib;
}

