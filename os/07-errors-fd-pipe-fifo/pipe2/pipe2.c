#include <stdio.h>
#include <unistd.h>
#define READ 0
#define WRITE 1
/* redirige lo stdout di cmd1 sullo stdin di cmd2 */
int main (int argc, char *argv []) {
  int fd [2];
  pipe (fd); /* Create an unamed pipe */
  if (fork() != 0) {
    /* Parent, writer */
    close (fd[READ]); /* Close unused end */

    // w         stdout
    // 17          1
    // 17          17
    // x           17

    dup2 (fd[WRITE], 1); /* Duplicate used end to stdout */
    close (fd[WRITE]); /* Close original used end */
    execlp (argv[1], argv[1], NULL); /* Execute writer program */
    perror ("connect"); /* Should never execute */
  } else {
    /* Child, reader */
    close (fd[WRITE]); /* Close unused end */
    dup2 (fd[READ], 0); /* Duplicate used end to stdin */
    close (fd[READ]); /* Close original used end */
    execlp (argv[2], argv[2], NULL); /* Execute reader program */
    perror ("connect"); /* Should never execute */
  }
}
