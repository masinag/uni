#include <stdio.h>
#include <unistd.h>
int main(){
  printf("Parent id: %d\n", getpid());

  pid_t f1 = fork();
  printf("f1: %d, pid: %d, ppid: %d\n", f1, getpid(), getppid());
  pid_t f2 = fork();
  printf("\tf2: %d, pid: %d, ppid: %d\n", f2, getpid(), getppid());
  pid_t f3 = fork();
  printf("\t\tf3: %d, pid: %d, ppid: %d\n", f3, getpid(), getppid());
  return 0;
}
