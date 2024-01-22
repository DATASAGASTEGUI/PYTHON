package swing_05;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class VentanaSwing11_1 extends javax.swing.JFrame {

    List<JCheckBox> clubs_al = new ArrayList<>();

    public VentanaSwing11_1() {
        initComponents();
        clubs_al.add(chkSevilla);
        clubs_al.add(chkMadrid);
        clubs_al.add(chkBarcelona);
        clubs_al.add(chkBilbao);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        chkSevilla = new javax.swing.JCheckBox();
        chkMadrid = new javax.swing.JCheckBox();
        chkBarcelona = new javax.swing.JCheckBox();
        chkBilbao = new javax.swing.JCheckBox();
        botAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECCION MULTIPLE CHECKBOX");

        lblMensaje.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("AQUI SE PONDRA LO QUE SELECCIONE");

        chkSevilla.setText("SEVILLA");
        chkSevilla.setName("SEVILLA"); // NOI18N

        chkMadrid.setText("MADRID");
        chkMadrid.setName("MADRID"); // NOI18N

        chkBarcelona.setText("BARCELONA");
        chkBarcelona.setName("BARCELONA"); // NOI18N

        chkBilbao.setText("BILBAO");
        chkBilbao.setName("BILBAO"); // NOI18N

        botAceptar.setText("ACEPTAR");
        botAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(chkSevilla, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkBilbao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(botAceptar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(lblMensaje)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSevilla)
                    .addComponent(chkMadrid)
                    .addComponent(chkBarcelona)
                    .addComponent(chkBilbao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(botAceptar)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAceptarActionPerformed
        try {

            String a = "";
            for (int i = 0; i < clubs_al.size(); i++) {
                JCheckBox chk = clubs_al.get(i);
                if (chk.isSelected()) {
                    System.out.println(chk.getName());
                    a = a + chk.getName() + " - ";
                }
            }
            a = a.substring(0, a.length() - 3);
            lblMensaje.setText(a);
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR AL MENOS UN CLUB", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_botAceptarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSwing11_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAceptar;
    private javax.swing.JCheckBox chkBarcelona;
    private javax.swing.JCheckBox chkBilbao;
    private javax.swing.JCheckBox chkMadrid;
    private javax.swing.JCheckBox chkSevilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMensaje;
    // End of variables declaration//GEN-END:variables
}
