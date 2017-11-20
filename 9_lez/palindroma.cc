/*
  Dichiarare e definire la funzione palindroma che
  testa se una stringa ricevuto è o meno palindroma.
Ricorsiva
 */

using namespace std;
#include <iostream>
#include <cstdlib>
#include <cstring>

const int LUNGHEZZA = 20;

bool palindroma(const char s[]);
bool palindroma(const char s[], int pos);

int main(int argc, char * argv[]){
  if(argc != 2){
    cout << "E' richiesto un argomento!" << endl;
    exit(0);
  }
  
  char s[LUNGHEZZA];
  strncpy(s, argv[1], LUNGHEZZA);
  if (palindroma(s)){
    cout << "Palindroma" << endl;
  } else {
    cout << "Non palindroma" << endl;
  }
}

bool palindroma(const char s[]){
  return palindroma(s, 0);
}

bool palindroma(const char s[], int pos){
  bool res = true;
  if(pos <= strlen(s)/2)
    res = (s[pos] == s[strlen(s)-pos-1]) && palindroma(s, pos+1);
  return res;  
}
