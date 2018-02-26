// dati 2 array a e b, restituisce un array c
// nella forma c={a1,b1, a2, b2, ...}

#include <iostream>
using namespace std;

const int DIM = 20;
enum ESITO {V, S, P};

int occEsito(ESITO e, const ESITO seq[], int dim);
int occEsitoRic(ESITO e, const ESITO seq[], int start, int end);
void stampaArray(const ESITO a[], int start, int end);

int main(){
  ESITO partite[DIM] = {V, V, V, S, P, V, P, P, V, P,
			V, S, S, V, P, P, V, S, V, V};
  int vittorie, pareggi, sconfitte;
  vittorie  = occEsito(V, partite, DIM);
  pareggi   = occEsito(P, partite, DIM);
  sconfitte = occEsito(S, partite, DIM);
  cout << "vittorie: " << vittorie << endl;
  cout << "pareggi: " << pareggi << endl;
  cout << "sconfitte: " << sconfitte << endl;
}

int occEsito(ESITO e, const ESITO seq[], int dim){
  return occEsitoRic(e, seq, 0, dim-1);
}
int occEsitoRic(ESITO e, const ESITO seq[], int start, int end){
  int occ;
  stampaArray(seq, start, end);
  if (start == end){
    occ = (seq[start]==e) ? 1 : 0;
  }
  else {
    occ = occEsitoRic(e, seq, start, start + (end-start)/2) +
      occEsitoRic(e, seq, start + (end-start)/2 +1, end);
  }
  return occ;
}

void stampaArray(const ESITO a[], int start, int end){
  cout << "[ ";
  for(int i=start; i<=end; i++)
    cout << a[i] << " ";
  cout << "]" << endl;

}

