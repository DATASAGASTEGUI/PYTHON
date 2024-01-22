package metodos_hoja_3_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaArray extends JFrame implements ActionListener {

    JLabel lblTamanio = new JLabel();
    JLabel lblResultado = new JLabel();
    
    JTextField txtTamanio = new JTextField();
    JButton botCrear = new JButton();
    JButton botImprimir = new JButton();

    JPanel pnlPrincipal = (JPanel) this.getContentPane();

    JPanel inputPanel = new JPanel();

    GridLayout gridLayout = new GridLayout(5, 3, 5, 5);//filas columnas espaciof espacioc

    public VentanaArray() {
        personalizarVentana();
        personalizarComponentes();
        personalizarPanelPrincipal();
    }

    public void personalizarComponentes() {
        lblTamanio.setFont(new java.awt.Font("Courier New", 0, 13));
        lblTamanio.setText("Ingresar tamaño array? ");
        lblTamanio.setBounds(new Rectangle(50, 60, 200, 20));// (x,y,ancho,altura)
        lblTamanio.setHorizontalAlignment(JLabel.LEFT);
        
        lblResultado.setFont(new java.awt.Font("Courier New", 0, 13));
        lblResultado.setText("RESULTADO ");
        lblResultado.setBounds(new Rectangle(0, 320, 400, 20));// (x,y,ancho,altura)
        lblResultado.setHorizontalAlignment(JLabel.CENTER);

        txtTamanio.setBounds(new Rectangle(240, 60, 80, 20));
        txtTamanio.setForeground(Color.blue);
        txtTamanio.setHorizontalAlignment(JTextField.CENTER);
        txtTamanio.setFont(new java.awt.Font("Courier New", 0, 13));

        botCrear.setText("CREAR");
        botCrear.setMnemonic('C');
        botCrear.setBounds(new Rectangle(80, 85, 100, 20));
        botCrear.setFont(new java.awt.Font("Courier New", 0, 11));
        botCrear.addActionListener(this);

        botImprimir.setText("IMPRIMIR");
        botImprimir.setMnemonic('I');
        botImprimir.setBounds(new Rectangle(190, 85, 100, 20));
        botImprimir.setFont(new java.awt.Font("Courier New", 0, 11));
        botImprimir.addActionListener(this);

        inputPanel.setBounds(new Rectangle(0, 115, 385, 185));
        inputPanel.setBackground(Color.BLACK);
        inputPanel.setLayout(gridLayout);
        inputPanel.setBorder(BorderFactory.createEmptyBorder(5, 4, 10, 4)); //sup,izq,in
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("imagen/cross1.png");
        Image image = icono.getImage();

        this.setIconImage(image);//Cambiar el icono de la ventana
        this.setTitle("VENTANA SWING");//Poner título a la ventana
        this.setSize(400, 400); //Poner un ancho y altura a la ventana
        this.getContentPane().setBackground(Color.LIGHT_GRAY);//Cambiar el color de fondo de la ventana
        this.setLocationRelativeTo(null); //Centrar la ventana en la pantalla
        this.setResizable(false);//Desactivar el redimencionamiento del JFrame
        this.toFront(); //Poner la ventana al frente de todas
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void personalizarPanelPrincipal() {
        pnlPrincipal.setLayout(null);
        pnlPrincipal.setBackground(Color.lightGray);
        pnlPrincipal.add(lblTamanio);
        pnlPrincipal.add(txtTamanio);
        pnlPrincipal.add(botCrear);
        pnlPrincipal.add(botImprimir);
        pnlPrincipal.add(inputPanel);
        pnlPrincipal.add(lblResultado);
    }

    public static void main(String[] args) {
        VentanaArray ventana = new VentanaArray();
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botCrear) {
            crear();
        }
        if (e.getSource() == botImprimir) {
            imprimir14();
        }
    }

    public void crear() {
        inputPanel.removeAll(); // Limpiar el panel de cajas de texto
        String patron = "[0-9]+";
        String tamanios = txtTamanio.getText();
        boolean correcto = tamanios.matches(patron);
        if (correcto) {
            for (int i = 0; i < Integer.parseInt(tamanios); i++) {
                JTextField txtCajita = new JTextField(2);
                txtCajita.setForeground(Color.blue);
                txtCajita.setHorizontalAlignment(JTextField.CENTER);
                txtCajita.setFont(new java.awt.Font("Courier New", 0, 15));
                inputPanel.add(txtCajita);
            }
            // Revalidar y repintar el panel
            inputPanel.revalidate();
            inputPanel.repaint();
        } else {
            JOptionPane.showMessageDialog(null, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void imprimir13() {
        List<String> caracteres = new ArrayList<>();
        Component[] components = inputPanel.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField txtCajita = (JTextField) component;
                if (txtCajita.getText().length() != 0) {
                    caracteres.add(txtCajita.getText());
                }
            }
        }
        char[] vector = new char[caracteres.size()];
        for(int i=0; i<caracteres.size(); i++) {
            vector[i] = caracteres.get(i).charAt(0);
        }
        lblResultado.setText(Metodos.paresAst_2(vector)==1?"SI CUMPLE":"NO CUMPLE");
        System.out.println(Metodos.paresAst_2(vector));
        System.out.println("Tamaño ArraList: " + caracteres.size());
    }
    
    public void imprimir14() {
        List<String> caracteres = new ArrayList<>();
        Component[] components = inputPanel.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField txtCajita = (JTextField) component;
                if (txtCajita.getText().length() != 0) {
                    caracteres.add(txtCajita.getText());
                }
            }
        }
        char[] vector = new char[caracteres.size()];
        for(int i=0; i<caracteres.size(); i++) {
            vector[i] = caracteres.get(i).charAt(0);
        }
        lblResultado.setText(String.valueOf(Metodos.numVoc(vector)));
    }    
}
