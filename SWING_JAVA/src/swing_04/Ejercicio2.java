package swing_04;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String numeros;
       String patron = "[0-9]+";
       int mayor = -9999999;
       int numeroi = 0;
       do {
            System.out.print("Ingresar numero entero? ");
            numeros = sc.next();
            if(numeros.matches(patron)) {
               numeroi = Integer.parseInt(numeros);
               if(numeroi > mayor)  {
                  mayor = numeroi; 
               }
            }else {
                System.out.println("ENTRADA INCORRECTA");
            }
       }while(numeroi != 0);//FALSE TERMINA  
       System.out.println("Mayor: " + mayor);
       
       
       
       
    }
    
}
