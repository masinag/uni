#include <stdio.h>
#include <string.h>
#include <unistd.h>
#include <fcntl.h>

int main(int argc, char const *argv[]) {
  int fd[2];
  char buf1[12] = "hello world";
  char buf2[12];
  fd[0] = open("foobar.txt", O_WRONLY | O_CREAT, 0777);
  fd[1] = open("foobar.txt", O_RDONLY);
  printf("fd[0] = %d, fd[1] = %d\n", fd[0], fd[1]);

  // writes in 'foobar.txt' 'hello world'
  write(fd[0], buf1, strlen(buf1));
  // puts in buf2 the content of 'foobar.txt' aka 'hello world'
  // then writes to stdout the content of buf2 [read returns the
  // number of bytes read]
  write(1, buf2, read(fd[1], buf2, 12));
  // close the fds
  close(fd[0]);
  close(fd[1]);
  return 0;
}
