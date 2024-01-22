#include <stdio.h>

int main() {
	float n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
	float importeTotalPagar;
	
	printf("Ingrese la nómina del trabajador 1? ");
	scanf("%f", &n1);
	
	printf("Ingrese la nómina del trabajador 2? ");
	scanf("%f", &n2);

	printf("Ingrese la nómina del trabajador 3? ");
	scanf("%f", &n3);
	
	printf("Ingrese la nómina del trabajador 4? ");
	scanf("%f", &n4);
	
	printf("Ingrese la nómina del trabajador 5? ");
	scanf("%f", &n5);
	
	printf("Ingrese la nómina del trabajador 6? "); //Contador
	scanf("%f", &n6);
	
	printf("Ingrese la nómina del trabajador 7? ");
	scanf("%f", &n7);
	
	printf("Ingrese la nómina del trabajador 8? ");
	scanf("%f", &n8);
	
	printf("Ingrese la nómina del trabajador 9? ");
	scanf("%f", &n9);
	
	printf("Ingrese la nómina del trabajador 10? ");
	scanf("%f", &n10);
	
	importeTotalPagar = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10; //Acumulador

    printf("Importe Total Pagar: %.2f",importeTotalPagar);
	return 0;
}
