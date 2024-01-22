#include <stdio.h>
#include <string.h>

int main() {
	{
	printf("EJEMPLO 1\n");
	printf("---------\n");
	char cadena[50] = "Hola Mundo\n";
	printf("%s", cadena);
	printf("\nLongitud de la cadena: %d", strlen(cadena));
    }
	{
	printf("EJEMPLO 2\n");
	printf("---------\n");	
    char cadena[50] = "Hola Mundo";
	printf("%s", cadena);
	printf("\nLongitud de la cadena: %d", strlen(cadena));
    }
	

	
	//nombre[strcspn(nombre,"a")] = '\0';
	
	//printf("\nCadena Resultado: %s", nombre);
	return 0;
}
