#include <stdio.h>

int main() {
	int dato;
	//ENTRADA
	printf("Ingrese dato? ");
	scanf("%d", &dato);
	//PROCESO
	if(dato > 0) {
	   if(dato % 2 == 0) {
	   	  printf("Par");
	   }else {
	   	  printf("Impar");
	   }	
	}
    return 0;
}
