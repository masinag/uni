#ifndef TREE_H 
#define TREE_H 

enum retval {FAIL,OK};

struct node;

typedef node * tree;

struct key_value{
  int key;
  int value;
};
struct node 
{  
  key_value* item;  
  tree left;  
  tree right;
};

void init(tree &);
bool nullp(const tree & );
retval set(tree &, int, int);
tree get (const tree &, int);
void print_ordered(const tree &);
void print_indented(const tree &);

#endif
