#include <stdio.h>

int main()
{
    {
        int suma = 0;
        int contador = 1;
        int numero = 1;

        // Sumar los primeros 10 primeros números impares
        while (contador <= 6)
        {
            suma += numero;
            numero += 2; // Saltar al siguiente número impar
            contador++;
        }
        // Imprimir el resultado
        printf("La suma de los primeros 60 números impares es: %d\n", suma);
    }
    {
        int suma = 0;
        int contador;
        int numero = 1;

        // Sumar los primeros 10 primeros números impares
        for(contador = 1; contador <= 6; contador++) 
        {
            suma += numero;
            numero += 2; // Saltar al siguiente número impar
        }
        // Imprimir el resultado
        printf("La suma de los primeros 60 números impares es: %d\n", suma);
    }

    

    return 0;
}