//Leer un entero y escribirlo al rev�s

#include <stdio.h> 

int main() {
	//DADO UN NUMERO MOSTRAR EL DIGITO MAYOR  456
	int num, d, ni=0, mayor = -99999999;
	printf("Ingresar n�mero entero? ");
	scanf("%d", &num);
	
	while(num != 0) {
		d = num % 10;
		num = num / 10;
		ni = ni * 10 + d;
		if(d > mayor) {
		   mayor = d;
		}
		
		
		printf("%d\n", d);
	}
	printf("%d\n", ni);
	printf("D�gito mayor %d: ", mayor);
	
	return 0;
}
