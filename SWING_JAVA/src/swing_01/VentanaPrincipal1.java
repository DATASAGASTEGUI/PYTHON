package swing_01;

//INGRESAR N NUMEROS HASTA INGRESAR CERO. AL FINALIZAR EL PROGRAMA

import javax.swing.JOptionPane;

//EL PROGRAMA NOS DARA EL MAYOR NUMERO INGRESADO.
public class VentanaPrincipal1 {

    public static void main(String[] args) {
        int numero, mayor = -999999, contador = 1;
        do {
             numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número " + contador++));
             if(numero > mayor) {
                 mayor = numero;
             }
        }while(numero != 0);// 5 
        JOptionPane.showMessageDialog(null, "El mayor es " + mayor, "RESULTADO", JOptionPane.PLAIN_MESSAGE);
    }
}
