/*
DADO DOS CONJUNTOS X= 1,2,3 Y EL CONJUNTO Y=1, 2
MOSTRAR LA COMBINACION ENTRE DICHOS CONJUNTOS QUE RESUELVAN
LA ECUACION SIGUIENTE X+Y=4
*/

#include <stdio.h>
int main()
{
    int x; // 1 2 3
    int y; // 1 2
    for (x = 1; x <= 3; x++)
    {
        for (y = 1; y <= 2; y++)
        {
            if ((x + y) == 4)
            {
                printf("%d%d ", x, y);
            }
        }
    }
}