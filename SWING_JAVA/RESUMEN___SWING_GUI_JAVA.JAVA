JAVA : CONSOLA (VENTANA DOS)
       WEB (JSP)
	   VENTANA ESCRITORIO (SWING) - GUI
	   MOVIL 
	   
****************
***   0001   ***   PROPIEDADES JLabel
****************

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); 
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("SUMAR DOS NUMEROS");
		lblTitulo.setOpaque(true);
		
****************
***   0002   ***   PROPIEDAD JTextField
****************

        txtSuma.setEditable(false);
        txtSuma.setForeground(new java.awt.Color(255, 51, 102));
		txtSuma.setFont(new java.awt.Font("Courier New", 0, 24)); 
        txtSuma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSuma.setPreferredSize(new java.awt.Dimension(66, 22));
		txtSuma.setBounds(100,100,300,50); //x,y,ancho,alto

****************
***   0002   ***   PERSONALIZAR VENTANA(JFRAME)
****************

public void personalizarFrame() {
        ImageIcon icono = new ImageIcon("image/mac.jpg");
        Image image = icono.getImage();
		
		this.setIconImage(image);//Cambia el icono a la ventana
        this.setTitle("DESARROLLO DE INTERFACES");//Poner título a la ventana
		this.setSize(400, 300); //Poner un ancho y altura a la ventana
		this.getContentPane().setBackground(Color.YELLOW);//Cambiar el color de fondo de la ventana
        this.setLocationRelativeTo(null); //Centra la ventana en la pantalla
        this.setResizable(false);//Desactiva el redimencionamiento del JFrame
}

****************
***   0002   ***   PERSONALIZAR CONTENEDOR PRINCIPAL
****************

public void personalizarContenedorPrincipal() {
        pnlContenedorPrincipal.setLayout(null);
        pnlContenedorPrincipal.setBackground(Color.LIGHT_GRAY);
}


SENTENCIA CONDICIONAL BINARIO
-----------------------------
DETERMINAR SI UN NUMERO ENTERO ES POSITIVO O NEGATIVO
int numero = 5;
if(numero > 0) {
   System.out.println("Positivo");
} else {
   System.out.println("Negativo");	
}
SENTENCIA CONDICIONAL MULTIPLE
-----------------------------
DETERMINAR SI UN NUMERO ENTERO ES CERO, POSITIVO O NEGATIVO
int numero = 5;
if(numero > 0) {
   System.out.println("Positivo");
} else if(numero < 0) {
   System.out.println("Negativo");	
} else {
  System.out.println("Cero");	
}

CODIGO RESUMEN
--------------
JPanel pnlPrincipal = (JPanel) this.getContentPane();
GridLayout gridLayout = new GridLayout(3,2,5,5);
   JButton bto1 = new JButton();
    JButton bto2 = new JButton();
    JButton bto3 = new JButton();
    JButton bto4 = new JButton();
	JButton bto5 = new JButton();
	JButton bto6 = new JButton();

		pnlPrincipal.setLayout(gridLayout);
    	pnlPrincipal.setBackground(Color.lightGray);
		pnlPrincipal.setBorder(BorderFactory.createEmptyBorder(5,4,5,4));	//sup,izq,inf,der
		
		
		
	    bto1.setText("1");
	    bto1.setMnemonic('1');
   		bto1.setBorder(BorderFactory.createEmptyBorder(2,15,2,15));
   		bto1.setForeground(Color.white);	
   		bto1.setBackground(new Color(153,153,204));
		bto1.addActionListener(this);
	    
	    bto2.setText("2");
	    bto2.setMnemonic('2');
   		bto2.setBorder(BorderFactory.createEmptyBorder(2,15,2,15));//sup,izq,inf,der
    	bto2.setForeground(Color.white);
   		bto2.setBackground(new Color(153,153,204));
		bto2.addActionListener(this);
	    
	    bto3.setText("3");
	    bto3.setMnemonic('3');
   		bto3.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));	
   		bto3.setForeground(Color.white);	
   		bto3.setBackground(new Color(153,153,204));
		bto3.addActionListener(this);
	    
	    bto4.setText("4");
	    bto4.setMnemonic('4');
   		bto4.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));		
   		bto4.setForeground(Color.white);	
   		bto4.setBackground(new Color(153,153,204));
		bto4.addActionListener(this);

	    bto5.setText("5");
	    bto5.setMnemonic('5');
   		bto5.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));	
   		bto5.setForeground(Color.white);	
   		bto5.setBackground(new Color(153,153,204));
		bto5.addActionListener(this);
	    
	    bto6.setText("6");
	    bto6.setMnemonic('6');
   		bto6.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));	
   		bto6.setForeground(Color.white);	
   		bto6.setBackground(new Color(153,153,204));
		bto6.addActionListener(this);
		
        pnlPrincipal.add(bto1); 
		pnlPrincipal.add(bto2);
		pnlPrincipal.add(bto3);
		pnlPrincipal.add(bto4);
		pnlPrincipal.add(bto5);
		pnlPrincipal.add(bto6);	

if(e.getSource() == bto1) { System.out.println("Se apreto boton: 1"); }
	   if(e.getSource() == bto2) { System.out.println("Se apreto boton: 2"); }
       if(e.getSource() == bto3) { System.out.println("Se apreto boton: 3"); }	   
	   if(e.getSource() == bto4) { System.out.println("Se apreto boton: 4"); }
	   if(e.getSource() == bto5) { System.out.println("Se apreto boton: 5"); }
	   if(e.getSource() == bto6) { System.out.println("Se apreto boton: 6"); }
		
	

JOptionPane.showMessageDialog(null, "La suma es " + suma, "Resultado,", JOptionPane.PLAIN_MESSAGE);

JOptionPane.showMessageDialog(null, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);

txtSuma.setHorizontalAlignment(javax.swing.JTextField.CENTER);

this.setLocationRelativeTo(null);

this.getContentPane().setBackground(Color.YELLOW);

**************************
***  EJEMPLO COMPLETO  ***
**************************

package swing_01;

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

public class MiVentana1 extends JFrame implements ActionListener {

    JPanel pnlPrincipal = (JPanel) this.getContentPane();
    GridLayout gridLayout = new GridLayout(3, 2, 5, 5);

    JButton bto1 = new JButton();
    JButton bto2 = new JButton();
    JButton bto3 = new JButton();
    JButton bto4 = new JButton();
    JButton bto5 = new JButton();
    JButton bto6 = new JButton();

    MiVentana1() {
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

        pnlPrincipal.add(bto1);
        pnlPrincipal.add(bto2);
        pnlPrincipal.add(bto3);
        pnlPrincipal.add(bto4);
        pnlPrincipal.add(bto5);
        pnlPrincipal.add(bto6);

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
        MiVentana1 ventana = new MiVentana1();
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

    }

}

	


