#include <stdio.h>

int main()
{
    printf("EJEMPLO 1: FLOAT A INT\n");
    float a = 1.72;
    int b = (int)a;

    printf("a: %.2f\n", a);
    printf("b: %d\n", b);

    printf("EJEMPLO 2: INT A CHAR\n");
    int c = 65;
    char d = (char)c;

    printf("c: %d\n", c);
    printf("d: %c\n", d);

    printf("EJEMPLO 3: CHAR A INT\n");
    char e = 'Z';
    int f = (int)e;

    printf("e: %c\n", e);
    printf("f: %d\n", f);
}