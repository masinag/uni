// 2) Reimplementare l'esempio della serie sum 1/(2^i) 
// implementando esplicitamente la funzione 
// double pow2(int) 
// che calcola 2^i (2*2*2*2.....*2)

using namespace std;
#include <iostream>

int serie();
int pow2(int);

const int N_ITER = 10;

int main(){
  float res;
  res = serie();
  cout << "La serie 1/(2^i) possiamo approssimarla con: " << res << endl;
  return 0;
}

int pow2(int n){
  int res = 1;
  for (int i=0; i<n; i++){
    res*=2;
  }
  return res;
}

int serie(){
  float res=0;

  for (int i=0; i<N_ITER; i++)
    res += 1/pow2(i);

  return res;

}
