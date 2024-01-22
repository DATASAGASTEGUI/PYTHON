package swing_04;

public class Ejercicio3 {

    public static void main(String[] args) {
       int numero = 576;
       int cociente, residuo;
       int a = 0;
       while(numero != 0) {
           cociente = numero / 10; //57   5    0
           residuo = numero % 10; //6   7    5
           a = a + residuo;
           numero = cociente;
           //System.out.println(cociente + "   " + residuo);
       }
       
       
       
       
        
        
    }
    
}
