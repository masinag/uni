#include<stdio.h>
#include<signal.h>
#include<unistd.h>
void sighandle_int(int sig) {
	printf("\n[SIGINT]\n");
}

int main() {
	signal(SIGINT, sighandle_int);
	while (1) {
		printf(".");
		sleep(1);
		fflush(stdout); // force stdout
	};
	return 0;
}
