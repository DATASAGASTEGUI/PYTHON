#include <stdio.h> 

int main() {
	// SERIE NATURAL 1 ... 10
	// TODO BUCLE TIENE: INICIO, TEST(FIN), INCREMENTO
	
	{ //INICIO BLOQUE
		printf("BUCLE: WHILE\n");
		int i=1;  //INICIO
        int n=10; 
		while(i <= n) { //TEST(INICIO)
			printf("%d ", i);
			i++; // INCREMENTO
		}
    } //FIN BLOQUE
	
	{ //INICIO BLOQUE
		printf("\nBUCLE: DO...WHILE\n"); //VALIDAR DATOS
		int i=1; //INICIO
		int n=10;
		do {
			printf("%d ", i);
			i++; // INCREMENTO
		}while(i <= n); //TEST(ULTIMO)
	} //FIN BLOQUE
	
	{ //INICIO BLOQUE
		printf("\nBUCLE: FOR\n");
		int i;
		int n=10;
		for(i=1; i<=n; i++){ //INICIO, TEST, INCREMENTO
			printf("%d ", i);
		}
	} //FIN BLOQUE
    return 0;	
}
