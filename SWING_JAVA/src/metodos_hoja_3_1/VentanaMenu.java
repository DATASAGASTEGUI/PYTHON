/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_hoja_3_1;

import java.awt.event.ItemEvent;

/**
 *
 * @author Curso Tarde
 */
public class VentanaMenu extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMenu
     */
    public VentanaMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboEjercicios = new javax.swing.JComboBox<>();
        lblTitulo = new javax.swing.JLabel();
        lblEjercicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboEjercicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8" }));
        cboEjercicios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboEjerciciosItemStateChanged(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MENU");

        lblEjercicio.setText("SELECCIONE UN EJERCICIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(lblEjercicio)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(cboEjercicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(49, 49, 49)
                .addComponent(lblEjercicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboEjercicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboEjerciciosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboEjerciciosItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String ejercicio = (String) cboEjercicios.getSelectedItem();
            if (ejercicio.equals(("Ejercicio 1"))) {
                //lblMensaje.setFont(new java.awt.Font(ejercicio, 0, 14));
            } else if (ejercicio.equals(("Ejercicio 2"))) {
                VentanaEjercicio2 v2 = new VentanaEjercicio2();
                v2.setVisible(true);
            } else if (ejercicio.equals(("Ejercicio 3"))) {
                //lblMensaje.setFont(new java.awt.Font(ejercicio, 0, 14));
            } else if (ejercicio.equals(("Ejercicio 4"))) {
                //lblMensaje.setFont(new java.awt.Font(ejercicio, 0, 14));
            } else if (ejercicio.equals(("Ejercicio 5"))) {
                VentanaEjercicio5 v5 = new VentanaEjercicio5();
                v5.setVisible(true);
            } else if (ejercicio.equals(("Ejercicio 6"))) {
                //lblMensaje.setFont(new java.awt.Font(ejercicio, 0, 14));
            } else if (ejercicio.equals(("Ejercicio 7"))) {
                //lblMensaje.setFont(new java.awt.Font(ejercicio, 0, 14));
            } else if (ejercicio.equals(("Ejercicio 8"))) {
                //lblMensaje.setFont(new java.awt.Font(ejercicio, 0, 14));
            }
        }
    }//GEN-LAST:event_cboEjerciciosItemStateChanged

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
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboEjercicios;
    private javax.swing.JLabel lblEjercicio;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}