#ifndef STRUCT_STACK_H
#define STRUCT_STACK_H

using namespace std;
#include <iostream>
#include "struct_common.h"
const int MAX_S = 256;

struct nodo{
  char* val;
  nodo *next;
};

typedef nodo * stack ;

void init(stack & );
bool empty_stack(stack &);
retval push (const char*, stack &);
retval top (char*, const stack &);
retval pop (stack &);
void print_stack(const stack &);

#endif
