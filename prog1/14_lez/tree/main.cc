using namespace std;
#include "tree.h"
#include <iostream>

int main(){
  tree m;
  init(m);

  set(m, 2, 4);
  set(m, 3, 9);
  set(m, 6, 36);
  set(m, 8, 64);
  set(m, 1, 1);
  set(m, 60, 25);
  set(m, 4, 16);
  set(m, 5, 25);
  print_ordered(m);
  tree n = get(m, 4);
  cout << "4?" << !nullp(n) << endl;
  n = get(m, 5);
  cout << "5?" << !nullp(n) << endl;
  n = get(m, 7);
  cout << "7?" << !nullp(n) << endl;
  n = get(m, 1);
  cout << "1?" << !nullp(n) << endl;
}
