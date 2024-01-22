//*******************
//***   PACKAGE   ***            
//*******************
package swing_05;

//******************
//***   IMPORT   ***             
//******************
import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//*****************
//***   CLASE   ***             
//*****************
public class VentanaSwing11 extends JFrame implements ActionListener {

    //**********************************
    //***   VARIABLES DE INSTANCIA   ***             
    //**********************************
    JPanel pnlPrincipal = (JPanel) this.getContentPane();

    JLabel lblMensaje = new JLabel();
    JLabel lblTitulo = new JLabel();

    JCheckBox chk1 = new JCheckBox();
    JCheckBox chk2 = new JCheckBox();
    JCheckBox chk3 = new JCheckBox();
    JCheckBox chk4 = new JCheckBox();

    List<JCheckBox> clubs_al = new ArrayList<>();

    JButton btoAceptar = new JButton();
    JButton btoNuevo = new JButton();
    JButton btoSalir = new JButton();

    //***********************
    //***   CONSTRUCTOR   ***             
    //***********************    
    VentanaSwing11() {
        llenarArrayListConTodosJCheckBox();
        personalizarComponentes();
        personalizarPanelPrincipal();
        personalizarVentana();
    }

    public void llenarArrayListConTodosJCheckBox() {
        clubs_al.add(chk1);
        clubs_al.add(chk2);
        clubs_al.add(chk3);
        clubs_al.add(chk4);
    }

    //********************************
    //***   METODOS PERSONALIZAR   ***             
    //********************************
    public void personalizarComponentes() {
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14));
        lblTitulo.setText("SELECCIONAR CHECKBOX");
        lblTitulo.setBounds(new Rectangle(0, 0, 400, 20));
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setForeground(Color.yellow);
        lblTitulo.setOpaque(true);

        lblMensaje.setFont(new java.awt.Font("Courier New", 0, 13));
        lblMensaje.setText("AQUI SE PONDRA LO QUE SELECCIONE");
        lblMensaje.setBounds(new Rectangle(0, 60, 400, 17));// (x,y,ancho,altura)
        lblMensaje.setHorizontalAlignment(JLabel.CENTER);

        chk1.setText("SEVILLA");
        chk1.setBounds(new Rectangle(45, 120, 70, 17));
        chk1.setFont(new java.awt.Font("Courier New", 0, 11));
        chk1.setBackground(Color.LIGHT_GRAY);
        chk1.setName("SEVILLA");

        chk2.setText("MADRID");
        chk2.setBounds(new Rectangle(125, 120, 70, 17));
        chk2.setFont(new java.awt.Font("Courier New", 0, 11));
        chk2.setBackground(Color.LIGHT_GRAY);
        chk2.setName("MADRID");

        chk3.setText("BARCELONA");
        chk3.setBounds(new Rectangle(200, 120, 85, 17));
        chk3.setFont(new java.awt.Font("Courier New", 0, 11));
        chk3.setBackground(Color.LIGHT_GRAY);
        chk3.setName("BARCELONA");

        chk4.setText("BILBAO");
        chk4.setBounds(new Rectangle(290, 120, 85, 17));
        chk4.setFont(new java.awt.Font("Courier New", 0, 11));
        chk4.setBackground(Color.LIGHT_GRAY);
        chk4.setName("BILBAO");

        btoAceptar.setText("ACEPTAR");
        btoAceptar.setMnemonic('A');
        btoAceptar.setBounds(new Rectangle(70, 200, 80, 20));
        btoAceptar.setFont(new java.awt.Font("Courier New", 0, 11));
        btoAceptar.addActionListener(this);

        btoAceptar.setBackground(new java.awt.Color(0, 0, 0));
        btoAceptar.setForeground(new java.awt.Color(255, 255, 255));

        btoNuevo.setText("NUEVO");
        btoNuevo.setMnemonic('N');
        btoNuevo.setBounds(new Rectangle(160, 200, 80, 20));
        btoNuevo.setFont(new java.awt.Font("Courier New", 0, 11));
        btoNuevo.addActionListener(this);

        btoNuevo.setBackground(new java.awt.Color(0, 0, 0));
        btoNuevo.setForeground(new java.awt.Color(255, 255, 255));

        btoSalir.setText("SALIR");
        btoSalir.setMnemonic('S');
        btoSalir.setBounds(new Rectangle(250, 200, 80, 20));
        btoSalir.setFont(new java.awt.Font("Courier New", 0, 11));
        btoSalir.addActionListener(this);

        btoSalir.setBackground(new java.awt.Color(0, 0, 0));
        btoSalir.setForeground(new java.awt.Color(255, 255, 255));
    }

    public void personalizarPanelPrincipal() {
        pnlPrincipal.setLayout(null);
        pnlPrincipal.setBackground(Color.lightGray);
        pnlPrincipal.setBorder(BorderFactory.createEmptyBorder(5, 4, 5, 4)); //sup,izq,inf,der

        pnlPrincipal.add(lblTitulo);
        pnlPrincipal.add(lblMensaje);

        pnlPrincipal.add(chk1);
        pnlPrincipal.add(chk2);
        pnlPrincipal.add(chk3);
        pnlPrincipal.add(chk4);

        pnlPrincipal.add(btoAceptar);
        pnlPrincipal.add(btoNuevo);
        pnlPrincipal.add(btoSalir);
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/cross2.png");
        Image image = icono.getImage();

        this.setIconImage(image);//Cambiar el icono de la ventana
        this.setTitle("VENTANA SWING");//Poner título a la ventana
        this.setSize(400, 300); //Poner un ancho y altura a la ventana
        this.getContentPane().setBackground(Color.LIGHT_GRAY);//Cambiar el color de fondo de la ventana
        this.setLocationRelativeTo(null); //Centrar la ventana en la pantalla
        this.setResizable(false);//Desactivar el redimencionamiento del JFrame
        this.toFront(); //Poner la ventana al frente de todas
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //***********************************
    //***   METODOS MANEJAR EVENTOS   ***             
    //***********************************
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btoAceptar) {
            aceptar();
        }
        if (e.getSource() == btoNuevo) {
            nuevo();
        }
        if (e.getSource() == btoSalir) {
            salir();
        }
    }

    public void aceptar() {
        try {
            String a = "";
            for (int i = 0; i < clubs_al.size(); i++) {
                JCheckBox chk = clubs_al.get(i);
                if (chk.isSelected()) {
                    System.out.println(chk.getName());
                    a = a + chk.getName() + " - ";
                }
            }
            a = a.substring(0, a.length() - 3);
            lblMensaje.setText(a);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "SELECCIONE AL MENOS UN CHECKBOX", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void nuevo() {
        for (int i = 0; i < clubs_al.size(); i++) {
            JCheckBox chk = clubs_al.get(i);
            chk.setSelected(false);
        }
        lblMensaje.setText("AQUI SE PONDRA LO QUE SELECCIONE");
    }

    public void salir() {
        dispose();
    }

    //****************************
    //***   METODO PRINCIPAL   ***             
    //****************************
    public static void main(String arg[]) {
        VentanaSwing11 ventana = new VentanaSwing11();
        ventana.setVisible(true);
    }

}
