using namespace std;
#include <iostream>
#include <cstring>
#include "struct_stack_string.h"
#include "struct_common.h"

bool empty_stack (const stack & s) {
  return (s == NULL);
}

void init(stack & s) {
  s = NULL;
}

retval top (char* n,const stack & s) {
  retval res;
  if (empty_stack(s))
    res=FAIL;
  else {
    strncpy(n, s->val, MAX_S);
    res=OK;
  }
  return res;
}

// memo: "new (nothrow) ..." restituisce NULL
// senza generare eccezioni se l'allocazione non va a buon fine
retval push (const char* n,stack & s) {
  retval res;
  nodo * np = new (nothrow) nodo;
  if (np==NULL)
    res = FAIL;
  else {
    np -> val = new char[MAX_S];
    strncpy(np -> val, n, MAX_S);
    np -> next = s;
    s = np;
    res = OK;
  }
  return res;
}

retval pop (stack & s) {
  retval res;
  if (empty_stack(s))
    res=FAIL;
  else {
    nodo *first = s;
    s = s -> next;
    delete first; 	// liberare la memoria: cancella
    res=OK;             // l'oggetto puntato da first
  }		
  return res;
}

void print_stack (const stack & s) 
{
  nodo *first = s;
  while (first!=NULL) {
    cout << first->val << endl;
    first = first -> next;
  }
}

    
  





