// 7) scrivere un programmino che simuli un attacco 3 contro 3 
// a RISIKO

#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

void inizializza();
void gioca(int attaccanti, int difensori);
void tiraDadi(int nDadi, int& dado1, int& dado2, int& dado3);
int maxNr(int indice, int n1, int n2, int n3);
void ordina(int& n1, int& n2, int& n3);
void scambia(int& a, int& b);

int main(){
  inizializza();
  gioca(4, 3);
  return 0;
}

void gioca(int attaccanti, int difensori) {
  int pedAtt, pedDif, A1, A2, A3, D1, D2, D3;

  while(attaccanti > 1 && difensori > 0){
    cout << "Pedine attaccante: " << attaccanti << endl;
    cout << "Pedine difensore: " << difensori << endl;
    
    if (attaccanti > 3) pedAtt=3;
    else pedAtt = attaccanti-1;

    if (difensori > 3) pedDif=3;
    else pedDif = difensori;
    
    cout << "Attaccante tira " << pedAtt << " dadi" << endl;
    cout << "Difensore tira " << pedDif << " dadi"  << endl;


    cout << "Tira l'attaccante: ";
    tiraDadi(pedAtt, A1, A2, A3);
    cout << "Tira il difensore: ";
    tiraDadi(pedDif, D1, D2, D3);

    for (int i=0; i<pedAtt && i<pedDif; i++) {
      if (maxNr(i, A1, A2, A3) > maxNr(i, D1, D2, D3))
	difensori--;
      else
	attaccanti--;
    }
     cout << endl;
    
  }
  if(difensori == 0)
    cout << "L'attacco ha vinto" << endl;
  else
    cout << "La difesa ha vinto" << endl;
}

void inizializza(){
  srand(time(NULL));
}

void tiraDadi(int nDadi, int& dado1, int& dado2, int& dado3){
  dado1 = dado2 = dado3 = 0;
  switch (nDadi) {
  case 3: dado3 = rand() % 6 + 1; cout << " " << dado3;
  case 2: dado2 = rand() % 6 + 1; cout << " " << dado2;
  case 1: dado1 = rand() % 6 + 1; cout << " " << dado1 << endl;
  }
}

int maxNr(int indice, int n1, int n2, int n3){
  ordina(n1, n2, n3);
  int res;
  switch(indice){
  case 0: res=n1;break;
  case 1: res=n2;break;
  default: res=n3;
  }
  return res;
}

void ordina(int& n1, int& n2, int& n3){
  if (n2 > n1) scambia(n1, n2);
  if (n3 > n1) scambia(n1, n3);
  if (n3 > n2) scambia(n2, n3);
}

void scambia (int& a, int&b){
  int temp = a;
  a = b;
  b = temp;
}
