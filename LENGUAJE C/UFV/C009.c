#include <stdio.h>

int main()
{
    int a = 7; // Ambito global al bloque del main y a los dos bloques de abajo
    {
      int a = 2; // Ambito local a este bloque
      printf("%d\n",a); //2
    }
    {
      int a = 3; // Ambito local a este bloque
      printf("%d\n",a); //3
    }
    
    printf("%d\n",a); //7
   
    return 0;
}
