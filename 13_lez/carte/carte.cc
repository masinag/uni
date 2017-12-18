#include "carte.h"
#include <cstdlib>
static int next(int index) 
{
  return (index+1)%dim;
}

void init(queue & q) 
{
  q.tail=q.head=0;
}

static bool emptyp(const queue & q) 
{
  return (q.tail==q.head);
}

static bool fullp(const queue & q)
{
  return (next(q.tail)==q.head);
}

retval enqueue (const carta& c,queue & q) 
{ 
  retval res;
  if (fullp(q)) 
    res = FAIL;
  else {
    q.elem[q.tail] = &c;
    q.tail = next(q.tail);
    res=OK;
  }
  return res;
}

retval first(carta & c,const queue & q) 
{ 
  retval res;
  if (emptyp(q)) 
    res = FAIL;
  else {
    c = q.elem[q.head];
    res=OK;
  }
  return res;
}

retval dequeue(queue & q) 
{ 
  retval res;
  if (emptyp(q)) 
    res = FAIL;
  else {
    q.head = next(q.head);
    res=OK;
  }
  return res;
}


void preparaMazzo(carta m[]){
  int i=0;
  for(int seme=0; i<4; i++){
    for(int n=0; n<13; n++){
      m[i] = new carta;
      m[i].seme = seme;
      m[i].n = n;
      i++;
    }
  }
}
void mescolaMazzo(queue & c, carta m[]){
  srand(time(NULL));
  int pos;
  for(int i=0; i<dim; i++){
    do{
      pos = rand() % dim;
    } while (m[pos].seme == -1);
    enqueue(m[pos], c);
    m[pos].seme = -1;
  }
}
void stampa(carta c){
  cout << c.n << " di " << nomi_semi[c.seme] << endl;
}

