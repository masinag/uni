// sys.c | Example of usage: ./sys “ls -l”
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAXL 100
int main(int argc, char **argv) {
  char* cmd = "";
  char* quit = "quit\n";
  size_t size=0;
  printf("$ ");
  getline(&cmd, &size, stdin);
  while(strcmp(cmd, quit)){
    system(cmd);
    printf("$ ");
    getline(&cmd, &size, stdin);
  }
  return 0;
}
