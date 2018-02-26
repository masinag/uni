//
// Data in input una data in questo formato GGMMAAA
// creare una funzione chiamata "estrai" che estrae
// da questa data il giorno, il mese e l'anno
//


using namespace std;
#include <iostream>

void estrai (int data, int& giorno, int& mese, int& anno);

int main(){
  int data, giorno, mese, anno;
  cout << "Inserisci una data nel formato GGMMAAAA: ";
  cin >> data;
  estrai(data, giorno, mese, anno);

  cout << "La data e' " << giorno << "/" << mese << "/" << anno << endl;
  return 0;
}


void estrai (int data, int& giorno, int& mese, int& anno){
  giorno = data / 1000000;
  data -= giorno*1000000;

  mese = data / 10000;
  data -= mese*10000;

  anno = data;
}
