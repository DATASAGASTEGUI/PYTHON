package metodos_hoja_3_2;

public class Ejercicio13 {

    public static void main(String[] args) {
                       // 0    1    2    3    4   5
        char[] array1 = {'*', 'H', '*', 'N', '*'};        //1
        char[] array2 = {'*', 'H', '*', 'N', '*', '*'};   //1
        char[] array3 = {'*', 'H', '*', 'N', 'x', '*'};   //0
        char[] array4 = {'*', 'H', '*', 'N', '*', '*'};   //1

        System.out.println(Metodos.paresAst_2(array1));
        System.out.println(Metodos.paresAst_2(array2));
        System.out.println(Metodos.paresAst_2(array3));
        System.out.println(Metodos.paresAst_2(array4));
    }

}
