package swing_04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;

public class VentanaEjercicio7 extends javax.swing.JFrame {

    String[] cabecera = {"IDTRABAJADOR", "NOMBRE", "APELLIDO", "TIPO", "NOMBRE Y APELLIDO", "LONGITUD"};
    String[][] data = {};
    DefaultTableModel dtm = new DefaultTableModel(data, cabecera);

    public VentanaEjercicio7() {
        initComponents();
        cargarDatos();
        tblMostrar.setModel(dtm);
    }

    public void cargarDatos() {
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
            int a = 0;
            while ((registro = br.readLine()) != null) {
                String[] partes = registro.split(";");//T1;Lucrezia;Berroeta;1;532
                String[] datos = {"", "", "", "", "", ""};
                dtm.addRow(datos);
                dtm.setValueAt(partes[0], j, 0);
                dtm.setValueAt(partes[1], j, 1);
                dtm.setValueAt(partes[2], j, 2);
                dtm.setValueAt(partes[3], j, 3);
                dtm.setValueAt(partes[1] + " " + partes[2], j, 4);

                a = a + partes[1].length() + partes[2].length();

                dtm.setValueAt(partes[1].length() + partes[2].length(), j, 5);
                j++;
            }
            String[] datos = {"", "", "", "", "", ""};
            dtm.addRow(datos);
            //dtm.setValueAt(partes[0], j, 0);
            //dtm.setValueAt(partes[1], j, 1);
            //dtm.setValueAt(partes[2], j, 2);
            //dtm.setValueAt(partes[3], j, 3);
            dtm.setValueAt("TOTAL", j, 4);
            dtm.setValueAt(a, j, 5);
            
        } catch (Exception e) {
            System.out.println("ERROR LECTURA");
        }
    }

    public void buscarNombre(String nombre) {
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
                if (partes[1].equalsIgnoreCase(nombre)) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        scrollPane = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();
        botSalir = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

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

        botSalir.setText("SALIR");
        botSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(botSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(botSalir)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEjercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEjercicio7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblMostrar;
    // End of variables declaration//GEN-END:variables
}
