#include <stdio.h>
int main() {
	int x,y,z, con = 0;
	for(x=0; x<=100; x++) {
		for(y=0; y<=100; y++) {
			for(z=0; z<=100; z++) {
				if(3*x+2*y-7*z == 5) {
				   printf("(%d) %d %d %d\n",con++, x,y,z);
				}
			}
		}
	}
	
	
	return 0;
}
