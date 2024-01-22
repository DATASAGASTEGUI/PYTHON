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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//*****************
//***   CLASE   ***             
//*****************
public class VentanaSwing02_2 extends JFrame implements ActionListener, ItemListener {

    //**********************************
    //***   VARIABLES DE INSTANCIA   ***             
    //**********************************
    JPanel pnlPrincipal = (JPanel) this.getContentPane();

    JLabel lblNumero1 = new JLabel();
    JLabel lblNumero2 = new JLabel();
    JLabel lblNumero3 = new JLabel();
    JLabel lblTitulo = new JLabel();

    JTextField txtNumero1 = new JTextField();
    JTextField txtNumero2 = new JTextField();
    JTextField txtSuma = new JTextField();

    JButton btoReiniciar = new JButton();
    JButton btoSalir = new JButton();

    JComboBox<String> cboOperacion = new JComboBox<>();

    //***********************
    //***   CONSTRUCTOR   ***             
    //***********************    
    VentanaSwing02_2() {
        personalizarComponentes();
        personalizarPanelPrincipal();
        personalizarVentana();
    }

    //********************************
    //***   METODOS PERSONALIZAR   ***             
    //********************************
    public void personalizarComponentes() {
        lblNumero1.setFont(new java.awt.Font("Courier New", 0, 13));
        lblNumero1.setText("Número 1 ? ");
        lblNumero1.setBounds(new Rectangle(90, 60, 90, 17));// (x,y,ancho,altura)
        lblNumero1.setHorizontalAlignment(JLabel.LEFT);

        lblNumero2.setFont(new java.awt.Font("Courier New", 0, 13));
        lblNumero2.setText("Número 2 ? ");
        lblNumero2.setBounds(new Rectangle(90, 100, 90, 17));
        lblNumero2.setHorizontalAlignment(JLabel.LEFT);

        lblNumero3.setFont(new java.awt.Font("Courier New", 0, 13));
        lblNumero3.setText("Resultado:");
        lblNumero3.setBounds(new Rectangle(90, 140, 100, 17));
        lblNumero3.setHorizontalAlignment(JLabel.LEFT);

        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14));
        lblTitulo.setText("OPERACIONES ARITMETICAS");
        lblTitulo.setBounds(new Rectangle(0, 0, 400, 20));
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setForeground(Color.yellow);
        lblTitulo.setOpaque(true);

        txtNumero1.setBounds(new Rectangle(180, 58, 120, 20));
        txtNumero1.setForeground(Color.blue);
        txtNumero1.setHorizontalAlignment(JTextField.CENTER);
        txtNumero1.setFont(new java.awt.Font("Courier New", 0, 13));

        txtNumero2.setBounds(new Rectangle(180, 98, 120, 20));
        txtNumero2.setForeground(Color.blue);
        txtNumero2.setHorizontalAlignment(JTextField.CENTER);
        txtNumero2.setFont(new java.awt.Font("Courier New", 0, 13));

        txtSuma.setBounds(new Rectangle(180, 138, 120, 20));
        txtSuma.setEditable(false);
        txtSuma.setForeground(Color.red);
        txtSuma.setHorizontalAlignment(JTextField.CENTER);
        txtSuma.setFont(new java.awt.Font("Courier New", 0, 13));

        btoReiniciar.setText("NUEVO");
        btoReiniciar.setMnemonic('N'); // Alt + N
        btoReiniciar.setBounds(new Rectangle(175, 200, 80, 20));
        btoReiniciar.setFont(new java.awt.Font("Courier New", 0, 13));
        btoReiniciar.addActionListener(this);

        btoReiniciar.setBackground(new java.awt.Color(0, 0, 0));
        btoReiniciar.setForeground(new java.awt.Color(255, 255, 255));

        btoSalir.setText("SALIR");
        btoSalir.setMnemonic('A');
        btoSalir.setBounds(new Rectangle(280, 200, 80, 20));
        btoSalir.setFont(new java.awt.Font("Courier New", 0, 13));
        btoSalir.addActionListener(this);

        btoSalir.setBackground(new java.awt.Color(0, 0, 0));
        btoSalir.setForeground(new java.awt.Color(255, 255, 255));

        cboOperacion.setBounds(new Rectangle(30, 200, 120, 20));// (x,y,ancho,altura)
        cboOperacion.setFont(new java.awt.Font("Courier New", 0, 12));
        cboOperacion.setBackground(new java.awt.Color(0, 0, 0));
        cboOperacion.setForeground(new java.awt.Color(255, 255, 255));
        cboOperacion.addItemListener(this);

        cboOperacion.addItem("OPERACION");
        cboOperacion.addItem("SUMAR");
        cboOperacion.addItem("RESTAR");
        cboOperacion.addItem("MULTIPLICAR");
        cboOperacion.addItem("DIVIDIR");
    }

    public void personalizarPanelPrincipal() {
        pnlPrincipal.setLayout(null);
        pnlPrincipal.setBackground(Color.lightGray);
        pnlPrincipal.setBorder(BorderFactory.createEmptyBorder(5, 4, 5, 4)); //sup,izq,inf,der

        pnlPrincipal.add(lblNumero1);
        pnlPrincipal.add(lblNumero2);
        pnlPrincipal.add(lblNumero3);
        pnlPrincipal.add(lblTitulo);

        pnlPrincipal.add(txtNumero1);
        pnlPrincipal.add(txtNumero2);
        pnlPrincipal.add(txtSuma);

        pnlPrincipal.add(btoReiniciar);
        pnlPrincipal.add(btoSalir);

        pnlPrincipal.add(cboOperacion);

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
        if (e.getSource() == btoReiniciar) {
            reiniciar();
        }
        if (e.getSource() == btoSalir) {
            salir();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String operacion = (String) cboOperacion.getSelectedItem();
            if (!operacion.equals("OPERACION")) {
                if (operacion.equals(("SUMAR"))) {
                    operacionAritmetica("+");
                } else if (operacion.equals(("RESTAR"))) {
                    operacionAritmetica("-");
                } else if (operacion.equals(("MULTIPLICAR"))) {
                    operacionAritmetica("*");
                } else if (operacion.equals(("DIVIDIR"))) {
                    operacionAritmetica("/");
                }
            }
        }
    }

    public void operacionAritmetica(String simbolo) {
        try {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            double resultado = 0;
            switch (simbolo) {
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        JOptionPane.showMessageDialog(null, "NO EXISTE DIVISION ENTRE CERO", "ERROR", JOptionPane.ERROR_MESSAGE);
                        reiniciar();
                    }
                    break;
            }
            txtSuma.setText(String.valueOf(Math.round(resultado * 100) / 100.0));
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "ENTRADA INCORRECTA", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void reiniciar() {
        txtNumero1.setText("");
        txtNumero2.setText("");
        txtSuma.setText("");
        cboOperacion.setSelectedIndex(0);
    }

    public void salir() {
        dispose();
    }

    //****************************
    //***   METODO PRINCIPAL   ***             
    //****************************
    public static void main(String arg[]) {
        VentanaSwing02_2 ventana = new VentanaSwing02_2();
        ventana.setVisible(true);
    }

}
