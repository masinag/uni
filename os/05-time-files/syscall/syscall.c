#include <stdio.h>
#include <stdlib.h>

int main() {
  printf("Run an 'ls -l' command\n\n");
  // create a subprocess using system shell
  // the shell then creates a subprocess to run the command
  system("ls -l");
  printf("\nDone!\n");
}
