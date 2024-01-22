/*
DADO DOS CONJUNTOS DE LETRAS:
X = A B C
Y = A B
HALLAR TODAS LAS COMBINACIONES QUE SE PUEDEN GENERAR CON LOS DOS CONJUNTOS
*/

#include <stdio.h>
int main() {
    for(char x='A'; x<='C'; x++) {
        for(char y='A'; y<='B'; y++) {
            printf("%c%c  ", x, y);
        } 
    }

}
