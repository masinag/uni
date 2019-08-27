#include <time.h>
#include <stdlib.h>
#include <stdio.h>

int main(){
  time_t current_time;
  char* c_time_string;
  current_time = time(NULL);
  // if it fails it returns -1 _> cast to time_t needed
  if(current_time == ((time_t)-1)){
    printf("Failure to obtain...\n");
    exit(EXIT_FAILURE);
  }
  c_time_string = ctime(&current_time);
  if(c_time_string == NULL){
    // print error on stderr [ (void) is not needed, it's the return value of fprintf]
    (void) fprintf(stderr, "Failure to convert...\n");
    exit(EXIT_FAILURE);
  }
  (void) printf("Current time is %s", c_time_string);
  exit(EXIT_SUCCESS);
}
