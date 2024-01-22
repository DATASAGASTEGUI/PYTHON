#include <stdio.h>

int main() {
	int mes;
	printf("Ingrese número del mes? ");
	scanf("%d", &mes);
	if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
	   printf("El mes %d tiene %d",mes,30);
	}else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
	   printf("El mes %d tiene %d",mes,31);	
	}else if(mes == 2) {
		printf("El mes %d tiene %d",mes,28);
	}else {
		printf("El mes %d no valido",mes);
	}
	
	return 0;
}
/*
30    4 6 9 11
31    1 3 5 7 8 10 12
28    2

1    31
2    28
3    31
4    30
5    31
6    30
7    31
8    31
9    30
10   31
11   30
12   31
*/
