#include <stdio.h>
#include <math.h>

int main() {
	int num, v;
	float val;

	printf("Ingrese valor de num? ");
	scanf("%d",&num);
	printf("Ingrese valor v? ");
	scanf("%d", &v);

	switch(num) {
		case 1: val = 100*v; break;
		case 2: val = pow(100,v); break;
		case 3: val = 100/v; break;
		default: val = 0;
	}
	printf("Val: %.2f", val);

	return 0;
}