package swing_04;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class VentanaEjercicio4 extends javax.swing.JFrame {

    String[] cabecera = {"IDALUMNO", "NOMBRE", "SEXO", "ESTATURA"};
    String[][] data = {};
    DefaultTableModel dtm = new DefaultTableModel(data, cabecera);
    //DATOS
    String[] idAlumno = {"A1", "A2", "A3", "A4", "A5"};
    String[] nombre = {"Arturo", "Ismael", "Ramon", "María", "Carmen"};
    char[] sexo = {'H', 'H', 'H', 'M', 'M'};
    double[] estatura = {1.72, 1.73, 1.74, 1.75, 1.67};

    public VentanaEjercicio4() {
        initComponents();
        personalizarTabla();
    }

    public void personalizarTabla() {
        tblMostrar.setModel(dtm);
        tblMostrar.setGridColor(Color.BLACK);
        tblMostrar.setRowHeight(21);
        tblMostrar.setBackground(Color.LIGHT_GRAY);
        tblMostrar.setFont(new java.awt.Font("Courier New",0,11));

        //CAMBIAR EL COLOR DE SELECCION
        tblMostrar.setSelectionForeground(Color.WHITE);
        tblMostrar.setSelectionBackground(Color.BLACK);
        
        //CAMBIAR EL COLOR DE ENCABEZADO
        JTableHeader header = tblMostrar.getTableHeader();
        header.setBackground(Color.BLACK);
        header.setForeground(Color.WHITE);
        
        
        cargarDatos();

    }

    public void cargarDatos() {
        //int fila = dtm.getRowCount();
        //System.out.println(fila);
        limpiarTabla();
        for (int i=0,j=0; i < idAlumno.length; i++,j++) {
            String[] datos = {"", "", "", ""};
            dtm.addRow(datos);
            dtm.setValueAt(idAlumno[i], j, 0);
            dtm.setValueAt(nombre[i], j, 1);
            dtm.setValueAt(sexo[i], j, 2);
            dtm.setValueAt(estatura[i], j, 3);
        }
    }
    
    public void limpiarTabla() {
        int numeroFilasPintadas = dtm.getRowCount();
        for(int i=0; i<numeroFilasPintadas; i++) {
            dtm.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        scrollPane = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();
        botHombre = new javax.swing.JButton();
        botMujer = new javax.swing.JButton();
        botTodo = new javax.swing.JButton();
        botSalir = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

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

        botHombre.setText("HOMBRE");
        botHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botHombreActionPerformed(evt);
            }
        });

        botMujer.setText("MUJER");
        botMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMujerActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(botHombre)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botSalir)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botMujer, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botHombre)
                    .addComponent(botMujer)
                    .addComponent(botTodo))
                .addGap(18, 18, 18)
                .addComponent(botSalir)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botHombreActionPerformed
        limpiarTabla();
        int j = 0;
        for (int i=0; i < idAlumno.length; i++) {
            if(sexo[i] == 'H') {
                System.out.println("ENTRADA");
                System.out.println(nombre[i]);
                String[] datos = {"", "", "", ""};
                dtm.addRow(datos);
                dtm.setValueAt(idAlumno[i], j, 0);
                dtm.setValueAt(nombre[i], j, 1);
                dtm.setValueAt(sexo[i], j, 2);
                dtm.setValueAt(estatura[i], j, 3);
                j++;
            }
        }
    }//GEN-LAST:event_botHombreActionPerformed

    private void botMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMujerActionPerformed
        limpiarTabla();
        int j = 0;
        for (int i=0; i < idAlumno.length; i++) {
            if(sexo[i] == 'M') {
                System.out.println("ENTRADA");
                System.out.println(nombre[i]);
                String[] datos = {"", "", "", ""};
                dtm.addRow(datos);
                dtm.setValueAt(idAlumno[i], j, 0);
                dtm.setValueAt(nombre[i], j, 1);
                dtm.setValueAt(sexo[i], j, 2);
                dtm.setValueAt(estatura[i], j, 3);
                j++;
            }
        }
    }//GEN-LAST:event_botMujerActionPerformed

    private void botTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botTodoActionPerformed
        cargarDatos();
    }//GEN-LAST:event_botTodoActionPerformed

    private void botSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEjercicio4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botHombre;
    private javax.swing.JButton botMujer;
    private javax.swing.JButton botSalir;
    private javax.swing.JButton botTodo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblMostrar;
    // End of variables declaration//GEN-END:variables
}
