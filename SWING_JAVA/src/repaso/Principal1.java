package repaso;

public class Principal1 {

    public static void main(String[] args) {
        // SENTENCIA CONDICIONAL BINARIA
        int x = 5;
        if(x > 0) {
           System.out.println("Positivo");
        }else {
           System.out.println("Negativo");
        }
        
        // OPERADOR CONDICIONAL BINARIO
        //FORMA 1
        System.out.println((x > 0 ? "Positivo" : "Negativo"));
        //FORMA 2
        String resultado = x > 0 ? "Positivo" : "Negativo";
        System.out.println(resultado);
        
        // OPERADOR CONDICIONA BINARIO
        String clave = "abc";
        String cadena = "abc";
        System.out.println((clave.equals(cadena)? "SI" : "NO"));
        
        //EXPRESIONES LOGICAS: RETORNAR SIEMPRE UN TRUE O FALSE
        
        // OPERADOR CONDICIONA BINARIO
        String patron = "[a-zA-ZñÑáéíóú]+";
        String cadena1 = "Hola";
        System.out.println("" + (cadena1.matches(patron) ? "SI" : "NO"));
        
        // CONCATENACION (UNIR)
        int edad = 18;
        String y = "Javier tiene " + edad + " años ";
        System.out.println(y);
        // OPERADORADOR ARITMETICO
        int a = 5;
        int b = 6;
        String c = a + (b + "x"); //OPERADOR CONCATENACION
        System.out.println(c);
        
        System.out.println("Suma: " + (5 + 6));
        
        System.out.println("División: " + (5.0/6));
        float k = 5.6f;
        double estatura = 1.72f;
        int edad1 = 120;
        long edad2 = 999999999999999999L;
        int dato1 = 999999999;
        byte dato3 = -128; //  -128    127
        
        System.out.println(Byte.MAX_VALUE); //127
        System.out.println(Byte.MIN_VALUE); //-128
        
        System.out.println(Long.MAX_VALUE); // 9223372036854775807
        System.out.println(Long.MIN_VALUE); //-9223372036854775808
        
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648
        
        System.out.println(Short.MAX_VALUE); // 32767
        System.out.println(Short.MIN_VALUE); //-32768
        
        /*
        TIPOS DE DATOS PRIMITIVOS DE JAVA
        byte
        short     0   65777
        int            5, 6     
        long

        
        double         5.6
        float          
        
        char           'A',  '?', '1'
        
        String         "A", "1", "HOla", "1111" 
        
        boolean        true, false
        */
        
        Empleado e = new Empleado("Luis",(byte)30);
        System.out.println("Nombre: " + e.nombre);
        System.out.println("Edad: " + e.edad);
        
        int[] c1 = {4, 5, 7, 8};
        String[] nombres = {"Luis","Miguel"};
        System.out.println(nombres[1]);
        
    }
    
}
