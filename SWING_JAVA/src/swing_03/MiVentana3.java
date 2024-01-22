package swing_03;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MiVentana3 extends JFrame implements ActionListener {

    JPanel pnlPrincipal = (JPanel) this.getContentPane();
    GridLayout gridLayout = new GridLayout(1, 1, 5, 5);
    JButton bto1 = new JButton();

    MiVentana3() {
        personalizarComponente();
        personalizarPanelPrincipal();
        personalizarVentana();
    }
    
    public void personalizarComponente() {
        bto1.setText("1");
        bto1.setMnemonic('1');
        bto1.setBorder(BorderFactory.createEmptyBorder(2, 15, 2, 15));
        bto1.setForeground(Color.white);
        bto1.setBackground(new Color(153, 153, 204));
        bto1.addActionListener(this);
    }
    
    public void personalizarPanelPrincipal() {
        pnlPrincipal.setLayout(gridLayout);
        pnlPrincipal.setBackground(Color.lightGray);
        pnlPrincipal.setBorder(BorderFactory.createEmptyBorder(5, 4, 5, 4));	//sup,izq,inf,der
        pnlPrincipal.add(bto1);
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("imagen/cross1.png");
        Image image = icono.getImage();

        this.setIconImage(image);//Cambia el icono a la ventana
        this.setTitle("Ventana");//Poner título a la ventana
        this.setSize(400, 300); //Poner un ancho y altura a la ventana
        this.getContentPane().setBackground(Color.YELLOW);//Cambiar el color de fondo de la ventana
        this.setLocationRelativeTo(null); //Centra la ventana en la pantalla
        this.setResizable(false);//Desactiva el redimencionamiento del JFrame
    }

    public static void main(String arg[]) {
        MiVentana3 ventana = new MiVentana3();
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bto1) {
            //System.out.println("Se apreto boton: 1");
           // JOptionPane.showMessageDialog(null, "Se apreto boton: 1", "MENSAJE", JOptionPane.PLAIN_MESSAGE);
            Ventana1 ventana = new Ventana1();
            ventana.setVisible(true);
        }
    }

}