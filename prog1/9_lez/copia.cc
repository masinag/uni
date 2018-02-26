/*
  
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

