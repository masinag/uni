#include <stdio.h>
int main(){
	int i=0;
	char* s="Esempio";
	printf("Testo='%s'", s);
	printf("...\n");
	return 0;
}

/*
	For debug
	gdb <filename>
	break <func_name>
	step
	set variable <var_name>=<value>
	continue -> prints pid and exit code
*/
