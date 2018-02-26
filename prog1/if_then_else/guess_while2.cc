//
// 4) Scrivere un programma che "indovini" un numero tra 0 e 7
// facendo una serie di domande del tipo "s/n" all'utente. 

#include <iostream>
using namespace std;

int main(){
  char risp;
  int numero, min=0, max=7;
  bool numeroTrovato = false;
  cout << "Rispondi alle domande con s/n" << endl;
  cout << "Pensa ad un numero tra 0 e 7..." << endl;
  cout << "E' 0? ";
  cin >> risp;
  if (risp == 's') {
    numero = 0;
    numeroTrovato = true;
  } else {
    cout << "E' 7? ";
    cin >> risp;
    if (risp == 's') {
      numero = 7;
      numeroTrovato = true;
    }
  }
   
  while (!numeroTrovato) {
    numero = (max+min)/2;
    if (numero == max-1 && numero == min+1){
      numeroTrovato = true;
    } else {
      cout << "E' " << numero << "? ";
      cin >> risp;

      if (risp=='s') {
 	 numeroTrovato = true;
      } else {
	 if ((numero-1) == min){
	   numero = max-1;
	   numeroTrovato = true;
	 }else if ( (numero+1) == max ) {
	   numero = min +1; numeroTrovato = true;
	 } else {
	   cout << "E' minore di " << numero << "? ";
	   cin >> risp;
	   if (risp == 's'){
	     max = numero;
	   } else {
	     min = numero;
	   }
	 }
      }
    }
  }


  
  cout << "Il numero che hai pensato è " << numero << endl;
}
