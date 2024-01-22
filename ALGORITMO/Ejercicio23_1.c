#include <stdio.h>

int main() {
    int i,j,p,m,n,k,q;

    for(i=1,j=0,k=6; i<=4; i++,j=j+6,k=k+6) {
    	for(m=1; m<=j; m++) {
    		printf(" ");
		}
        for(p=1; p<=6; p++) {
            printf("*");
        }
        printf("\n");
        for(n=1; n<=3; n++) {
        	for(q=1; q<=k; q++) {
        		printf(" ");
			}
        	printf("*");
        	printf("\n");
		}
        
    }

    return 0;
}
