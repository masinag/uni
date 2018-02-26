// 3) Scriver un programmino che chieda una carattere descrivente una lingua 
// (es: 'i'= italiano, 'e'=inglese, ecc.) e scriva "buon giorno" 
// nella lingua prescelta. Usare l'istruzione switch. 

#include <iostream>
using namespace std;

int main(){
  char lang;
  cout << "Scegli la lingua (i=italiano, e=inglese, t=tedesco): ";
  cin >> lang;
  
  switch(lang){
    case 'e': cout << "Good morning!"; break;
    case 'i': cout << "Buon giorno!";  break;
    case 't': cout << "Guten Tag!";    break;
    default: cout << "Lingua non disponibile";
  }

  cout << endl;
}
