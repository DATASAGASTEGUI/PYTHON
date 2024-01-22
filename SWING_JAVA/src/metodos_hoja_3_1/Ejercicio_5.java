package metodos_hoja_3_1;

import java.util.Scanner;

public class Ejercicio_5 extends Metodos {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int digito;
       
       System.out.println("Ingrese dígito? ");
       digito = sc.nextInt();
       
       System.out.println("El código Ascii " + digito + " tiene el caracter " + toChar(digito));
       
    }
    
}
