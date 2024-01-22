#include <stdio.h>

int main() {
	float nota;
	//ENTRADA
	printf("Ingrese nota? ");
	scanf("%f", &nota);
	//PROCESO - SALIDA
	if(nota >= 0 && nota <= 20) {
	   if(nota > 10.5) {
	   	  printf("Aprobado %.2f",nota);
	   }else {
	   	  printf("Reprobado %.2f",nota);
	   }	 
	}else {
	   printf("Nota no válida");
	}
	
	return 0;
}

