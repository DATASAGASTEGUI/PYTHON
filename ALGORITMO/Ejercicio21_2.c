#include <stdio.h> 

int main() {
	char x, y, z,x1,y1,z1;
	char clave[6] = "ZZZZZZ"; //DECIFRAR TU CLAVE DE 3 LETRAS
	char cadena[6];
	for(x='A'; x<='Z'; x++) {
		for(y='A'; y<='Z'; y++) {
			for(z='A'; z<='Z'; z++) {
				for(x1='A'; x1<='Z'; x1++) {
		            for(y1='A'; y1<='Z'; y1++) {
			            for(z1='A'; z1<='Z'; z1++) {
			            	cadena[0] = x;
				            cadena[1] = y;
				            cadena[2] = z;
				            cadena[3] = x1;
				            cadena[4] = y1;
				            cadena[5] = z1;
							if(strcmp(clave, cadena) == 0) {
							   printf("Ya se tu clave %s",cadena);
							}
			            }
			        }
			    }
			
			}
			
		}
	}
}
