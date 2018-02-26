#ifndef __GIARDINO_H__
#define __GIARDINO_H__

const int NSPECIE = 5;
enum Specie {FAGGIO, CILIEGIO, ABETE, NOCE, BETULLA};
const char iniziali_specie[NSPECIE]={'F', 'C', 'A', 'N', 'B'};

struct Albero {
  Specie specie;
  int numero; // codice
};

Albero*** preparaGiardino(int rows, int cols);
void eliminaGiardino(Albero*** g, int rows, int cols);
void riempiGiardino(Albero***& g, int rows, int cols, int quanti[]);
void stampaGiardino(const Albero* const* const* g, int rows, int cols);

#endif
