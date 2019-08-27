#include <stdio.h>
#include <stdlib.h>
int main (int argc, char* argv[]) {
  if(argc < 2){
    printf("Usage: ./a.out <filename>\n");
    exit(EXIT_FAILURE);
  }

  FILE *fp;
  int c;
  fp = fopen(argv[1],"r");
  if(fp == NULL){
    printf("File '%s' does not exist\n", argv[1]);
  }
  int eof = 0;
  while (!eof) {
    // get char
    c = fgetc(fp);
    if ( ! feof(fp) )
      printf("%c", c);
    else eof = 1;
  }
  fclose(fp);
  return(0);
}
