#include <stdio.h>

int main() {
	int n, num;
	int i = 1, ceros = 0;
	
	printf("Cuantos números enteros desea ingresar? ");
	scanf("%d", &n);
	
	do {
		printf("Ingrese número %d ?",i); i++;
		scanf("%d", &num);
		if(num == 0) {
			ceros = ceros + 1;
		}
	}while(i <= n);
	printf("Cantidad de ceros: %d", ceros);

	return 0;
}
