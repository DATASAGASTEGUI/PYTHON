package metodo;

public class OtrosMetodos extends Metodos {
    
    
    // METODOS CON EL MISMO NOMBRE (SOBRECARGAR EL METODO)
    public static int suma(int x, int y) {
        return x + y;
    }
    
    public static double suma(double x, double y) {
        return x + y;
    }
    
    public static double suma(double x, int y) {
        return x + y;
    }
    
    public static double suma(int x, double y) {
        return x + y;
    }
    
    public static double suma(double x, double y, double z) {
        return x + y + z;
    }
}
