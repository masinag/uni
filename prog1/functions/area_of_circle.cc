// 5) scrivere una PROCEDURA (void) che calcoli l'area 
// del cerchio dato il raggio.


using namespace std;
#include <iostream>
#include <iomanip>

const double PI = 3.14159265358979323846;

void area_cerchio(double raggio, double& area);

int main(){
  cout.setf(ios::fixed);
  double raggio, area;

  cout << "Raggio della circonferenza: ";
  cin >> raggio;

  area_cerchio(raggio, area);

  cout << "L'area del cerchio con raggio " << raggio
       << " e' " << setprecision(4) << area << endl;
  
  return 0;
}

void area_cerchio(double raggio, double& area){
  area = raggio * raggio * PI;
}
