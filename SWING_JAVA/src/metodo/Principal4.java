package metodo;

public class Principal4 {

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setRadio(5);
        System.out.println("Radio: " + c1.getRadio());
        System.out.println("Area: " + c1.area());
        System.out.println("Perimetro: " + c1.perimetro());
        
        Circulo c2 = new Circulo(8);
        System.out.println("Radio: " + c2.getRadio());
        System.out.println("Area: " + c2.area());
        System.out.println("Perimetro: " + c2.perimetro()); 
        
        System.out.println(c1);
        System.out.println(c2);
        
        double radio = 5.3;
        double area = Metodos.PI * radio * radio;
        double perimetro = 2 * Metodos.PI * radio;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        
        Ventana v = new Ventana();
        v.setVisible(true);
        
    }
    
}
