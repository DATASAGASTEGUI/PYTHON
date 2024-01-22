#include <stdio.h>

int main() {
	//int, float, double, char   Arreglos de Caracter:
	int i;
	char cadena[10] = "Hola Mundo";
	for(i=0; i<strlen(cadena); i++) {
		printf("%c", cadena[i]);
	}
	strcpy(cadena,"Hola España");//Para cambiar de contenido
	for(i=0; i<strlen(cadena); i++) {
		printf("%c", cadena[i]);
	}
    
    return 0;	
}
