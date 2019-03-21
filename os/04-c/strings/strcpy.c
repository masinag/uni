#include <stdio.h>
#include <stdlib.h>

char* strcpy(char*, const char*);

int main(){
	const int MAX=100;
	char* a = (char*) malloc(MAX * sizeof(char));
	char* b = (char*) malloc(MAX * sizeof(char));
	strcpy(a, "Hello");
	printf("a: %s\n", a);
	printf("b: %s\n", b);
	strcpy(b, a);
	printf("Copying b in a: %s\n", b);
}

char* strcpy(char* dest, const char* src){
	int i=-1;
	do {
		i++;
		dest[i] = src[i];
	} while(src[i] != '\0');
	return dest;
}
