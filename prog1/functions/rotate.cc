// 4) scrivere una procedura che ruoti tre elementi a,b,c
// e si scriva un main di prova.
// es:
// a=1;
// b=2;
// c=3;
// ruota(a,b,c); // a=2;b=3;c=1;


using namespace std;
#include <iostream>

void stampa_elementi (int, int, int);
void ruota (int*, int*, int*);

int main(){
  int a = 1, b = 2, c=3;
  stampa_elementi(a, b, c);
  
  for (int i=0; i<4; i++){
    cout << "Ruoto... " << endl;
    ruota(&a, &b, &c);
    stampa_elementi(a, b, c);
  }
  
  return 0;
}


void stampa_elementi (int a, int b, int c){
  cout << "I tre elementi sono: "
       << a << ", " << b << ", " << c << endl;
}

void ruota (int* a, int* b, int* c){
  int temp = *a;
  *a = *b;
  *b = *c;
  *c = temp;  
}
