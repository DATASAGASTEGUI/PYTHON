package metodo;

public class Principal3 {

    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        System.out.println("Suma: " + Principal1.suma(a,b));
        
        int base = 3;
        int exponente = 4;
        System.out.println("Potencia: " + Metodos.potencia(base,exponente));
        
        int base1 = 5;
        int exponente1 = 3;
        System.out.println("Potencia: " + OtrosMetodos.potencia(base1,exponente1));
        
        int numero = 2;
        MisMetodos objeto = new MisMetodos();
        double raizcuadrada = objeto.raizCuadrada(numero);
        System.out.println("Raiz Cuadrada: " + raizcuadrada);
        
        int a1 = 3;
        double b1 = 8;
        double x = OtrosMetodos.suma(a1,b1);
        System.out.println("Suma: " + x);
    }
    
}
