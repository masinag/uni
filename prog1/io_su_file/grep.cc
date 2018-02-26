// 2) scrivere dei comandi che riproducano alcuni comandi unix/linux come
//    grep
using namespace std;
#include <iostream>
#include <fstream>
#include <cstdlib>

int strlen(char s[]);

int main(int argc, char * argv[]){
  if (argc != 3){
    cout << "Syntax error: 2 arguments required" << endl;
    exit(EXIT_FAILURE);
  }
  
  fstream in;
  in.open(argv[2], ios::in);
  if(in.fail()){
    cout << "The file " << argv[2] << " does not exist" << endl;
    exit(EXIT_FAILURE);
  }
  
  char c;
  int i=0;
  bool wordFound = false;
  while(in.get(c) && !wordFound){
    if (c == argv[1][i]){
      i++;
      if(i == strlen(argv[1]))
	wordFound = true;
    } else
      i=0;
  }
  in.close();

  if(wordFound)
    cout << "La parola cercata e' presente!" << endl;
  else
    cout << "La parola cercata non e' presente!" << endl;
  return 0;
}


int strlen(char s[]){
  int l;
  for(l=0; s[l] != '\0'; l++);
  return l-1;
  
}
