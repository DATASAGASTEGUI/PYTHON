#include <stdio.h>

int main() {
	int numero1, numero2;
	
	printf("Ingrese número 1? ");
	scanf("%d", &numero1);
		
	printf("Ingrese número 2? ");
	scanf("%d", &numero2);
	
	if(numero1 % numero2 == 0) {
		printf("El número %d es múltiplo de %d",numero1,numero2);
	}else if(numero2 % numero1 == 0) {
		printf("El número %d es múltiplo de %d",numero2,numero1);
	}else {
		printf("El número %d no es múltiplo de %d y viceversa",numero1,numero2);
	}
	
	return 0;
}
