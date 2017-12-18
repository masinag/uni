#ifndef STRUCT_QUEUE_H
#define STRUCT_QUEUE_H

// dichiarazioni per la gestione della coda di interi

using namespace std;
#include <iostream>
#include "struct_common.h"
const int MAX_Q=256;

struct node {
  char* val;
  node * next;
};

struct queue 
{
  node * tail;
  node * head;
};

void init (queue &);
bool empty_queue(queue &);
retval enqueue(const char*,queue &);
retval first(char*,const queue &);
retval dequeue(queue &);
void print_queue (const queue &);

#endif



