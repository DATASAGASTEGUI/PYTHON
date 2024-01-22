package metodos_hoja_3_1;

import java.util.Scanner;

public class Ejercicio_2 extends Metodos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese número entero? ");
            numero = sc.nextInt();
            if(numero == 0) {
               break;
            }
            System.out.println(numero + "\t" + (esPrimo(numero)==1? "Primo":"No Primo"));
        }while(true);//VERDADERO REPITE, FALSO TERMINA
    }
    
      
}

/*
5    Primo
8    No Primo
4    No Primo
0    FIN


*/
