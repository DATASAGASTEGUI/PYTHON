#include <stdio.h>

int main() {
	int i = 1; //Contador
	float nomina;
	float importeTotalPagar = 0;//Acumulador
	
	do {
		printf("Ingrese la nómina del trabajador %d? ",i);
		scanf("%f", &nomina);
		importeTotalPagar = importeTotalPagar + nomina;
		i++;
	}while(i<=10); //Verdadero se repite
	 printf("Importe Total Pagar: %.2f",importeTotalPagar);

	return 0;
}
