#include <stdio.h>

int main()
{
    {
        printf("EJEMPLO 1: FLOAT A INT\n");
        float a = 1.72;
        int b = (int)a;

        printf("a: %.2f\n", a);
        printf("b: %d\n", b);
    }

    {
        printf("EJEMPLO 2: INT A CHAR\n");
        int a = 65;
        char b = (char)a;

        printf("a: %d\n", a);
        printf("b: %c\n", b);
    }

    {
        printf("EJEMPLO 3: CHAR A INT\n");
        char a = 'Z';
        int b = (int)a;

        printf("a: %c\n", a);
        printf("b: %d\n", b);
    }
}
