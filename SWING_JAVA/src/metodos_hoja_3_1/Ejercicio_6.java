package metodos_hoja_3_1;

import java.util.Scanner;

public class Ejercicio_6 extends Metodos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un número entero? ");
        numero = sc.nextInt();
        
        System.out.println("El número " + numero + "  " + esCapicua(numero));
        
        System.out.println("El número " + numero + "  " + 
                            (esCapicua(numero)==1?"Capicua":"No Capicua"));
    }
    
}

/*
161, 292, 3003
*/