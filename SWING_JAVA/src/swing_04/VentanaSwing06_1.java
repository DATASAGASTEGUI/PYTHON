//*******************
//***   PACKAGE   ***            
//*******************
package swing_04;

//******************
//***   IMPORT   ***             
//******************
import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//*****************
//***   CLASE   ***             
//*****************
public class VentanaSwing06_1 extends JFrame implements ActionListener {

    //**********************************
    //***   VARIABLES DE INSTANCIA   ***             
    //**********************************
    JPanel pnlPrincipal = (JPanel) this.getContentPane();

    JLabel lblMensaje = new JLabel();
    JLabel lblTitulo = new JLabel();

    JRadioButton rdo0 = new JRadioButton();
    JRadioButton rdo1 = new JRadioButton();
    JRadioButton rdo2 = new JRadioButton();
    JRadioButton rdo3 = new JRadioButton();
    
    JRadioButton rdo4 = new JRadioButton();
    JRadioButton rdo5 = new JRadioButton();
    JRadioButton rdo6 = new JRadioButton();
    JRadioButton rdo7 = new JRadioButton();

    ButtonGroup bgEstilo = new ButtonGroup();

    //***********************
    //***   CONSTRUCTOR   ***             
    //***********************    
    VentanaSwing06_1() {
        personalizarComponentes();
        personalizarPanelPrincipal();
        personalizarVentana();
    }

    //********************************
    //***   METODOS PERSONALIZAR   ***             
    //********************************
    public void personalizarComponentes() {
        lblMensaje.setFont(new java.awt.Font("Courier New", 0, 12));
        lblMensaje.setBounds(new Rectangle(0, 80, 400, 20));// (x,y,ancho,altura)
        lblMensaje.setHorizontalAlignment(JLabel.CENTER);
        lblMensaje.setText("EN UN PUERTO ITALIANO AL PIE DE LA MONTAÑA");
        lblMensaje.setForeground(Color.black);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CAMBIAR EL ESTILO DE LETRA DINAMICAMENTE");
        lblTitulo.setOpaque(true);
        lblTitulo.setBounds(new Rectangle(0, 0, 400, 20));// (x,y,ancho,altura)
        lblTitulo.setForeground(Color.yellow);

        rdo0.setText("PLAIN");
        rdo0.setBounds(new Rectangle(5, 150, 90, 17));// (x,y,ancho,altura)
        rdo0.setFont(new java.awt.Font("Courier New", 0, 10));
        rdo0.setBackground(Color.LIGHT_GRAY);
        rdo0.addActionListener(this);

        rdo1.setText("BOLD");
        rdo1.setBounds(new Rectangle(105, 150, 90, 17));// (x,y,ancho,altura)
        rdo1.setFont(new java.awt.Font("Courier New", 0, 10));
        rdo1.setBackground(Color.LIGHT_GRAY);
        rdo1.addActionListener(this);

        rdo2.setText("ITALIC");
        rdo2.setBounds(new Rectangle(195, 150, 90, 17));// (x,y,ancho,altura)
        rdo2.setFont(new java.awt.Font("Courier New", 0, 10));
        rdo2.setBackground(Color.LIGHT_GRAY);
        rdo2.addActionListener(this);

        rdo3.setText("BOLD ITALIC");
        rdo3.setBounds(new Rectangle(285, 150, 95, 17));// (x,y,ancho,altura)
        rdo3.setFont(new java.awt.Font("Courier New", 0, 10));
        rdo3.setBackground(Color.LIGHT_GRAY);
        rdo3.addActionListener(this);
        
        rdo4.setText("ROJO");
        rdo4.setBounds(new Rectangle(5, 180, 90, 17));// (x,y,ancho,altura)
        rdo4.setFont(new java.awt.Font("Courier New", 0, 10));
        rdo4.setBackground(Color.LIGHT_GRAY);
        rdo4.addActionListener(this);
        
        rdo5.setText("VERDE");
        rdo5.setBounds(new Rectangle(105, 180, 90, 17));// (x,y,ancho,altura)
        rdo5.setFont(new java.awt.Font("Courier New", 0, 10));
        rdo5.setBackground(Color.LIGHT_GRAY);
        rdo5.addActionListener(this);  
        
        rdo6.setText("AZUL");
        rdo6.setBounds(new Rectangle(195, 180, 90, 17));// (x,y,ancho,altura)
        rdo6.setFont(new java.awt.Font("Courier New", 0, 10));
        rdo6.setBackground(Color.LIGHT_GRAY);
        rdo6.addActionListener(this); 
        
        rdo7.setText("NEGRO");
        rdo7.setBounds(new Rectangle(285, 180, 95, 17));// (x,y,ancho,altura)
        rdo7.setFont(new java.awt.Font("Courier New", 0, 10));
        rdo7.setBackground(Color.LIGHT_GRAY);
        rdo7.addActionListener(this);   

        bgEstilo.add(rdo0);
        bgEstilo.add(rdo1);
        bgEstilo.add(rdo2);
        bgEstilo.add(rdo3);
        bgEstilo.add(rdo4);
        bgEstilo.add(rdo5);
        bgEstilo.add(rdo6);
        bgEstilo.add(rdo7);
    }

    public void personalizarPanelPrincipal() {
        pnlPrincipal.setLayout(null);
        pnlPrincipal.setBackground(Color.LIGHT_GRAY);
        //pnlPrincipal.setBorder(BorderFactory.createEmptyBorder(5, 4, 5, 4)); //sup,izq,inf,der

        pnlPrincipal.add(lblMensaje);
        pnlPrincipal.add(lblTitulo);

        pnlPrincipal.add(rdo0);
        pnlPrincipal.add(rdo1);
        pnlPrincipal.add(rdo2);
        pnlPrincipal.add(rdo3);
        
        pnlPrincipal.add(rdo4);
        pnlPrincipal.add(rdo5);
        pnlPrincipal.add(rdo6);
        pnlPrincipal.add(rdo7);
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("imagen/cross1.png");
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
        if (e.getSource() == rdo0) {
            cambiarEstilo(0);
        }
        if (e.getSource() == rdo1) {
            cambiarEstilo(1);
        }
        if (e.getSource() == rdo2) {
            cambiarEstilo(2);
        }
        if (e.getSource() == rdo3) {
            cambiarEstilo(3);
        }
        if (e.getSource() == rdo4) {
            cambiarColor(Color.RED);
        }
        if (e.getSource() == rdo5) {
            cambiarColor(Color.GREEN);
        }
        if (e.getSource() == rdo6) {
            cambiarColor(Color.BLUE);
        }
        if (e.getSource() == rdo7) {
            cambiarColor(Color.BLACK);
        }
    }

    public void cambiarEstilo(int estilo) {
        lblMensaje.setFont(new java.awt.Font("Courier New", estilo, 20));
        this.repaint();
    }
    
    public void cambiarColor(Color color) {
        lblMensaje.setForeground(color);
        this.repaint();
    }

    //****************************
    //***   METODO PRINCIPAL   ***             
    //****************************
    public static void main(String arg[]) {
        VentanaSwing06_1 ventana = new VentanaSwing06_1();
        ventana.setVisible(true);
    }

}
