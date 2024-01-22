#include <stdio.h>


int main() {
	int num, v;
	float val;
	//ENTRADA
	printf("Ingrese valor de num?");
	scanf("%d",&num);
	printf("Ingrese valor v? ");
	scanf("%d", &v);
	//PROCESO 1
	switch(num) {
		case 1: val = 100*v; break;
		case 2: val = pow(100,v); break;
		case 3: val = 100/v; break;
		default: val = 0;
	}
	printf("Val: %.2f", val);
	//PROCESO 2
	if(num == 1) {
	   val = 100*v;	
	}else if ( num == 2) {
	   val = pow(100,v);	
	}else if ( num == 3) {
	   val = 100/v;	
	}else {
	   val = 0;	
	}
	printf("\nVal: %.2f", val);
	return 0;
}
