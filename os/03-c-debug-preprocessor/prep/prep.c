// You can show debug info by define variable DEBUG in preprocessor
// or by compilingg with flag -DDEBUG
#include <stdio.h>
#define WMULT(X,Y) X*Y
#define MULT(X,Y) (X)*(Y)

#define INCX (x+1)
// Nota: sostituzione LETTERALE

int main(){
	// WMULT does the wrong thing
	printf("1+1*3 -> %d\n", WMULT(1+1, 3));
	printf("(1+1)*3 -> %d\n", MULT(1+1, 3));
	int x = 0;
	printf("x: %d\n", x);
	x = INCX;
	printf("x: %d\n", x);
	#ifdef DEBUG
	printf("Debug is enabled");
	#endif
}
