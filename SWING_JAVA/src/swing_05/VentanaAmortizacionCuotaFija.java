package swing_05;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class VentanaAmortizacionCuotaFija extends javax.swing.JFrame {

    String[] cabecera = {"Nº", "CUOTA", "CAPITAL", "INTERES", "SALDO"};
    String[][] data = {};
    DefaultTableModel dtm = new DefaultTableModel(data, cabecera);
    double prestamo;
    double ipm;
    double cuota;
    double periodo;

    public VentanaAmortizacionCuotaFija() {
        initComponents();
        tblAmortizacion.setModel(dtm);
        // Crear un renderizador de celda personalizado para justificar a la derecha
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        tblAmortizacion.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        tblAmortizacion.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        tblAmortizacion.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tblAmortizacion.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tblAmortizacion.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtPrestamo = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtInteresAnual = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();
        txtPeriodo = new javax.swing.JTextField();
        txtFrecuencia = new javax.swing.JTextField();
        txtInteresPeriodicoMensual = new javax.swing.JTextField();
        txtCuota = new javax.swing.JTextField();
        botCalculo = new javax.swing.JButton();
        botAmortizacion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAmortizacion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

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

        txtPrestamo.setForeground(new java.awt.Color(51, 0, 255));
        txtPrestamo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 204, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("AMORTIZACION CUOTA FIJA");
        lblTitulo.setOpaque(true);

        txtInteresAnual.setForeground(new java.awt.Color(51, 0, 255));
        txtInteresAnual.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtTiempo.setForeground(new java.awt.Color(51, 0, 255));
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPeriodo.setEditable(false);
        txtPeriodo.setForeground(new java.awt.Color(51, 0, 255));
        txtPeriodo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtFrecuencia.setForeground(new java.awt.Color(51, 0, 255));
        txtFrecuencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtInteresPeriodicoMensual.setEditable(false);
        txtInteresPeriodicoMensual.setForeground(new java.awt.Color(51, 0, 255));
        txtInteresPeriodicoMensual.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCuota.setEditable(false);
        txtCuota.setForeground(new java.awt.Color(51, 0, 255));
        txtCuota.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botCalculo.setFont(new java.awt.Font("Courier New", 0, 9)); // NOI18N
        botCalculo.setText("CALCULO");
        botCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCalculoActionPerformed(evt);
            }
        });

        botAmortizacion.setFont(new java.awt.Font("Courier New", 0, 9)); // NOI18N
        botAmortizacion.setText("CREAR TABLA AMORTIZACION");
        botAmortizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAmortizacionActionPerformed(evt);
            }
        });

        tblAmortizacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblAmortizacion);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRESTAMO");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INTERES ANUAL");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TIEMPO");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FRECUENCIA");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PERIODO");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("IPM");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CUOTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtInteresAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInteresPeriodicoMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botAmortizacion)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInteresAnual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(botCalculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInteresPeriodicoMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botAmortizacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCalculoActionPerformed
        //ENTRADA
        prestamo = Double.parseDouble(txtPrestamo.getText());
        double interesAnual = Double.parseDouble(txtInteresAnual.getText());
        double tiempo = Double.parseDouble(txtTiempo.getText());
        double frecuencia = Double.parseDouble(txtFrecuencia.getText());
        //CALCULO(SALIDA) 
        periodo = tiempo * frecuencia;
        txtPeriodo.setText(periodo + "");
        ipm = interesAnual / frecuencia / 100;//
        txtInteresPeriodicoMensual.setText(r1(ipm) + "");
        double ct = Math.pow((1 + ipm), -periodo);
        cuota = (prestamo * ipm) / (1 - ct);
        txtCuota.setText(r(cuota) + "");
    }//GEN-LAST:event_botCalculoActionPerformed

    private void botAmortizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAmortizacionActionPerformed
        limpiarTabla();
        double saldo = prestamo;
        double interes;
        double capital;
        int j = 1;
        double a = 0;
        int i;
        for (i = 0; i < periodo; i++) {
            interes = saldo * ipm;
            capital = cuota - interes;
            saldo = saldo - capital;
            //System.out.println(i + "  " + r(cuota) + "  " + r(capital) + "  " + r(interes) + "  " + r(saldo));
            String[] datos = {"", "", "", "", ""};
            dtm.addRow(datos);
            dtm.setValueAt(j, i, 0);
            dtm.setValueAt(r(cuota), i, 1);
            dtm.setValueAt(r(capital), i, 2);
            dtm.setValueAt(r(interes), i, 3);
            a = a + interes;
            dtm.setValueAt(r(saldo), i, 4);
            j++;
        }
        String[] datos = {"", "", "", "", ""};
        dtm.addRow(datos);
        dtm.setValueAt("TOTAL", i, 2);
        dtm.setValueAt(r(a), i, 3);
        
    }//GEN-LAST:event_botAmortizacionActionPerformed

    public void limpiarTabla() {
        int numeroFilasPintadas = dtm.getRowCount();
        for (int i = 0; i < numeroFilasPintadas; i++) {
            dtm.removeRow(0);
        }
        repaint();
    }

    public double r(double x) {
        return Math.round(x * 100) / 100.0;
    }

    public double r1(double x) {
        return Math.round(x * 1000000) / 1000000.0;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAmortizacionCuotaFija().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAmortizacion;
    private javax.swing.JButton botCalculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblAmortizacion;
    private javax.swing.JTextField txtCuota;
    private javax.swing.JTextField txtFrecuencia;
    private javax.swing.JTextField txtInteresAnual;
    private javax.swing.JTextField txtInteresPeriodicoMensual;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtPrestamo;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
