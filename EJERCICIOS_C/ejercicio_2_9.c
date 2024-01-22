#include <stdio.h>

int main() {
	int a,b,c;
	//ENTRADA
	printf("Ingrese a? "); scanf("%d", &a);
	printf("Ingrese b? "); scanf("%d", &b);
	printf("Ingrese c? "); scanf("%d", &c);
	//PROCESO - SALIDA
	if(a>=b && b>=c) {
	   printf("%d %d %d",a,b,c); printf("%d",1);
	}
	if(a>=c && c>b) {
	   printf("%d %d %d",a,c,b); printf("%d",2);
	}
	if(b>a && a>=c) {
	   printf("%d %d %d",b,a,c); printf("%d",3);
	}
	if(b>=c && c>a) {
	   printf("%d %d %d",b,c,a); printf("%d",4);
	}
	if(c>a && a>=b) {
	   printf("%d %d %d",c,a,b); printf("%d",5);
	}
	if(c>b && b>a) {
	   printf("%d %d %d",c,b,a); printf("%d",6);
	}	
}
