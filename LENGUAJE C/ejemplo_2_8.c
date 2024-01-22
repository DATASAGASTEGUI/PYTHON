#include <stdio.h>


int main() {
	int categoria;
	float sueldo, sueldo2;
	//ENTRADA
	printf("Ingrese valor de categoría?");
	scanf("%d",&categoria);
	printf("Ingrese valor sueldo? ");
	scanf("%f", &sueldo);
	sueldo2 = sueldo;
	//PROCESO 1
	switch(categoria) {
		case 1: sueldo = sueldo * 1.15; break;
		case 2: sueldo = sueldo * 1.10; break;
		case 3: sueldo = sueldo * 1.08; break;
		case 4: sueldo = sueldo * 1.05; break;
	}
	if(categoria >= 1 && categoria <= 4) {
	   printf("Sueldo: %.2f", sueldo);
	}
	//PROCESO 2
	sueldo = sueldo2;
	if(categoria == 1) {
	   sueldo = sueldo * 1.15;
	}else if ( categoria == 2) {
	   sueldo = sueldo * 1.10;	
	}else if ( categoria == 3) {
	  sueldo = sueldo * 1.08;
	}else if ( categoria == 4) {
      sueldo = sueldo * 1.05;
	}
	if(categoria >= 1 && categoria <= 4) {
	   printf("\nSueldo: %.2f", sueldo);
	}

	return 0;
}
