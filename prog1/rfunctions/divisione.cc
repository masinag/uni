//
// Dati due numeri interi, implementare la funzione
// dividi con questa dichiarazione:
//
// void dividi (int dividendo, int divisore,
//             int& quoziente, int& resto);

using namespace std;
#include <iostream>
#include <cmath>

void dividi (int dividendo, int divisore, int& quoziente, int& resto);
void divisione (int dividendo, int divisore, int& quoziente, int& resto);

int main(){
  int divid, divis, quoz, resto;
  cout << "Inserisci dividendo e divisore interi: ";
  cin >> divid >> divis;

  dividi(divid, divis, quoz, resto);

  cout << divid << "/" << divis << " = " << quoz << ", resto: "
       << resto << endl;
  return 0;
}

void dividi (int dividendo, int divisore, int& quoziente, int& resto){
  quoziente = 0;
  divisione(dividendo, divisore, quoziente, resto);
}

void divisione (int dividendo, int divisore, int& quoziente, int& resto){
  if(divisore > dividendo){
    resto = dividendo;
  } else {
    quoziente += 1;
    divisione (dividendo - divisore, divisore, quoziente, resto);
  }
}
