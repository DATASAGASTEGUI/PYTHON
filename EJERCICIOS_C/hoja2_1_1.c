#include <stdio.h>
#include <stdlib.h>

int main() {
	int numero1, numero2;
	system("color 56");
	while(1) {
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
    }
	
	return 0;
}
