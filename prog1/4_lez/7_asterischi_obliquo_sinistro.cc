// Acquisito un intero n da tastiera, stampare
// a video n asterischi in obliquo destro.

using namespace std;
#include <iostream>

int main(){
  int n;
  cout << "Quanti asterischi vuoi stampare? ";
  cin >> n;
  for (int i=n; i>0; i--){
    for (int j=0; j<i-1; j++){
      cout << ' ';
    }
    cout  << '*' << endl;
  }

  return 0;
}
