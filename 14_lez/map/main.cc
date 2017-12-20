using namespace std;
#include "map.h"
#include <iostream>

int main(){
  Map m;
  init(m);

  set(m, 2, 4);
  set(m, 3, 9);
  set(m, 4, 16);
  set(m, 5, 25);
  int n = get(m, 4);
  cout << n << endl;
  n = get(m, 5);
  cout << n << endl;
  n = get(m, 2);
  cout << n << endl;
}
