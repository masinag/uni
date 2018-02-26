// Stampare a video i valori della tabella ASCII
// formattati in modo ordinato.

using namespace std;
#include <iostream>
#include <iomanip>

int main(){
  const int N_CHAR = 256;
  char c;
  
  for (int i=0; i<N_CHAR; i++){
    c=i;
    cout << setw(3) << i << " => " << c  << endl;
  }

  return 0;
}
