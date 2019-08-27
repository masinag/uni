#include<stdio.h>
#include<signal.h>
#include<unistd.h>
#include<stdlib.h>
#include <time.h>
#include <sys/wait.h>
#define SIZE 4
#define MAX_SLEEP 3
void sighandle_int(int sig) {

	printf("pid: %d, sig: ", getpid());
	if(sig==SIGUSR1)
		printf("SIGUSR1\n");
	else if(sig==SIGUSR2)
		printf("SIGUSR2\n");
	else
		printf("UNKNOWN\n");
	fflush(stdout);
}

int main() {
	signal(SIGUSR1, sighandle_int);
	signal(SIGUSR2, sighandle_int);
	pid_t children[SIZE], wpid;
	int parent = 1, status=0;
	for(int i=0; i<SIZE; i++){
		if(parent){
			children[i] = fork();
			parent = parent && children[i];
		}
	}
	if(parent){
		srand(getpid());
		for(int i=0; i<SIZE; i++){
				sleep(1+rand()%(MAX_SLEEP));
				kill(children[i], rand()%2?SIGUSR1:SIGUSR2);
		}
		// wait for all children to die
		while(wait(&status)>0);
		printf("Parent dies, bye\n");
	} else {
		pause();
		exit(3);
	}

	return 0;
}
