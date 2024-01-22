package matriz;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VentanaMatriz extends JFrame implements ActionListener {

    JPanel pnlPrincipal = (JPanel) this.getContentPane();
    DefaultTableModel dtm = new DefaultTableModel(3, 3);//fila columna
    JTable tblMatriz = new JTable(dtm);
    JButton botMostrar = new JButton();

    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JTextArea txt3 = new JTextArea();
    JScrollPane scpContenido = new JScrollPane();
    JTextField txt4 = new JTextField();
    JTextField txt5 = new JTextField();
    JTextField txt6 = new JTextField();

    public VentanaMatriz() {
        personalizarVentana();
        personalizarPanelPrincipal();
        personalizarTabla();
    }

    public void personalizarPanelPrincipal() {
        pnlPrincipal.setLayout(null);
        pnlPrincipal.setBackground(Color.lightGray);
        pnlPrincipal.add(tblMatriz);
        pnlPrincipal.add(botMostrar);
        pnlPrincipal.add(txt1);
        pnlPrincipal.add(txt2);
        pnlPrincipal.add(scpContenido);
        pnlPrincipal.add(txt4);
        pnlPrincipal.add(txt5);
        pnlPrincipal.add(txt6);
    }

    public void personalizarTabla() {
        tblMatriz.setGridColor(Color.BLACK);
        tblMatriz.setRowHeight(20); //Establecer la altura de cada fila en una tabla

        tblMatriz.setFont(new java.awt.Font("Courier New", 0, 11));
        tblMatriz.setBackground(Color.LIGHT_GRAY);
        tblMatriz.setForeground(Color.BLACK);
        tblMatriz.setBounds(new Rectangle(0, 0, 385, 200));

        botMostrar.setText("MOSTRAR");
        botMostrar.setMnemonic('M');
        botMostrar.setBounds(new Rectangle(150, 210, 100, 20));
        botMostrar.setFont(new java.awt.Font("Courier New", 0, 11));
        botMostrar.addActionListener(this);

        txt1.setBounds(new Rectangle(115, 90, 50, 20));
        txt1.setForeground(Color.blue);
        txt1.setHorizontalAlignment(JTextField.CENTER);
        txt1.setFont(new java.awt.Font("Courier New", 0, 13));

        txt2.setBounds(new Rectangle(175, 90, 50, 20));
        txt2.setForeground(Color.blue);
        txt2.setHorizontalAlignment(JTextField.CENTER);
        txt2.setFont(new java.awt.Font("Courier New", 0, 13));

        txt3.setForeground(Color.blue);
        //txt3.setHorizontalAlignment(JTextField.CENTER);
        txt3.setBackground(Color.BLUE);
        txt3.setFont(new java.awt.Font("Courier New", 0, 10));
        scpContenido.setViewportView(txt3);
        scpContenido.setBounds(new Rectangle(235, 90, 100, 20));

        txt4.setBounds(new Rectangle(115, 130, 50, 20));
        txt4.setForeground(Color.blue);
        txt4.setHorizontalAlignment(JTextField.CENTER);
        txt4.setFont(new java.awt.Font("Courier New", 0, 13));

        txt5.setBounds(new Rectangle(175, 130, 50, 20));
        txt5.setForeground(Color.blue);
        txt5.setHorizontalAlignment(JTextField.CENTER);
        txt5.setFont(new java.awt.Font("Courier New", 0, 13));

        txt6.setBounds(new Rectangle(235, 130, 50, 20));
        txt6.setForeground(Color.blue);
        txt6.setHorizontalAlignment(JTextField.CENTER);
        txt6.setFont(new java.awt.Font("Courier New", 0, 13));

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

    public static void main(String[] args) {
        VentanaMatriz ventana = new VentanaMatriz();
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botMostrar) {
            mostrar();
        }
    }

    public void mostrar() {
        System.out.println("Matriz ingresada:");
        int rowCount = dtm.getRowCount();
        int colCount = dtm.getColumnCount();
        //CREAR UNA MATRIZ
        int[][] matriz = new int[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                Object value = dtm.getValueAt(i, j);
                matriz[i][j] = Integer.parseInt(value + "");
                System.out.print(value + " ");
            }
            System.out.println();
        }
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        double promedio = suma / (rowCount * colCount);
        txt1.setText(promedio + "");
        txt2.setText(mayor(matriz) + "");
        txt3.setText(primos1(matriz));
        txt4.setText(sumaPares(matriz) + "");
        txt5.setText(sumaDiagonal(matriz) + "");
        txt6.setText(sumaUltimaFila(matriz)+"");
    }

    public int sumaUltimaFila(int[][] matriz) {
        int a = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            a = a + matriz[matriz.length - 1][j];
        }
        return a;
    }

    public int sumaDiagonal(int[][] matriz) {
        int a = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    a = a + matriz[i][j];
                }
            }
        }
        //matriz[2][0] +   2,2   0,2
        return a;
    }

    public int sumaPares(int[][] matriz) {
        int a = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    a = a + matriz[i][j];
                }
            }
        }
        return a;
    }

    public int mayor(int[][] matriz) {
        int mayor = -99999999;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;
    }

    public String primos1(int[][] matriz) {
        String a = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                a = a + primos2(matriz[i][j]) + " ";
            }
        }
        System.out.println(a);
        return a;
    }

    public String primos2(int numero) {
        int bandera = 1;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                bandera = 0;
                break;
            }
        }
        if (bandera == 1) {
            return numero + "";
        } else {
            return "";
        }
    }

}
