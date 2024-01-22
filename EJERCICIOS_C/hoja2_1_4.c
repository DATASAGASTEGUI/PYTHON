#include <stdio.h> 
#include <math.h>
int main() {
	int a,b,c;
	printf("Ingrese cateto 1? ");
	scanf("%d", &a);
		
	printf("Ingrese cateto 2? ");
	scanf("%d", &b);
	
	printf("Ingrese hipotenusa 3? ");
	scanf("%d", &c);
	
	if(pow(a,2)+pow(b,2) == pow(c,2)) {
		printf("Cumplen el teorema de pitagoras %d %d %d",a,b,c);
	}else {
		printf("No Cumplen el teorema de pitagoras %d %d %d",a,b,c);
	}
	
	return 0;
}
