using namespace std;
#include <iostream>
#include <cstring>
#include "struct_queue_string.h"
#include "struct_common.h"

bool empty_queue (const queue & Q) 
{
  return (Q.head == NULL);
}

void init(queue & Q)
{
  Q.head = NULL;
}

// memo: "new (nothrow) ..." restituisce NULL
// senza generare eccezioni se l'allocazione non va a buon fine
retval enqueue(const char* n,queue & Q)
{
  retval res;
  node * np = new (nothrow) node;
  if (np==NULL)
    res = FAIL;
  else {
    np->val = new char[MAX_Q];
    strncpy(np->val, n, MAX_Q);
    np->next=NULL;
    if (empty_queue(Q)) 
      Q.head=np;
    else 
      Q.tail->next=np;
    Q.tail=np;
    res = OK;
  }
  return res;
}

retval first(char* n,const queue & Q)
{ 
  retval res;
  if (empty_queue(Q))
    res = FAIL;
  else {
    strncpy(n, Q.head->val, MAX_Q);
    res = OK;
  }
  return res;
}

retval dequeue(queue & Q)
{ 
  retval res;
  if (empty_queue(Q))
    res=FAIL;
  else {
    node * first;
    first = Q.head;
    Q.head = Q.head->next;
    delete first; 
    res=OK;
  }
  return res;
}

void print_queue(const queue & Q) 
{ 
  if (!empty_queue(Q)) {
    node * first=Q.head;
    do {
      cout << first->val << endl;
      first = first->next;
    } while (first != NULL);
  }
}

