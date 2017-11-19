// versione tail recursive della funzione
// che restituisce l'n-esimo numero di Fibonacci

using namespace std;
#include <iostream>
#include <cstdlib>

long long fibo(int n);
long long fibo(long long p, long long u, int n);
bool checkN(int n);

int main(int argc, char * argv[]){
  int n;
  bool inputValido = false;
  if (argc >= 2){
    if (! (n = atoi(argv[1]) ) || ! checkN(n) )
      cout << "Argomento non valido [uso: ./a.out n > 0]" << endl;
    else inputValido = true;
  } else {
    while(!inputValido){
      cout << ">> ";
      cin >> n;
      if (cin.fail() || !checkN(n)){
	cout << "Input non valido: richiesto un numero intero > 0" << endl;
	cin.clear();
	cin.get(); // leggo il carattere '\n'
      } else
	inputValido = true;
    }
  }
  if (inputValido)
    cout << "fibonacci(" << n << ") = " << fibo(n) << endl;
}

long long fibo(int n){
  long long res;
  res = fibo(0, 1, n);
}

long long fibo(long long p, long long u, int n){
  if (n<=1)
    return p + u;
  else
    return fibo(u, p+u, n-1);
}

bool checkN(int n){
  return n > 0;
}
