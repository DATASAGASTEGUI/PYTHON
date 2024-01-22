package metodos_hoja_3_2;

import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ingrese tamaño del array? ");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("LEER");
        Metodos.leerVector(array);
        System.out.println("ESCRIBIR");
        Metodos.escribirVector(array);
        */
        /*
        System.out.println("PRODUCTO ESCALAR");
        int numero = 7;
        Metodos.productoEscalar(array, numero);
        Metodos.escribirVector(array);
        */
        /*
        System.out.println("BUSCAR NUMERO EN EL ARRAY");
        int elem = 5;
        System.out.println(Metodos.member(elem, array)== 1?"SI":"NO");
        */
                       // 0    1    2    3    4   5
        char[] array1 = {'*', 'H', '*', 'N', '*'};     //1
        char[] array2 = {'*', 'H', '*', 'N', '*','*'};   //1
        char[] array3 = {'*', 'H', '*', 'N', 'x','*'}; //0
        
        System.out.println( Metodos.paresAst(array1));
        System.out.println( Metodos.paresAst(array2));
         System.out.println( Metodos.paresAst(array3));
        /*
        0 1 2 3 4
        * H * N *           1           
        X Y * M * O P Q     0
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        int x = 3;
        //DECLARAR ARRAY E INICIALIZAMOS AL MISMO TIEMPO
        int[] y = {4,5,7,8,9,1,3};
        System.out.println("Tamaño: " + y.length);
        
        //DECLARAR 
        int[] z = new int[6];
        //INICIALIZAR DESPUES
        z[0] = 8;
        z[1] = 7;
        z[2] = 3;
        z[3] = 4;
        z[4] = 6;
        z[5] = 9;
         Scanner sc = new Scanner(System.in);
        /*
       
        for(int i=0; i<z.length; i++) {
            System.out.print("Ingrese número ?");
            z[i] = sc.nextInt();
        }
        */
        /*
        //ARRAY DE TAMAÑO DINAMICO (SE PIDE EL TAMAÑO EN TIEMPO EJECUCION
        System.out.print("Ingrese tamaño del array ?");
        int tamanio = sc.nextInt();
        int[] array = new int[tamanio];
        for(int i=0; i<array.length; i++) {
            array[i] = (int)(Math.random()*6+1);
        }
        for(int i=0; i<tamanio; i++) {
            System.out.println(array[i]);
        }
*/
        /*
        int[] w = new int[3];
        mivector(w);
        for(int i=0; i<w.length; i++) {
            System.out.println(w[i]);
        }
*/
        
        
    }
    

    
}
