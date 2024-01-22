#include <stdio.h>
#include <stdlib.h>
// TODOS LOS PRIMOS ENTRE 1-100
int main() {
	long n, bandera, j,i;//Primo

    for(j=1; j<=1000000; j++) {
    	bandera = 1;
		for(i=2; i<=(j-1); i++) {
		    if(j % i == 0) {
		       bandera = 0;//No Primo
		       break;
			}
	    }
	    if(bandera == 1) {
            printf("%d\n",j);
            //system("pause > nul");
	    }
	}

    return 0;	
}
