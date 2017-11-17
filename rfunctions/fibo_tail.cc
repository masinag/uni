// versione tail recursive della funzione
// che restituisce l'n-esimo numero di Fibonacci

using namespace std;
#include <iostream>
#include <cstdlib>

long long fibo(int n);
long long fibo(long long p, long long u, int n, int i);

int main(int argc, char * argv[]){
  int n;
  bool inputValido = false;
  if (argc >= 2){
    if (! (n = atoi(argv[1]) ))
      cout << "Argomento non valido [uso: ./a.out n]" << endl;
    else inputValido = true;
  } else {
    while(!inputValido){
      cout << ">> ";
      cin >> n;
      if (cin.fail()){
	cout << "Input non valido: richiesto un numero itero" << endl;
	cin.clear();
	cin.get(); // leggo il carattere '\n'
      } else
	inputValido = true;
    }
  }
  cout << "fibonacci(" << n << ") = " << fibo(n);
}

long long fibo(int n){
  long long res;
  if (n == 0 || n == 1)
    res = 1;
  else
    res = fibo(1, 1, n, 2);
}

long long fibo(long long p, long long u, int n, int i){
  if (i==n)
    return p + u;
  else
    return fibo(u, p+u, n, i+1);
}
