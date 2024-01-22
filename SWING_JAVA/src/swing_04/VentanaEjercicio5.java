package swing_04;

import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaEjercicio5 extends javax.swing.JFrame {

    String[] cabecera = {"IDTRABAJADOR", "NOMBRE", "APELLIDO", "TIPO"};
    String[][] data = {};
    DefaultTableModel dtm = new DefaultTableModel(data, cabecera);

    public VentanaEjercicio5() {
        initComponents();
        cargarDatos("5");
        tblMostrar.setModel(dtm);
    }

    public void cargarDatos(String tipoTrabajador) {
        System.out.println(tipoTrabajador);
        limpiarTabla();
        File f;
        FileReader fr;
        BufferedReader br;
        String registro = "";
        String nra = "C:\\CERTIFICADO\\PYTHON\\SWING_JAVA\\src\\swing_04\\trabajador.csv";
        try {
            f = new File(nra);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            int j = 0;
            while ((registro = br.readLine()) != null) {
                String[] partes = registro.split(";");//T1;Lucrezia;Berroeta;1;532
                if (partes[3].equalsIgnoreCase(tipoTrabajador)) {
                    String[] datos = {"", "", "", ""};
                    dtm.addRow(datos);
                    dtm.setValueAt(partes[0], j, 0);
                    dtm.setValueAt(partes[1], j, 1);
                    dtm.setValueAt(partes[2], j, 2);
                    dtm.setValueAt(partes[3], j, 3);
                    j++;
                }
                if (tipoTrabajador.equalsIgnoreCase("5")) {
                    String[] datos = {"", "", "", ""};
                    dtm.addRow(datos);
                    dtm.setValueAt(partes[0], j, 0);
                    dtm.setValueAt(partes[1], j, 1);
                    dtm.setValueAt(partes[2], j, 2);
                    dtm.setValueAt(partes[3], j, 3);
                    j++;
                }

            }
        } catch (Exception e) {
            System.out.println("ERROR LECTURA");
        }
    }

    public void limpiarTabla() {
        int numeroFilasPintadas = dtm.getRowCount();
        for (int i = 0; i < numeroFilasPintadas; i++) {
            dtm.removeRow(0);
        }
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();
        botTodo = new javax.swing.JButton();
        botSalir = new javax.swing.JButton();
        cboTipoTrabajador = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPane.setViewportView(tblMostrar);

        botTodo.setText("TODO");
        botTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botTodoActionPerformed(evt);
            }
        });

        botSalir.setText("SALIR");
        botSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSalirActionPerformed(evt);
            }
        });

        cboTipoTrabajador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        cboTipoTrabajador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoTrabajadorItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(botSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboTipoTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botSalir)
                    .addComponent(botTodo))
                .addGap(0, 99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botTodoActionPerformed
        cargarDatos("5");
    }//GEN-LAST:event_botTodoActionPerformed

    private void botSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botSalirActionPerformed

    private void cboTipoTrabajadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipoTrabajadorItemStateChanged
        System.out.println("ENTRO 0");
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("ENTRO 1");
            String tipoTrabajador = (String) cboTipoTrabajador.getSelectedItem();
            if (tipoTrabajador.equals("1")) {
                cargarDatos(tipoTrabajador);
            } else if (tipoTrabajador.equals("2")) {
                cargarDatos(tipoTrabajador);
                System.out.println(tipoTrabajador);
            } else if (tipoTrabajador.equals("3")) {
                cargarDatos(tipoTrabajador);
            } else if (tipoTrabajador.equals("4")) {
                cargarDatos(tipoTrabajador);
            }
        }


    }//GEN-LAST:event_cboTipoTrabajadorItemStateChanged

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
            java.util.logging.Logger.getLogger(VentanaEjercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEjercicio5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botSalir;
    private javax.swing.JButton botTodo;
    private javax.swing.JComboBox<String> cboTipoTrabajador;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblMostrar;
    // End of variables declaration//GEN-END:variables
}
