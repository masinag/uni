#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

#define READ 0 /* read-side of pipes */
#define WRITE 1 /* write-side of pipes */
#define MAXLEN 100 /* max length of message */

int main (void) {
  size_t dim = 3;
  // snprintf(msg, dim, "%d", 10);
  char msg[MAXLEN] = "Ciaooo";
  int fd [2], bytesRead;
  char message [MAXLEN];
  pipe (fd); /* Create unnamed pipe */
  if (fork () > 0) {
      close(fd[READ]); /* close other side */
    printf("Writer writess READ:%d, WRITE:%d\n", fd[READ], fd[WRITE]);
    write (fd[WRITE], msg, strlen(msg)+1); /* include \0 */
    close (fd[WRITE]); /* close this side */
  } else {
    close (fd[WRITE]); /* close other side */
    char pipestring[10];
    char pipestringw[10];
    snprintf(pipestring, 10, "%d", fd[READ]);
    snprintf(pipestringw, 10, "%d", fd[WRITE]);
    execl("reader", "reader", pipestring, pipestringw, NULL);
  }
}
