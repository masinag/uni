/*
  
 */

using namespace std;
#include <iostream>
#include <cstdlib>
#include <cstring>

const int LUNGHEZZA = 20;

void codifica(char destinazione, const char sorgente);
void codifica(char destinazione, const char sorgente, int pos);
char caesar(char c);
int main(int argc, char * argv[]){
  char sorgente[LUNGHEZZA], destinazione[LUNGHEZZA];

  cin.getline(sorgente, LUNGHEZZA);
  cout << sorgente << endl;
  
  codifica(destinazione, sorgente);
  cout << "Stringa codificata: " << destinazione << endl;
}

void codifica(char destinazione[], const char sorgente[]){
  codifica(destinazione, sorgente, 0);
  
}

void codifica(char destinazione[], const char sorgente[], int pos){
  if (pos < strlen(sorgente)){
    destinazione[pos] = caesar(sorgente[pos]);
    codifica(destinazione, sorgente, pos+1);
  } else {
    destinazione[pos] = '\0'
  }
}

char caesar(char c){return c;} 
