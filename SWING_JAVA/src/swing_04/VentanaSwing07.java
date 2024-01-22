package swing_04;

import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VentanaSwing07 extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();

    public VentanaSwing07() {
        initComponents();
        personalizar_JFrame();
        lstMostrar.setModel(dlm);
    }

    public void personalizar_JFrame() {
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setFont(new java.awt.Font("Courier New", 0, 12)); // Cambia la fuente de letra, estilo y tamaño
        //this.setIconImage(Toolkit.getDefaultToolkit().createImage(VentanaSwing07.class.getResource("icons8-linux-100.png"))); // Pone una imagen icono al JFrame
        this.setTitle("GUI"); // Pone un titulo al JFrame
        this.setLocationRelativeTo(null); // Centra el JFrame en la pantalla
        this.setResizable(false); // Desactiva el redimencionamiento del JFrame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstMostrar = new javax.swing.JList<>();
        cmdInsertar = new javax.swing.JButton();
        txtFruta = new javax.swing.JTextField();
        cmdRecuperar = new javax.swing.JButton();
        cmdRemover = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        cmdNuevo = new javax.swing.JButton();
        lblSalida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstMostrar);

        cmdInsertar.setForeground(new java.awt.Color(0, 0, 153));
        cmdInsertar.setText("Insertar");
        cmdInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInsertarActionPerformed(evt);
            }
        });

        txtFruta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdRecuperar.setForeground(new java.awt.Color(0, 0, 153));
        cmdRecuperar.setText("Recuperar");
        cmdRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRecuperarActionPerformed(evt);
            }
        });

        cmdRemover.setForeground(new java.awt.Color(0, 0, 153));
        cmdRemover.setText("Remover");
        cmdRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRemoverActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("INSERTAR - REMOVER - RECUPERAR FRUTAS SOBRE UNA LISTA");
        lblTitulo.setOpaque(true);

        cmdNuevo.setForeground(new java.awt.Color(0, 0, 153));
        cmdNuevo.setText("Limpiar");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });

        lblSalida.setBackground(new java.awt.Color(255, 255, 255));
        lblSalida.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        lblSalida.setForeground(new java.awt.Color(153, 0, 0));
        lblSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalida.setText("SALIDA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtFruta, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdRecuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(lblSalida)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdRecuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInsertarActionPerformed
        String patron = "[a-zA-ZñÑáéíóú]+";
        if (txtFruta.getText().matches(patron)) {
            dlm.addElement(txtFruta.getText());// TODO add your handling code here:
        }else {
            JOptionPane.showMessageDialog(this, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_cmdInsertarActionPerformed

    private void cmdRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRecuperarActionPerformed
        try {
            int n = dlm.getSize();
            String a = "";
            for (int i = 0; i < n; i++) {
                System.out.println(dlm.get(i));
                a = a + dlm.get(i) + " - ";
            }
            a = a.substring(0, a.length() - 3);
            lblSalida.setText(a);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "DEBE HABER AL MENOS UNA FRUTA EN LA LISTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmdRecuperarActionPerformed

    private void cmdRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRemoverActionPerformed
        int n = dlm.getSize();
        for (int i = 0; i < n; i++) {
            dlm.remove(0);
        }
    }//GEN-LAST:event_cmdRemoverActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        dlm.removeAllElements();
        txtFruta.setText("");
        lblSalida.setText("SALIDA");
    }//GEN-LAST:event_cmdNuevoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaSwing07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSwing07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSwing07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSwing07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSwing07().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdInsertar;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdRecuperar;
    private javax.swing.JButton cmdRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstMostrar;
    private javax.swing.JTextField txtFruta;
    // End of variables declaration//GEN-END:variables
}
