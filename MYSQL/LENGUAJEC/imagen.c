#include <stdio.h>

int main() {
    int monoAsonrie, monoBsonrie, problema;

    while(1) {
        printf("¿El monoAsonrie (0=no, 1=si)? ");
        scanf("%d", &monoAsonrie);
        printf("¿El monoBsonrie (0=no, 1=si)? ");
        scanf("%d", &monoBsonrie);

        if(monoAsonrie) {
           if(monoBsonrie) {
              problema = 0;
           }else {
              problema = 1;
           }
        }else {
           if(monoBsonrie == 1) {
              problema = 1;
           }else {
              problema = 1;
           }
        }

        if(problema) {
           printf("Los monos se pega\n");
        }else {
           printf("Los monos se llevan bien\n");
        }
    }

    return 0;
}
