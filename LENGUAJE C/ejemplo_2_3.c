#include <stdio.h>

int main() {
	float nota;
	
	//ENTRADA
	printf("Ingrese nota? ");
	scanf("%f", &nota);
	//PROCESAR - SALIDA
	if(nota > 10.5) {
	   printf("Aprobado %.2f",nota);
	}else {
	   printf("Reprobado %.2f",nota);	
	}
	return 0;
}
