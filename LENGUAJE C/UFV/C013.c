/*
OBTENER TODAS LAS COMBINACIONES ENTRE 2 CONJUNTOS
A = 1, 2
B = 1, 2, 3
*/

#include <stdio.h>

int main() {
    int a = 3;
    int b = 2;

    for(int i=1; i<=3; i++) { //A
        for(int j=1; j<=2; j++) { //B
            printf("%d%d ", i,j);
        }
    }
    return 0;
}