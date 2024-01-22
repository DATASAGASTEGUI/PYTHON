#include <stdio.h>

int main() {
	int n, i=1;
	float dinero;
	int horas, horasExtras;
	int sueldoBase = 200;
	int pagoHora = sueldoBase / 40;
	int excesoHoras;
	
	
	printf("Ingrese cantidad obreros? ");
	scanf("%d",&n);
	
	while(i <= n) {
		printf("Ingrese horas trabajadas obrero %d? ",i++);
		scanf("%d", &horas);
		if(horas > 40) {
		   horasExtras = horas - 40;
		   if(horasExtras <= 8) {
	          dinero = sueldoBase + horasExtras*(2*pagoHora);
	       }else {
	       	  excesoHoras = horasExtras - 8;
	       	  dinero = sueldoBase + 8 * (2*pagoHora) + excesoHoras * (3*pagoHora);
		   }
		}
		printf("Pago: %.2f", dinero);
	}
	return 0;
}
