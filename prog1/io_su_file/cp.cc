// 2) scrivere dei comandi che riproducano alcuni comandi unix/linux come
//    grep
using namespace std;
#include <iostream>
#include <fstream>
#include <cstdlib>

int main(int argc, char * argv[]){
  if (argc != 3){
    cout << "Syntax error: 2 arguments required" << endl;
    exit(EXIT_FAILURE);
  }
  
  fstream in, out;
  in.open(argv[1], ios::in);
  if(in.fail()){
    cout << "The file " << argv[1] << " does not exist" << endl;
    exit(EXIT_FAILURE);
  }
  out.open(argv[2], ios::out);

  char c;
  while(in.get(c))
    out.put(c);

  in.close();
  out.close();
}
