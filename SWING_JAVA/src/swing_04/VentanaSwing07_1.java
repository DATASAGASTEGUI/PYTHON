package swing_04;

import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaSwing07_1 extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();

    public VentanaSwing07_1() {
        initComponents();
        personalizarComponentes();
        personalizarVentana();
    }

    public void personalizarComponentes() {
        lstFruta.setModel(dlm);
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("imagen/cross1.png");
        Image image = icono.getImage();

        this.setIconImage(image);//Cambiar el icono de la ventana
        this.setTitle("VENTANA SWING");//Poner título a la ventana
        //this.setSize(400, 400); //Poner un ancho y altura a la ventana
        this.getContentPane().setBackground(Color.LIGHT_GRAY);//Cambiar el color de fondo de la ventana
        this.setLocationRelativeTo(null); //Centrar la ventana en la pantalla
        this.setResizable(false);//Desactivar el redimencionamiento del JFrame
        this.toFront(); //Poner la ventana al frente de todas
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstFruta = new javax.swing.JList<>();
        txtFruta = new javax.swing.JTextField();
        botAnadir = new javax.swing.JButton();
        botRemoverTodo = new javax.swing.JButton();
        botEliminarSeleccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstFruta);

        botAnadir.setText("AÑADIR");
        botAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAnadirActionPerformed(evt);
            }
        });

        botRemoverTodo.setText("REMOVER TODO");
        botRemoverTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRemoverTodoActionPerformed(evt);
            }
        });

        botEliminarSeleccion.setText("ELIMINAR SELECCION");
        botEliminarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEliminarSeleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtFruta, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(botAnadir)
                        .addGap(18, 18, 18)
                        .addComponent(botRemoverTodo)))
                .addGap(18, 18, 18)
                .addComponent(botEliminarSeleccion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txtFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botAnadir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botRemoverTodo)
                        .addComponent(botEliminarSeleccion)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAnadirActionPerformed
        String fruta = txtFruta.getText();
        String patron = "[a-zA-ZñÑáéíóú]+";
        if (fruta.length() > 0 && fruta.matches(patron)) {
            dlm.addElement(fruta);
        }
    }//GEN-LAST:event_botAnadirActionPerformed

    private void botRemoverTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRemoverTodoActionPerformed
        int n = dlm.getSize();
        for (int i = 0; i < n; i++) {
            dlm.remove(0);
        }
        txtFruta.setText("");
    }//GEN-LAST:event_botRemoverTodoActionPerformed

    private void botEliminarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEliminarSeleccionActionPerformed
        int[] selectedIndices = lstFruta.getSelectedIndices();
        // Reverse the indices so that removal doesn't affect other indices
        Arrays.sort(selectedIndices);
        for (int i = selectedIndices.length - 1; i >= 0; i--) {
            dlm.remove(selectedIndices[i]);
        }
    }//GEN-LAST:event_botEliminarSeleccionActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaSwing07_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSwing07_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSwing07_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSwing07_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSwing07_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAnadir;
    private javax.swing.JButton botEliminarSeleccion;
    private javax.swing.JButton botRemoverTodo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstFruta;
    private javax.swing.JTextField txtFruta;
    // End of variables declaration//GEN-END:variables
}
