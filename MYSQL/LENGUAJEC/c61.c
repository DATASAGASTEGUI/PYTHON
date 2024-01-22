#include <stdio.h>

int main() {
    int p1, p2, p3;

    printf("Tiene 4 patas? ");
    scanf("%d", &p1);

    if (p1 == 1) {
        printf("Tiene orejas redondeadas? ");
        scanf("%d", &p2);

        if (p2 == 1) {
            printf("No es un gato\n");
        } else {
            printf("Tiene bigotes? ");
            scanf("%d", &p3);

            if (p3 == 1) {
                printf("Es un gato\n");
            } else {
                printf("No es un gato\n");
            }
        }
    } else {
        printf("No es un gato\n");
    }

    return 0;
}
