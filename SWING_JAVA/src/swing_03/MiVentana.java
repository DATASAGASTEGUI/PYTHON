// PAQUETES
package swing_03;

// NOMBRE CLASE
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public final class MiVentana extends JFrame {

    MiVentana(String titulo) {
        personalizarFrame(titulo);
    }

    public void personalizarFrame(String titulo) {
        ImageIcon icono = new ImageIcon("imagen/cross1.png");
        Image image = icono.getImage();

        this.setIconImage(image);//Cambia el icono a la ventana
        this.setTitle(titulo);//Poner título a la ventana
        this.setSize(400, 300); //Poner un ancho y altura a la ventana
        this.getContentPane().setBackground(Color.YELLOW);//Cambiar el color de fondo de la ventana
        this.setLocationRelativeTo(null); //Centra la ventana en la pantalla
        this.setResizable(false);//Desactiva el redimencionamiento del JFrame
    }

    public static void main(String args[]) {
        MiVentana ventana1 = new MiVentana("UNO");
        ventana1.setVisible(true);

        MiVentana ventana2 = new MiVentana("DOS");
        ventana2.setVisible(true);

        for (int i = 0; i < 5; i++) {

            MiVentana ventanax = new MiVentana(String.valueOf(i));
            ventanax.setVisible(true);
        }

    }

}
