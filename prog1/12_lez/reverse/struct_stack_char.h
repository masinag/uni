#ifndef STRUCT_STACK_H
#define STRUCT_STACK_H

using namespace std;
#include <iostream>


enum retval {FAIL,OK};

struct nodo{
  char val;
  nodo *next;
};

typedef nodo * stack ;

void init(stack & );
retval push (char, stack &);
retval top (char &, const stack &);
retval pop (stack &);
void print(const stack &);

#endif
