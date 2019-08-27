#include <stdlib.h>
#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>
int main(int argc, char* argv[]){
  int fd = open(argv[1], O_RDONLY);
  if(fd<0){
    perror("?");
    exit(EXIT_FAILURE);
  }
  printf("opened fd = %d\n", fd);
  if(close(fd) < 0) {
    perror("?");
    exit(EXIT_FAILURE);
  }
  printf("closed fd.\n");
  return 0;
}
