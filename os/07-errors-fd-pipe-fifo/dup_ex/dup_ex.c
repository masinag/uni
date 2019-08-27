#include <stdlib.h>
#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int main(int argc, char *argv[]) {
  int fdlog;
  char *cmd;
  char *args[] = {NULL, NULL, NULL, NULL, NULL, NULL};
  if (argc < 3 || argc > 7) {
    printf("?ERROR. Usage: %s <logfile> <cmd> [up to 5 <args>]\n", argv[0]);
    exit(1);
  }
  int a=0;
  printf("logfile=%s\n", argv[1]);
  printf("command=%s\n", argv[2]);
  // opens log file
  fdlog = open(argv[1], O_WRONLY | O_CREAT, 0777);
  // stdout and stderr point to log file...
  dup2(fdlog, STDOUT_FILENO);
  dup2(fdlog, STDERR_FILENO);

  cmd = argv[2];
  // args : [cmd, arg0, arg1, arg2], where arg<i> are the given strings
  args[0] = cmd;
  for (a = 3; a <= argc; a++) {
    args[a-2] = argv[a];
  }
  // executes cmd for the given args and writes output on log...
  execvp(cmd, args);
  close(fdlog);
  return 0;
}
