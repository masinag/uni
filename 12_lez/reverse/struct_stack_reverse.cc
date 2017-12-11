using namespace std;
#include <iostream>
#include "struct_stack_char.h"
#include <cstring>
const int MAX = 256;
int main () 
{
  char c;
  char str[MAX];
  stack s;
  init(s);

  cin.getline(str, MAX);

  for(int i=0; i<strlen(str); i++){
    push(str[i], s);
  }
  
  while(top(c, s) == OK){
    cout << c;
    pop(s);
  }
  cout << endl;
}


    
    
