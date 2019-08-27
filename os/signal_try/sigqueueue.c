#include<stdio.h>
#include<signal.h>
#include<unistd.h>
#include<stdlib.h>
#include <time.h>
#include <sys/wait.h>
#define SIZE 4
#define MAX_SLEEP 3
void handler(int sig, siginfo_t *si, void *ucontext)
{
    printf("%s %d\n", sig==SIGINT?"SIGINT":sig==SIGUSR2?"SIGUSR2":"SIGUSR1", si->si_value.sival_int); /* This is what you're looking for. */
    fflush(stdout);
}

int main() {
    struct sigaction sa;
    sigemptyset(&sa.sa_mask);
    sa.sa_sigaction = handler;
    sa.sa_flags = SA_SIGINFO; /* Important. */
    sigaction(SIGINT, &sa, NULL);
    sigaction(SIGUSR1, &sa, NULL);
    sigaction(SIGUSR2, &sa, NULL);
    int pid;
    if((pid = fork()) > 0){
        // father sends...
        union sigval sv;
        for(int i=0; i<10; i++){
            // sleep(1);
            sv.sival_int = i;
            switch (i%3) {
                case 0:
                    sigqueue(pid, SIGINT, sv); break;
                case 1:
                    sigqueue(pid, SIGUSR1, sv); break;
                case 2:
                    sigqueue(pid, SIGUSR2, sv);
                    sleep(1);
                    break;

            }

        }
        waitpid(pid, NULL, 0);
    } else {
        for(int i=0; i<5; i++){
            pause();
        }
        printf("Child exit\n");
        fflush(stdout);
    }
}
