#include <stdio.h>
#include <stdlib.h>
#define MAX 20

int parse(char*);
int main(){
  char n[MAX] = "788945620";
  printf("n: %s\n", n);
  int m = parse(n);
  printf("m: %d\n", m);

}
int parse(char *n){
  int res = 0;
  while(*n != '\0')
    res = res*10 + (*(n++)-'0');
  return res;
}
