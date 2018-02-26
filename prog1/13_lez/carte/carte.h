 #ifndef STRUCT_QUEUE_H
#define STRUCT_QUEUE_H

// dichiarazioni per la gestine della coda di interi

using namespace std;
#include <iostream>

const int dim = 52;

const char* nomi_semi[]={"cuori", "quadri", "fiori", "picche"};

struct carta{
  int n;
  int seme;
};

struct queue 
{
  int head, tail;
  carta elem[dim];
};

enum retval { FAIL, OK };

void init (queue &);
retval enqueue(const carta &,queue &);
retval first(carta &,const queue &);
retval dequeue(queue &);
void print (const queue &);

void preparaMazzo(carta m[]);
void mescolaMazzo(queue & c, carta m[]);
void stampa(carta c);


#endif



