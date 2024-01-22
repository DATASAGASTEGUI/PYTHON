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

public class MiVentana2 extends JFrame implements ActionListener {

    JPanel pnlPrincipal = (JPanel) this.getContentPane();
    GridLayout gridLayout = new GridLayout(3, 3, 5, 5);

    JButton bto1 = new JButton();
    JButton bto2 = new JButton();
    JButton bto3 = new JButton();
    JButton bto4 = new JButton();
    JButton bto5 = new JButton();
    JButton bto6 = new JButton();
    
    JButton bto7 = new JButton();
    JButton bto8 = new JButton();
    JButton bto9 = new JButton();

    MiVentana2() {
        pnlPrincipal.setLayout(gridLayout);
        pnlPrincipal.setBackground(Color.lightGray);
        pnlPrincipal.setBorder(BorderFactory.createEmptyBorder(5, 4, 5, 4));	//sup,izq,inf,der

        bto1.setText("1");
        bto1.setMnemonic('1');
        bto1.setBorder(BorderFactory.createEmptyBorder(2, 15, 2, 15));
        bto1.setForeground(Color.white);
        bto1.setBackground(new Color(153, 153, 204));
        bto1.addActionListener(this);

        bto2.setText("2");
        bto2.setMnemonic('2');
        bto2.setBorder(BorderFactory.createEmptyBorder(2, 15, 2, 15));//sup,izq,inf,der
        bto2.setForeground(Color.white);
        bto2.setBackground(new Color(153, 153, 204));
        bto2.addActionListener(this);

        bto3.setText("3");
        bto3.setMnemonic('3');
        bto3.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bto3.setForeground(Color.white);
        bto3.setBackground(new Color(153, 153, 204));
        bto3.addActionListener(this);

        bto4.setText("4");
        bto4.setMnemonic('4');
        bto4.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bto4.setForeground(Color.white);
        bto4.setBackground(new Color(153, 153, 204));
        bto4.addActionListener(this);

        bto5.setText("5");
        bto5.setMnemonic('5');
        bto5.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bto5.setForeground(Color.white);
        bto5.setBackground(new Color(153, 153, 204));
        bto5.addActionListener(this);

        bto6.setText("6");
        bto6.setMnemonic('6');
        bto6.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bto6.setForeground(Color.white);
        bto6.setBackground(new Color(153, 153, 204));
        bto6.addActionListener(this);
        
        bto7.setText("7");
        bto7.setMnemonic('7');
        bto7.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bto7.setForeground(Color.white);
        bto7.setBackground(new Color(153, 153, 204));
        bto7.addActionListener(this);

        bto8.setText("8");
        bto8.setMnemonic('8');
        bto8.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bto8.setForeground(Color.white);
        bto8.setBackground(new Color(153, 153, 204));
        bto8.addActionListener(this);

        bto9.setText("9");
        bto9.setMnemonic('9');
        bto9.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bto9.setForeground(Color.white);
        bto9.setBackground(new Color(153, 153, 204));
        bto9.addActionListener(this);

        pnlPrincipal.add(bto1);
        pnlPrincipal.add(bto2);
        pnlPrincipal.add(bto3);
        pnlPrincipal.add(bto4);
        pnlPrincipal.add(bto5);
        pnlPrincipal.add(bto6);
        pnlPrincipal.add(bto7);
        pnlPrincipal.add(bto8);
        pnlPrincipal.add(bto9);

        personalizarFrame();
    }

    public void personalizarFrame() {
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
        MiVentana2 ventana = new MiVentana2();
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bto1) {
            System.out.println("Se apreto boton: 1");
            JOptionPane.showMessageDialog(null, "Se apreto boton: 1", "MENSAJE", JOptionPane.PLAIN_MESSAGE);
        }
        if (e.getSource() == bto2) {
            System.out.println("Se apreto boton: 2");
        }
        if (e.getSource() == bto3) {
            System.out.println("Se apreto boton: 3");
        }
        if (e.getSource() == bto4) {
            System.out.println("Se apreto boton: 4");
        }
        if (e.getSource() == bto5) {
            System.out.println("Se apreto boton: 5");
        }
        if (e.getSource() == bto6) {
            System.out.println("Se apreto boton: 6");
        }
        if (e.getSource() == bto7) {
            System.out.println("Se apreto boton: 4");
        }
        if (e.getSource() == bto8) {
            System.out.println("Se apreto boton: 5");
        }
        if (e.getSource() == bto9) {
            System.out.println("Se apreto boton: 6");
        }

    }

}

