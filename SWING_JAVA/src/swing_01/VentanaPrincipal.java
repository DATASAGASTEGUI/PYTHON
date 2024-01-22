package swing_01;
// SUMAR DOS NUMEROS USANDO VENTANAS DE MENSAJES

import javax.swing.JOptionPane;

public class VentanaPrincipal {

    public static void main(String[] args) {
       double numero1, numero2, suma;//
       // ENTRADA
       numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 1")); 
       numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 2"));
       
       suma = numero1 + numero2;
       
       // SALIDA
       JOptionPane.showMessageDialog(null, "La suma es " + suma, "Resultado,", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
