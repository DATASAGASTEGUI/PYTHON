#include <stdio.h>

int main() {
	int n;
	float tf, tc;
	//ENTRADA
	printf("Número de sonidos emitidos por un grillo? ");
	scanf("%d", &n);
	//PROCESO - SALIDA
	if(n > 0) {
	   tf = n/4 + 40;
	   tc = (tf-32)*5/9.0;
	   printf("T. Fahrenheit: %.2f",tf);
	   printf("\nT. Celsius : %.2f",tc);
	}

	return 0;
	
}
