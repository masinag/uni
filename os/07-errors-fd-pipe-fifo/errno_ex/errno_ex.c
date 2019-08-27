#include <stdio.h>
#include <errno.h>
#include <string.h>

extern int errno;

int main(int argc, char* argv[]){
  FILE *pf;
  int errnum;
  pf = fopen ("not_existing_file.idk", "rb");
  if (pf==NULL) {
    // errno is the error code
    errnum = errno;
    fprintf(stderr, "errno = %d\n", errno);
    // perror prints the given string followed by ': <error_string>'
    perror("Error printed by perror");
    // strerror returns the error string
    fprintf(stderr, "Error opening file: %s\n", strerror(errnum));
  } else {
    fclose(pf);
  }
  return 0;
}
