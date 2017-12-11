using namespace std;
#include "map.h"

static int find_for_key(const Map& m, int key); 
void init(Map & m, int dim){
  m.array = new key_value[dim];
  for(int i=0; i<dim; i++)
    m.array[i].key = -1;
  m.dim = dim;
}
int get(const Map & m, int k){
  int ris=-1;
  int index = find_for_key(m, k);
  if (index >=0)
    ris = m.array[index].value;
  return ris;
}
void set(Map & m, int k, int v){
  int index = find_for_key(m, k);
  if(index < 0)
    index = find_for_key(m, -1);
  if (index >= 0){
    m.array[index].key = k;
    m.array[index].value = v;
  }
}

void deinit(Map & m){
  m.dim =0;
  delete [] m.array;
}

static int find_for_key(const Map& m, int key){
  int res = -1;
  for(int i=0; i<m.dim && res==-1; i++)
    if(m.array[i].key == key)
      res = i;
  return res;
}
