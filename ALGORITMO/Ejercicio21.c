#include <stdio.h>

int main() {
	int n, bandera = 1,i;//Primo
	printf("Ingrese número entero? ");
	scanf("%d", &n);
	for(i=2; i<=(n-1); i++) {
	    if(n % i == 0) {
	       bandera = 0;//No Primo
	       break;
		}
    }
    if(bandera == 1) {
       printf("Primo");
	}else {
	   printf("No Primo");
	}

    return 0;	
}
