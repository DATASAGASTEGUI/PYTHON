#include <stdio.h> 

int main() {
	float gasto;
	float sumagastos = 0;
	int i = 1;
	do {
	     printf("Ingrese gasto del viaje %d? ", i++);
	     scanf("%f", &gasto);
	     sumagastos = sumagastos + gasto;	
	}while(gasto != -1);
	printf("SUMA TOTAL     : %.2f",sumagastos);
	printf("\nNUMERO VIAJES: %d", (i-2));
	return 0;
}
