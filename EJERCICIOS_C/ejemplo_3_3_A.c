#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
	int n, num;
	int i = 1, ceros = 0;
	
	printf("Cuantos n�meros enteros desea ingresar? ");
	scanf("%d", &n);
	srand(time(NULL)); //Semilla para que los n�meros aleatorios siempre sea distintos
	do {
		num = rand()%11;
		printf("Ingrese n�mero %d ? %d\n",i,num); i++;    //[0-10]
		if(num == 0) {
			ceros = ceros + 1;
		}
	}while(i <= n);
	printf("Cantidad de ceros: %d", ceros);

	return 0;
}
