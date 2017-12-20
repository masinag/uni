using namespace std;
#include <iostream>
#include "tree.h"

// AUXILIARY FUNCTIONS

static void print_spaces(int depth) {
  for(int i=0;i<depth;i++) 
      cout << "  ";
}

static bool emptyp(const tree & t) {
  return (t==NULL);
}

// MAIN FUNCTIONS

void init(tree & t) {
  t=NULL;
}

// valuta il valore ritornato da 'cerca'
// diverso da `emptyp'
bool nullp(const tree & t) {
  return (t==NULL);
}

retval set(tree & t, int key, int value) {
  retval res;

  if (emptyp(t)) {
// memo: "new (nothrow) ..." restituisce NULL
// senza generare eccezioni se l'allocazione non va a buon fine
    t = new (nothrow) node;
    if (t==NULL)
      res = FAIL; 
    else {
      t->item = new key_value;
      t->item->key = key;
      t->item->value = value;

      t->left = NULL; 
      t->right = NULL; 
      res = OK;
    }
  } else if (t->item->key == key)
    t->item->value=value;
  else if (key <= t->item-> key) 
    res = set(t->left, key, value);
  else if (key > t->item-> key) 
    res = set(t->right, key, value);
  return res;
}

tree  get(const tree & t,int key) { 
  tree res;
  if (emptyp(t)) 
    res = NULL;
  else if (key==t->item->key)
    res = t;
  else if (key < t->item->key) 
    res = get(t->left, key);
  else if (key > t->item->key)
    res = get(t->right, key);
  return res;
}

void print_ordered(const tree & t) {
  if (!emptyp(t)) {
    print_ordered(t->left);
    cout << t->item-> key << " -> " << t->item->value << endl;
    print_ordered(t->right);
  }
}

void print_indented(const tree & t) { 
  static int depth=0;
  depth++;
  if (!emptyp(t)) {
    print_indented(t->right);
    print_spaces(depth);
    cout << t->item-> key << " -> " << t->item->value << endl;
    print_indented(t->left);
  }
  depth--;
}




