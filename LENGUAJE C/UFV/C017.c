/*
DADO DOS CONJUNTOS DE NUMEROS
X = ALEATORIO [10-99]  TAMAÑO 10       UNO MAS QUE EL PRIMERO - EL PRIMERO
Y = ALEATORIO [10-99]  TAMAÑO 10
LA COMBINARION SIGUE ESTE ORDEN: XY
HALLAR TODAS LAS COMBINACIONES DONDE "X" ES PAR Y "Y" ES IMPAR
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main() {
    srand(time(NULL));
    int i, x;
    int j, y;
    int c = 1;

    for(i=1; i<=10; i++) {
        x = rand() % 90 + 10;
        for(j=1; j<=10; j++) {
            y = rand() % 90 + 10;
            if(x % 2 == 0 && y % 2 == 1) {
               printf("(%d) %d-%d  ",c++,x,y);
            }
        }
    }

    return 0;
}
