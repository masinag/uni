#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#define MAXLEN 100 /* max length of message */


int main(int argc, char const *argv[]) {
  int fd = atoi(argv[1]);
  int w = atoi(argv[2]);
  char message[MAXLEN];
  printf("READ:%d, WRITE:%d\n", fd, w);
  int bytesRead = read (fd, message, MAXLEN);
  printf ("Readerrrr Read %d bytes: %s\n", bytesRead, message);
  close (fd); /* close this side */
  return 0;
}
