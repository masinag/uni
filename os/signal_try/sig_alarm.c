#include<stdio.h>
#include<signal.h>
#include<unistd.h>
#include<stdlib.h>
#include <time.h>
#include <sys/wait.h>
#include <wchar.h>
#include <locale.h>
#define NSEC 4
#define MAX_SLEEP 3
void alarmHandler(int sig) {
    printf("Hello");
    if(sig == SIGALRM){
        printf("Timeout");
        alarm(NSEC);
    }
    fflush(stdout);
}

int main() {
    // wchar_t wc = L'\u2517';
    signal(SIGALRM, alarmHandler);
    alarm(NSEC);
    for(int i=0; i<100000; i++){
        printf("%d ", i);
        fflush(stdout);
        sleep(1);
    }
    return 0;

	// signal(SIGINT, sighandle_int);
    // for(int i=0; i<10; i++)
    //     pause();
}
