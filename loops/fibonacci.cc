// 1) scrivere un programma che calcoli i primi 20 numeri della 
// successione di fibonacci:

// F0=0;
// F1=1;
// F_n = F_{n-1}+F_{n-2}

#include <iostream>
using namespace std;

int main(){
  int i=0, n=0, m=1, temp;

  cout << i << ". " << n << endl;
  i++;

  do {
    cout << i << ". " << m << endl;
    temp = m;
    m += n;
    n=temp;
    
    i++;
  } while (i<20);
  

  return 0;
}
