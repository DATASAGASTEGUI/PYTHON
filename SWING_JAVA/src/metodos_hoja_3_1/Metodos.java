package metodos_hoja_3_1;

public class Metodos {

    // EJERCICIO 1
    public static long factorial(int x) {// 1 + 2 +3  a = a + numero
        int f;
        if (x == 0) {
            f = 1;
        } else {
            f = 1;
            for (int i = 1; i <= x; i++) {
                f = f * i;
            }
        }
        return f;
    }

    // EJERCICIO 2
    public static int esPrimo(int numero) {//0=No Primo, 1=Primo
        int bandera = 1;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                bandera = 0;
                break;
            }
        }
        return bandera;
    }

    // EJERCICIO 3
    public int cubo(int numero) {
        return numero * numero * numero;
    }

    // EJERCICIO 4
    public static float potencia(float base, int exponente) {
        float a = 1;
        for (int i = 1; i <= exponente; i++) {
            a = a * base;
        }
        return a;
    }

    // EJERCICIO 5
    public static char toChar(int codigoAscii) { //Entrada Código 57 --> 9
        return (char) codigoAscii;
    }

    // EJERCICIO 6
    public static int esCapicua(int numero) {
        //161 = 161 Capicua Igual
        //123 = 321 No Capicua Distintos
        int d, n = 0, original = numero;

        while (numero != 0) {
            d = numero % 10;
            numero = numero / 10;
            n = n * 10 + d;
        }
        if (original == n) {
            return 1;
        } else {
            return 0;
        }
    }

    // EJERCICIO 7
    public static int esVocal(char car) {
        String patron = "[aeiouAEIOU]";
        String cadena = car + "";
        boolean correcto = cadena.matches(patron);
        if (correcto) {
            return 1;
        } else {
            return 0;
        }
    }

    // EJERCICIO 8
    public static double constanteE(int n) {
        double e = 0;
        for (int i = 0; i <= n; i++) {
            e = e + 1.0 / factorial(i);
        }
        return e;
    }

}
