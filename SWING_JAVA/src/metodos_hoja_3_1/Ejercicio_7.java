package metodos_hoja_3_1;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caracter;
        System.out.print("Ingrese un caracter? ");
        caracter = sc.next();
        int r = Metodos.esVocal(caracter.charAt(0));
        if(r == 1) {
            System.out.println("Vocal");
        }else {
            System.out.println("Cualquier otro caracter");
        }
    }
    
}
