package metodo;

public class Principal5 {

    
    public Principal5() {

    }
    
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            Ventana1 v = new Ventana1(i+"");
            v.setVisible(true);
        }
    }
    
}
