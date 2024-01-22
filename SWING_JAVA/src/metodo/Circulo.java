package metodo;

public class Circulo {

    //ATRIBUTOS
    private double radio;

    //CONSTRUCTORES
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    //METODOS
    //SET Y GET
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // PROCESA LOS ATRIBUTOS
    public double perimetro() {
        return 2 * Math.PI * this.radio;
    }

    public double area() {
        return Math.PI * this.radio * this.radio;
    }

    // MOSTRAR LOS VALORES DE LOS ATRIBUTOS
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + this.radio + '}';
    }

    /*
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
    }
*/

}
