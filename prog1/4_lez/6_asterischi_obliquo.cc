// Acquisito un intero n da tastiera, stampare
// a video n asterischi in obliquo destro.

using namespace std;
#include <iostream>

int main(){
  int n;
  cout << "Quanti asterischi vuoi stampare? ";
  cin >> n;
  for (int i=0; i<n; i++){
    for (int j=0; j<i; j++){
      cout << ' ';
    }
    cout  << '*' << endl;
  }
  
  cout << endl;
  return 0;
}
