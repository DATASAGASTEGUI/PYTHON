#include <stdio.h> 

int main() {
	float gasto;
	float sumagastos = 0;
	int i = 1;
	
	printf("Ingrese gasto del viaje %d? ",i++);
	scanf("%f", &gasto);
	while(gasto != -1) {
	   sumagastos = sumagastos + gasto;	
	   printf("Ingrese gasto del viaje %d? ", i++);
	   scanf("%f", &gasto);
	}
	printf("SUMA TOTAL   : %.2f",sumagastos);
	printf("\nNUMERO VIAJES: %d", (i-2));
	return 0;
}
