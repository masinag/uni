// 6) scrivere una funzione (int) che calcoli sia l'area del cerchio 
// sia il suo perimetro e che la restituisca tramite la lista dei parametri,
// e che restituisca un valore booleano 1 se ha potuto calcolarlo (raggio >=0),
// 0 altrimenti.

using namespace std;
#include <iostream>
#include <iomanip>

const double PI = 3.14159265358979323846;

bool area_e_perimetro_cerchio(double raggio, double& area, double& perimetro);

int main(){
  cout.setf(ios::fixed);
  double raggio, area, perimetro;

  cout << "Raggio della circonferenza: ";
  cin >> raggio;

  if (area_e_perimetro_cerchio(raggio, area, perimetro)){

    cout << "L'area del cerchio con raggio " << setprecision(0) << raggio
	 << " e' " << setprecision(4) << area << " e il suo perimetro e' "
	 << perimetro << endl;
  } else {
    cout << "Errore: il raggio deve essere >= 0" << endl;
  }
  return 0;
}
 
bool area_e_perimetro_cerchio(double raggio, double& area, double& perimetro){
  bool res;
  if (raggio >= 0) {
    area = raggio * raggio * PI;
    perimetro = 2 * raggio * PI;
    res = true;
  } else {
    res = false;
  }

  return res;
}
