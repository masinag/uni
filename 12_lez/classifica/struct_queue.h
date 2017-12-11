#ifndef STRUCT_QUEUE_H
#define STRUCT_QUEUE_H

// dichiarazioni per la gestione della coda di interi

const int MAX = 256;
using namespace std;
#include <iostream>

struct node {
char val[MAX];
node * next;
};

struct queue 
{
  node * tail;
  node * head;
};

enum retval { FAIL, OK };

void init (queue &);
retval enqueue(char*,queue &);
retval first(char* &,const queue &);
retval dequeue(queue &);
void print (const queue &);

#endif



