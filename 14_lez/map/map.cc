using namespace std;

#include "map.h"
#include <cstddef>
#include <iostream>
void init(Map& m){
  m.first = NULL;
}

int get(const Map& m, int key){
  int n = -1;
  map_item* item = m.first;
  while(n==-1 && item != NULL){
    if (item->elem->key == key)
      n = item->elem->value;
    else
      item = item->next;
  }
  return n;
}
void set(Map& m, int key, int value){
  map_item* item = m.first;
  bool found = false;
  
  if(item != NULL){
    while(!found && item != NULL){
      if (item->elem->key == key){
	found = true;
      } else{
	item = item->next;
      }
   
    }
  }
  if(!found){
    key_value* kv = new key_value;
    kv->key = key;
    kv->value = value;

    map_item* mi = new map_item;
    mi->elem = kv;
    mi->next = NULL;

    mi -> next = m.first;
    m.first = mi;
     
  } else {
    item->elem->value = value;
  }
}
static void deinit(map_item* i){
  if (i!=NULL){
    deinit(i->next);
    delete i;
  }
}
void deinit(Map& m){
  deinit(m.first);
}

void print(Map& m){
  map_item* i = m.first;
  while (i!=NULL){
    cout << i->elem->key << " -> " << i->elem->value << endl;
    i = i->next;
  }
}
