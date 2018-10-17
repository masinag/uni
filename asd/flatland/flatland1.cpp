using namespace std;
#include <fstream>
#include <list>
#include <unordered_set>
#include <cstdlib>
#include <iostream>
bool remove_right(list<bool>& dd, list<bool>::iterator& it);
bool remove_left(list<bool>& dd, list<bool>::iterator& it);
void flatland(list<bool> dd);
void check(list<bool>& dd, list<bool>::iterator it, int i);
void print(list<bool> dd);
int main(int argc, char* argv[]){
  int n = atoi(argv[1]);
  list<bool> dd (n);
  list<bool>::iterator it = dd.begin();

  check(dd, it, 0);  
  
}

void check(list<bool>& dd, list<bool>::iterator it, int i){
  if(i==dd.size()){
    print(dd);
    cout << endl;
    
    flatland(dd);
    cout << endl;
  } else {
    *it = false;
    check(dd, ++it, i+1);
    --it;
    *it = true;
    check(dd, ++it, i+1);
    cout << endl;
  }
}

void flatland(list<bool> dd){
  if(dd.size() == 1){
    cout << *(dd.begin()) << " ";
  } else {
    int i=1;
    for(list<bool>::iterator it = ++(dd.begin()); i < dd.size()-1; it++, i++){
      list<bool>::iterator it = ++(dd.begin());
      print(dd);
      if(*it == true){
	remove_right(dd, it);
	flatland(dd);
	dd.
      } else{
	remove_left(dd, it);
	flatland(dd);
      }
    }
  }  
}

bool remove_right(list<bool>& dd, list<bool>::iterator& it){
  it = dd.erase(it);
  bool res = *it;
  it = dd.erase(it);
  return res;
}
bool remove_left(list<bool>& dd, list<bool>::iterator& it){
  bool res = *(--it);
  it = dd.erase(it);
  it = dd.erase(it);
  return res;
}

void print(list<bool> dd){
  for(list<bool>::iterator it = dd.begin(); it != dd.end(); it++)
    cout << *it << " ";
  cout << endl;
}
