#include <stdio.h>

int main()
{
    printf("BUCLE FOR: SERIE 1 2 3 4 5 6 7 8 9 10 (INCREMENTO DE 1 EN 1)\n");
    int i;
    for(i=1; i<=10; i++) { //i++  =  i = i + 1
        printf("%d ", i);
    }

    printf("\n");

    printf("BUCLE FOR: SERIE 1 3 5 7 (INCREMENTO DE 2 EN 2)\n");
    for(i=1; i<=7; i=i+2) {
        printf("%d ", i);
    }

    printf("\n");

    printf("BUCLE FOR: IMPRIMIR EL ALFABETO (LETRA)\n");
    for(i=65; i<=90; i++) { //i = i + 1
        printf("%c ",i);
    }

    printf("\n");

    printf("BUCLE FOR: IMPRIMIR EL ALFABETO (CODIGO)\n");
    char letra;
    for(letra = 'A'; letra<= 'Z'; letra++) {
        printf("%d ", letra);
    }
    return 0;
}