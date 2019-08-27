#include <stdio.h>
#include <stdlib.h>

static void **vclean;
static size_t nclean;

void atexit_add(void *data)
{
    vclean = realloc(vclean, sizeof(void *) * (nclean + 1));
    vclean[nclean++] = data;
}

void clean(void)
{
    size_t i;
    printf("Freeing memory\n");
    fflush(stdout);
    for (i = 0; i < nclean; i++) {
        free(vclean[i]);
    }
    free(vclean);
}

int main(void)
{
    int *a, *b, *c;
    double *d;
    int e = 1;

    atexit(clean);
    a = &e;
    b = malloc(sizeof(int));
    atexit_add(b);
    c = malloc(sizeof(int));
    atexit_add(c);
    d = malloc(sizeof(double));
    atexit_add(d);
    for(int i=1; i<10; i++){
        int *tmp = realloc(b, (2<<i) * sizeof(int));
        if (tmp == NULL) // reallocated pointer ptr1
        {
            free(b);
            exit(0);
        }
        else
        {
            // b = NULL;
            b = tmp;           // the reallocation succeeded, we can overwrite our original pointer now
        }
        atexit_add(b);
    }
    return 0;
}
