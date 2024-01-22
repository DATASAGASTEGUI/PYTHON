#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main() {
	int numero1, numero2;
	char letra;
	system("color 56");
	do {
		system("cls");
		
		printf("Ingrese número 1? ");
		scanf("%d", &numero1);
		
		printf("Ingrese número 2? ");
		scanf("%d", &numero2);
		
		if(numero1 < numero2) {
		   printf("%d,%d", numero1,numero2);
		}else {
		   printf("%d,%d", numero2,numero1);
		}
		printf("\n");
		system("pause");
		
		printf("Desea continuar S? ");
		scanf(" %c",&letra);
		
		letra = toupper(letra);
		
    }while(letra == 'S');
	system("cls");
	printf("GRACIAS POR SU VISITA");
	return 0;
}
