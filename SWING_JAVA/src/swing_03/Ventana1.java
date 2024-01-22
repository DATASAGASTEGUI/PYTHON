package swing_03;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventana1 extends javax.swing.JFrame {

    public Ventana1() {
        initComponents();
        this.setTitle("MI PRIMERA VENTANA");
        this.setSize(new Dimension(400, 300));//ancho x alto

        ImageIcon icono = new ImageIcon("imagen/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Poner imagen a mi ventana barra titulo
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        txtNumero.setForeground(new java.awt.Color(255, 0, 0));//RGB: RED GREEN BLUE
        txtNumero.setFont(new java.awt.Font("Courier New", 1, 14)); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumero = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        cmdAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNumero.setText("Ingrese número entero?");

        cmdAceptar.setText("ACEPTAR");
        cmdAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNumero)
                        .addGap(26, 26, 26)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdAceptar)
                        .addGap(162, 162, 162))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero))
                .addGap(56, 56, 56)
                .addComponent(cmdAceptar)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAceptarActionPerformed
        try {
            int numero = Integer.parseInt(txtNumero.getText());
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "POSITIVO", "EVALUAR NUMERO", JOptionPane.PLAIN_MESSAGE);
            } else if (numero < 0) {
                JOptionPane.showMessageDialog(null, "NEGATIVO", "EVALUAR NUMERO", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "CERO", "EVALUAR NUMERO", JOptionPane.PLAIN_MESSAGE);
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "ENTRARDA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_cmdAceptarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Ventana1().setVisible(true);
                
                Ventana1 ventana = new Ventana1();
                ventana.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAceptar;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
