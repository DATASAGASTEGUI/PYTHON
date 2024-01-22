package swing_04;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VentanaEjercicio2 extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();
    int mayor = -999999;

    public VentanaEjercicio2() {
        initComponents();
        lstSalida.setModel(dlm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumero = new javax.swing.JTextField();
        botAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSalida = new javax.swing.JList<>();
        lblMayor = new javax.swing.JLabel();
        botReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botAceptar.setText("ACEPTAR");
        botAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAceptarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstSalida);

        lblMayor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botReiniciar.setText("REINICIAR");
        botReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(txtNumero)
                    .addComponent(lblMayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botReiniciar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(lblMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(botReiniciar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAceptarActionPerformed
        String numeros = txtNumero.getText();
        int numeroi = 0;
        String patron = "[0-9]+";
        if (numeros.matches(patron)) {
            numeroi = Integer.parseInt(numeros);
            if(numeroi != 0) {
                dlm.addElement(numeros);
                if (numeroi > mayor) {
                    mayor = numeroi;
                    System.out.println("Entrada" + mayor);
                }
            }else {
                System.out.println("Entrada2" + mayor);
                lblMayor.setText(String.valueOf(mayor));
                txtNumero.setText("");
                txtNumero.setEditable(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botAceptarActionPerformed

    private void botReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botReiniciarActionPerformed
        txtNumero.setEditable(true);
        txtNumero.setText("");
        dlm.clear();
        lblMayor.setText("");
    }//GEN-LAST:event_botReiniciarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEjercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAceptar;
    private javax.swing.JButton botReiniciar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMayor;
    private javax.swing.JList<String> lstSalida;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
