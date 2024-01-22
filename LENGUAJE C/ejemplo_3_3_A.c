#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
	int n, num;
	int i = 1, ceros = 0;
	
	printf("Cuantos números enteros desea ingresar? ");
	scanf("%d", &n);
	srand(time(NULL)); //Semilla para que los números aleatorios siempre sea distintos
	do {
		num = rand()%11;
		printf("Ingrese número %d ? %d\n",i,num); i++;    //[0-10]
		if(num == 0) {
			ceros = ceros + 1;
		}
	}while(i <= n);
	printf("Cantidad de ceros: %d", ceros);

	return 0;
}
