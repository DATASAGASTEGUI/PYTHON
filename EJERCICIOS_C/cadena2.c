#include <stdio.h> 

int main() {
	char cadena[10];
	printf("Ingresa tu nombre? ");
	scanf("%s", cadena); //El espacio es el fin
	printf("Hola %s",cadena);
	while(getchar() != '\n'); //Limpiar el buffer de entrada
	char oracion[30];
	printf("\nIngrese una oración? ");
	fgets(oracion,sizeof(oracion),stdin);
	printf("Oracion: %s",oracion);
}
