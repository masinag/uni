//
// Dato un numero intero da tastiera n, stampare n
// asterischi in verticale/orizzontale/obliquo dx/sx
// in base a quanto scelto dall'utente
//

#include <iostream>
using namespace std;
void ast_orizz (int);
void ast_vert(int);
void ast_ob_dx(int);
void ast_ob_sx(int;

	       
int main(){
  int n, char scelta;

  cout << "Quanti asterischi vuoi stampare?: ";
  cin >> n;

  do {
    cout << "Come li vuoi stampare [o=orizz | v=vert | "
	 << "d=obliquo destro | s=obliquo sinistro | q=quit]: ";
    cin >> scelta;

    switch(scelta){
    case 'o': ast_orizz(n); break;
    case 'v': ast_vert(n); break;
    case 'd': ast_ob_dx(n); break;
    case 's': ast_ob_sx(n); break;
    }
  } while (scelta != 'q')
  return 0;
}


void ast_orizz(n){
  for (int i=0; i<n; i++)
    cout << '*';
  cout << endl;
}

void ast_vert(n){
  for (int i=0; i<n; i++)
    cout << '*' << endl;
}

void ast_ob_dx(n){
  for (int i=0; i<n; i++){
    for (int j=0; j<i; j++){
      cout << ' ';
    }
    cout  << '*' << endl;
  }  
  cout << endl;
}


	       void ast_ob_sx(n){}
