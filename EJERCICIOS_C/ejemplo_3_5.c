#include <stdio.h> 
#include <math.h>

int main() {
	int num;
	printf("Ingrese numero? ");
	scanf("%d", &num);
	while(num > 0) {
		printf("%d\n",(int)pow(num,3));
	    printf("Ingrese numero? ");
	    scanf("%d", &num);
	}
	return 0;
	
}
