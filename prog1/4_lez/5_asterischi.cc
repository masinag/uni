// Acquisito un intero n da tastiera, stampare
// a video n asterischi in orizzontale

using namespace std;
#include <iostream>

int main(){
  int n;
  cout << "Quanti asterischi vuoi stampare? ";
  cin >> n;
  for (int i=0; i<n; i++)
    cout << '*';
  
  cout << endl;
  return 0;
}
