#include <stdio.h>

int main() {
	int numero1, numero2;
	
	printf("Ingrese n�mero 1? ");
	scanf("%d", &numero1);
		
	printf("Ingrese n�mero 2? ");
	scanf("%d", &numero2);
	
	if(numero1 % numero2 == 0) {
		printf("El n�mero %d es m�ltiplo de %d",numero1,numero2);
	}else if(numero2 % numero1 == 0) {
		printf("El n�mero %d es m�ltiplo de %d",numero2,numero1);
	}else {
		printf("El n�mero %d no es m�ltiplo de %d y viceversa",numero1,numero2);
	}
	
	return 0;
}
