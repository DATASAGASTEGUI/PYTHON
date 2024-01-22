package metodo;

import java.awt.Color;
import javax.swing.JFrame;

public class Ventana extends JFrame {

    public Ventana() {
        initComponents();
    }

    public void initComponents() {
        //ImageIcon icono = new ImageIcon("image/cross2.png");
        //Image image = icono.getImage();

        //this.setIconImage(image);//Cambiar el icono de la ventana
        this.setTitle("VENTANA SWING ");//Poner título a la ventana
        this.setSize(400, 300); //Poner un ancho y altura a la ventana
        this.getContentPane().setBackground(Color.LIGHT_GRAY);//Cambiar el color de fondo de la ventana
        this.setLocationRelativeTo(null); //Centrar la ventana en la pantalla
        this.setResizable(false);//Desactivar el redimencionamiento del JFrame
        this.toFront(); //Poner la ventana al frente de todas
    }

    public static void main(String[] args) {
        
        Ventana v = new Ventana();
        v.setVisible(true);
        
        new Ventana().setVisible(true);
    }

}
