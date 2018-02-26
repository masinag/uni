/*
  
 */

using namespace std;
#include <iostream>
#include <cstdlib>
#include <cstring>

const int LUNGHEZZA = 256;
void cesare(char d[], const char s[]);
char codifica(char c);
int main(int argc, char * argv[]){
  char sorgente[LUNGHEZZA], destinazione[LUNGHEZZA];
  if(argc != 2){
    cout << "Richiesto un parametro!" << endl;
    exit(EXIT_FAILURE);
  }
  
  strncpy(sorgente, argv[1], LUNGHEZZA);
  cesare(destinazione, sorgente);
  cout << "Stringa codificata: " << destinazione << endl;
}

void cesare(char d[], const char s[]){
  int i;
  for(i=0; i<strlen(s); i++)
    d[i] = codifica(s[i]);
  d[i] = '\0';
}
char codifica(char c){
  char res = c; 
  if(c>='a' && c<='z')
    res = (c - 'a' + 3) % 26 + 'a';
  else if (c>='A' && c<='Z')
    res = (c - 'A' +3) % 26 + 'A';
  return res;
}
