#include <stdio.h>
#define MAXLEN 80
int main(){
	char txt[MAXLEN] = "Prova";
	char *c;
	int i;
	for(i=0; i<MAXLEN; i++){
		c=txt+i;
		printf("%i, %c\n", i, *c);
		if(*c=='\0') break;
	}
	printf("Strlen(%s)=%i\n", txt, i);
	return 0;
}
