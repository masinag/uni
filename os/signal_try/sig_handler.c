#include<stdio.h>
#include<signal.h>
#include<unistd.h>
#include<stdlib.h>
#include <time.h>
#include <sys/wait.h>
#include <wchar.h>
#include <locale.h>
#define SIZE 4
#define MAX_SLEEP 3
void sighandle_int(int sig) {
    if(sig!=SIGINT)
        return;
    printf("SIGUSR1 received, handling...\n");
    fflush(stdout);
    sleep(1);
    printf("Woken up, now terminating...\n");
    fflush(stdout);
}

int main() {
    // wchar_t wc = L'\u2517';

  setlocale(LC_ALL, "en_US.UTF-8");
  wprintf(L"%lc %lc\n", L'\u2517', L'\u2523');

  return 0;

	// signal(SIGINT, sighandle_int);
    // for(int i=0; i<10; i++)
    //     pause();
}
