#include <iostream>
using namespace std;

int fibonacci(int, int*);
int fibonacci(int);
int main(){
  int n;
  cout << "n: ";
  cin >> n;

  int fib = fibonacci(n);
  cout << fib << endl;
}

int fibonacci(int n) {
  int* cache = new int[n] ();
  return fibonacci(n, cache);
}

int fibonacci(int n, int* cache){
  int res;
  if(n==1 || n==2)
    res = 1;
  else{
    int fn1, fn2;
    if (cache[n-2] == 0)
      cache[n-2] = fibonacci(n-1, cache);
    if (cache[n-3] == 0)
      cache[n-3] = fibonacci(n-2, cache);
    res = cache[n-2] + cache[n-3];
  }
  return res;
}
