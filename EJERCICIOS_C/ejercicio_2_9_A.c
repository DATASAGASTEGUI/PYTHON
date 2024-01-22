#include <stdio.h>

int main() {
	int a,b,c;
	int caso1, caso2, caso3, caso4, caso5, caso6;
	int numeros[3];
	//ENTRADA
	printf("Ingrese a? "); scanf("%d", &a);
	printf("Ingrese b? "); scanf("%d", &b);
	printf("Ingrese c? "); scanf("%d", &c);
	//PROCESO - SALIDA
	caso1 = a>=b && b>=c;  numeros[0] "%d %d %d",a,b,c;
	caso2 = a>=c && c>b;  //printf("%d %d %d",a,c,b); printf("%d",2);
	caso3 = b>a && a>=c;  //printf("%d %d %d",b,a,c); printf("%d",3);
    caso4 = b>=c && c>a;  //printf("%d %d %d",b,c,a); printf("%d",4);
    caso5 = c>a && a>=b;  //printf("%d %d %d",c,a,b); printf("%d",5);
    caso6 = c>b && b>a;   //printf("%d %d %d",c,b,a); printf("%d",6);
    
    printf("Resultado 1 %d %s\n", caso1, cadena);
    printf("Resultado 2 %d\n", caso2);
    printf("Resultado 3 %d\n", caso3);
    printf("Resultado 4 %d\n", caso4);
    printf("Resultado 5 %d\n", caso5);
    printf("Resultado 6 %d\n", caso6);
	return 0;
}
