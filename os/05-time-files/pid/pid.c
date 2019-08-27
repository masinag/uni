#include <unistd.h>
#include <stdio.h>
int main(){
  pid_t pid = getpid();
  pid_t ppid = getppid();
  pid_t uid = getuid();
  printf("pid: %d, ppid: %d, uid: %d\n", pid, ppid, uid);
}
