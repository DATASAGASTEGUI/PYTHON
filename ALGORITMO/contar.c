#include <stdio.h>

int main() {
	int num, d, cont = 0, i, complemento=0, original;
	printf("Ingresar número entero? ");
	scanf("%d", &num);
	original = num;
	//CONTAR LA CANTIDAD DE DIGITOS
	while(num != 0) {
		d = num % 10;
		num = num / 10;
		cont++;
	}
	printf("Cantidad digitos %d:", cont);
	
	for(i=1; i<=cont; i++) {
		complemento = complemento * 10 + 9;
	}
	printf("Complemento: %d\n", complemento);
	
	printf("%d\n", (complemento - original));
	
	return 0;
}
