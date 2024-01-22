#include <stdio.h> 

int main() {
	float sueldo;
	//ENTRADA
	printf("Ingrese sueldo? ");
	scanf("%f", &sueldo);
	//PROCESO - SALIDA
	if(sueldo < 1000) {
	   sueldo = sueldo * 1.17;	
	}else {
	   sueldo = sueldo * 1.12;
	}
	return 0
}
