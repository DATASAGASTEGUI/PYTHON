#include <stdio.h>

int main() {
	int altura, i,j,k,m,h;
	
	printf("Ingrese la altura del arbol? ");
	scanf("%d",&altura);
	
    for(i=1,j=1,m=altura; i<=altura; i++,j=j+2,m--) { //Altura (filas)
        for(h=1; h<=m; h++) {
        	printf(" ");
		}
		for(k=1; k<=j; k++) {
	        printf("x");
	    }
	    printf("\n");
	}
	return 0;
}
