package swing_04;

import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int numeroi;
       String numeros;
       String patron = "[0-9]+";//    4,6, 8, 9, 0:    10, 20 
       
       System.out.print("Ingresar un número entero? ");
       numeros = sc.next();
       
       if(numeros.matches(patron)) {
           System.out.println("CORRECTO");
           for(int i=1; i<=45; i++) {
               System.out.println(i);
           }
       }else {
           System.out.println("NO CORRECTO");
       }
    }
    
}
