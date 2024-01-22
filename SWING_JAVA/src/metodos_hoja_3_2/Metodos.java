package metodos_hoja_3_2;

import java.util.Scanner;

public class Metodos {

    // EJERCICIO 9
    public static void leerVector(int[] m) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            System.out.println("Ingrese elemento posicion " + i + "? ");
            m[i] = sc.nextInt();
        }
    }

    // EJERCICIO 10
    public static void escribirVector(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }

    // EJERCICIO 11
    public static void productoEscalar(int[] v, int numero) {
        for (int i = 0; i < v.length; i++) {
            v[i] = numero * v[i];
        }
    }

    // EJERCICIO 12
    public static int member(int elem, int[] arr) {
        int bandera = 0;
        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                bandera = 1;
                break;
            }
        }
        return bandera;
    }

    // EJERCICIO 13
    public static int paresAst_1(char[] v) {
        int c1 = 0, c2 = 0;
        for (int i = 0; i < v.length; i++) {
            if (i % 2 == 0) {
                c1 = c1 + 1;
            }
            if (i % 2 == 0 && v[i] == '*') {
                c2 = c2 + 1;
            }
        }
        if (c1 == c2) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int paresAst_2(char[] v) {
        int bandera = 1;
        for (int i = 0; i < v.length; i++) {
            if (i % 2 == 0 && v[i] != '*') {
                bandera = 0;
                break;
            }
        }
        return bandera;
    }

    // EJERCICIO 14
    public static int numVoc(char[] v) {
        String patron = "[aeiouAEIOUáéíóú]";
        int c = 0;
        for (int i = 0; i < v.length; i++) {
            boolean correcto = (v[i] + "").matches(patron);
            if (correcto) {
                c++;
            }
        }
        return c;
    }

    // EJERCICIO 15
    public static int tresAst(char[] v) {
        int c = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == '*') {
                c++;
            }
        }
        if (c > 3) {
            return 1;
        } else if (c == 3) {
            return 2;
        } else {
            return 0;
        }
        /*
        Al menos asteriscos         1         4 5 6
        Sólo 3 asteriscos           2         3
        Menos de 3  asteriscos      0         0 1 2
         */

    }

    // EJERCICIO 17
    public static int nAstConsec_1(int n, char v[]) {
        int c = 0;
        char letra;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == '*') {
                c++;
                if (c >= n) {
                    break;
                }

            } else {
                c = 0;
            }
            // s k a * k 2 a * * *
        }
        if (c >= n) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int nAstConsec_2(int n, char v[]) {
        int c = 0;
        int bandera = 0;
        
        for (int i = 0; i < v.length; i++) {
            if (v[i] == '*') {
                c++;
                if (c >= n) {
                    bandera = 1;
                    break;
                }
            } else {
                c = 0;
            }
        }
        // s k a * k 2 a * * *
        return bandera;
    }
    
    public static int tresGrupAstConsec(char v[]) {
        int c = 0;
        int cgrupo = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == '*') {
                c++;
                if (c == 3) {
                    cgrupo++;
                    c = 0;
                }
            } else {
                c = 0;
            }
        }
        // s k a * k 2 a * * *
        return cgrupo;
    }
    
    public static void reverse(int v[], int res[]) {
        int aux;
        for(int i=0, j=v.length-1; i<v.length/2; i++,j--) {
            aux = v[i];
            v[i] = v[j];
            v[j] = aux;
           
        }
    }

    public static void main(String[] args) {
        int[] v = {1,2,3,4};
        for(int i=0; i<v.length; i++) {
            System.out.println(v[i]);
        }
        reverse(v,v);
        for(int i=0; i<v.length; i++) {
            System.out.println(v[i]);
        }
        /*
        int n = 4;
        char[] caracteres = {'*', '*', '*', 'x', 'x', 'k', 'a', '*', 'k', '2', '*', '*', '*', 'a',
            '*', '*', '*', 'y'};
        System.out.println("Número: " + tresGrupAstConsec(caracteres));
*/
    }

}
