// 3) scrivere un programma che prenda due file
// - uno di testo
// - l'altro con una mappa iniettiva tra caratteri
//   e riscriva su un nuovo file il testo criptato secondo la mappa di caratteri. 

using namespace std;
#include <iostream>
#include <fstream>
#include <cstdlib>

const int LETTERS = 26;
const int DIM = 256;
void read_map(const char file[], char dest[]);
void crypt(const char file[], const char map[]);
void cypher(char& c, const char map[]);

int main(int argc, char * argv[]){
  if(argc != 3){
    cout << "Syntax error: 2 arguments expected, " << argc -1 << " given" << endl;
    exit(EXIT_FAILURE);
  }

  char map[LETTERS];
  read_map(argv[2], map);

  crypt(argv[1], map);
}

void read_map(const char file[], char dest[]){
  fstream in;
  char line[DIM];
  in.open(file, ios::in);
  if(in.fail()){
    cout << "The file " << file << " does not exist" << endl;
    exit(EXIT_FAILURE);
  }
  
  for(int i=0; i<LETTERS; i++)
    dest[i] = char('a' + i);

  while(in.getline(line, DIM)){
    dest[line[0]-'a'] = line[2];
  }
  
}

void crypt(const char file[], const char map[]){
  fstream in, out;
  in.open(file, ios::in);
  if(in.fail()){
    cout << "The file " << file << " does not exist" << endl;
    exit(EXIT_FAILURE);
  }
  out.open("output", ios::out);
  char c;
  while(in.get(c)){
    cypher(c, map);
    out.put(c);
  }
}

void cypher(char& c, const char map[]){
  if(c>='a' && c<='z')
    c=map[c-'a'];
}
