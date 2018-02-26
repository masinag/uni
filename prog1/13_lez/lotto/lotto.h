#ifndef STRUCT_QUEUE_H
#define STRUCT_QUEUE_H

// dichiarazioni per la gestine della coda di interi

using namespace std;
#include <iostream>

const int NUMERI = 90;
const int NXESTR = 5;
const char* ruote[4]={"napoli", "milano", "venezioa", "genova"};


struct queue 
{
  int head, tail;
  int elem[NUMERI];
};

enum retval { FAIL, OK };

void init (queue &);
retval enqueue(int ,queue &);
retval first(int &,const queue &);
retval dequeue(queue &);
void print (const queue &);

void preparaNumeri(int n[]);
void mescolaNumeri(queue & c, int n[]);

#endif



