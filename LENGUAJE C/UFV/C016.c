/*
DADO DOS CONJUNTOS DE LETRAS:
X = A B C
Y = A B C
HALLAR TODAS LAS COMBINACIONES QUE SEAN IGUALES
*/

#include <stdio.h>
int main() {
    for(char x='A'; x<='C'; x++) {
        for(char y='A'; y<='C'; y++) {
            if(x == y) {
               printf("%c%c  ", x, y);
            }
        } 
    }
}