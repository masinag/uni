/*
 Legge una seq di prezzi da un file in ingresso, li modifica
secondo una certa scontistica e poi li salva in un file di
output. Si assuma che tutti i numeri in ingresso siano interi.
Regola:
n<50 => moltiplica per 1.08
50 <= n < 100 molt per 1.05
n > 100 => moltiplica per 1.02

Es
12 34 7
8 7 6
9 15
33 100 2 900
 */

using namespace std;
#include <iostream>
#include <cstdlib>
#include <cstring>
#include <fstream>

bool palindroma(const char s[]);
bool palindroma(const char s[], int pos);

int main(int argc, char * argv[]){
  if(argc != 3){
    cerr << "Sono richiesti un file di input e uno di output." << endl;
    cerr << "Uso: ./a.out <fileinput> <fileoutput>" << endl;
    exit(EXIT_FAILURE);
  }
  fstream in, out;

  in.open(argv[1], ios::in);
  
  if (in.fail()){
    cerr << "Il file " << argv[1] << " non esiste!" << endl;
    exit(EXIT_FAILURE);
  }

  out.open(argv[2], ios::out);

  float n;
  while (in >> n) {
    if(n<50) n *= 1.08;
    else if (n<100) n*= 1.05;
    else n*= 1.02;
    out << n << " ";
  }
  in.close();
  out.close();
  
}

