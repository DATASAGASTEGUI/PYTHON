#include <stdio.h>

int main() {
	int lado,i,j;
	
	printf("Ingrese el número de lados? ");
	scanf("%d", &lado);
	
	for(i=1; i<=lado; i++) {
		for(j=1; j<=lado; j++) {
			if(i==1 || i == lado) {			
			   printf("*");
		    }
		    if(i!=1 && i!=lado) {
		       if(j==1 || j==lado) {
		       	  printf("*");
			   }else {
			   	  printf(" ");
			   }
			}
		}
		printf("\n");
	}
	return 0;
}
