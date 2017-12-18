/*
  Implementare la funzione "reverse" che, impiegando contemporaneamente
  le librerie 'pila' e 'coda', inverte il contenuto della pila ricevuta
  in ingresso.
 */

using namespace std;
#include <iostream>
#include "struct_stack_string.h"
#include "struct_queue_string.h"
#include "struct_common.h"
#include <cstring>

void reverse(stack& s);

int main(){
  char l[MAX_S];
  bool exit=false;
  stack s;
  init(s);
  cout << "Inserisci delle stringhe nella pila, 0 per terminare: " << endl;
  do{
    cout << ">> ";
    cin.getline(l, MAX_S);
    if(strcmp(l, "0")==0)
      exit = true;
    else
      push(l, s);
  } while (!exit);

  reverse(s);

  print_stack(s);
  return 0;
}


void reverse(stack& s){
  queue tmp;
  init(tmp);
  char* item;
  !empty_stack(s);
  while(!empty_stack(s)){
    top(item, s);
    enqueue(item, tmp);
    pop(s);
  }

  while(!empty_queue(tmp)){
    first(item, tmp);
    push(item, s);
    dequeue(tmp);
  }
}
