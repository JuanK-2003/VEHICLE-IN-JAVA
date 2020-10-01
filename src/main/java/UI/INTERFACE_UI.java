package UI;

import CLASS.MOTORCYCLE;
import CLASS.PICK_UP;
import CLASS.SEDAN;
import CLASS.TRUCK;
import CLASS.VAN;

/**
 *
 * @author Juan_K
*/
public class INTERFACE_UI extends javax.swing.JFrame {
    int cMotos = 0;
    int cSedan = 0;
    int cPick = 0;
    int cTruck = 0;
    int cVan = 0;
    
    public INTERFACE_UI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    void Create_MOTORCYCLE(){
        MOTORCYCLE[] Motos = new MOTORCYCLE[5];
        cMotos = 0;
        Motos[cMotos] = new MOTORCYCLE(jTextField1.getText(),
                jTextField2.getText(),
                Integer.parseInt(jTextField3.getText()),
                jTextField4.getText(),
                Integer.parseInt(jTextField5.getText()),
                jTextField6.getText());
        cMotos++;
    }
    void Create_SEDAN(){
        SEDAN[] Carros = new SEDAN[5];
        cSedan = 0;
        Carros[cSedan] = new SEDAN(jTextField1.getText(),
                Integer.parseInt(jTextField2.getText()),
                jTextField3.getText(),
                jTextField4.getText(),
                Integer.parseInt(jTextField5.getText()),
                jTextField6.getText());
        cSedan++;
    }
    void Create_PICK_UP(){
        PICK_UP[] PickUp = new PICK_UP[5];
        cPick = 0;
        PickUp[cPick] = new PICK_UP(jTextField1.getText(),
                Integer.parseInt(jTextField2.getText()),
                jTextField3.getText(),
                jTextField4.getText(),
                Integer.parseInt(jTextField5.getText()),
                jTextField6.getText());
        cPick++;
    }
    void Create_TRUCK(){
        TRUCK[] Camión = new TRUCK[5];
        cTruck = 0;
        Camión[cTruck] = new TRUCK(jTextField1.getText(),
                Integer.parseInt(jTextField2.getText()),
                jTextField3.getText(),
                jTextField4.getText(),
                Integer.parseInt(jTextField5.getText()),
                jTextField6.getText());
        cTruck++;
    }
    void Create_VAN(){
        VAN[] Camioneta = new VAN[5];
        cVan = 0;
        Camioneta[cVan] = new VAN();
        cVan++;
    }
    void SetLabel_MOTORCYCLE(){
        this.jLabel2.setText("Número de Placa");
        this.jLabel3.setText("Modelo");
        this.jLabel4.setText("Marca");
        this.jLabel5.setText("Tipo de Motor");
        this.jLabel6.setText("Medida Rines");
        this.jLabel7.setText("CC del Motor");
        //==========================================
        this.jTextField1.getText();
        this.jTextField2.getText();
        this.jTextField3.getText();
        this.jTextField4.getText();
        this.jTextField5.getText();
        this.jTextField6.getText();
        //==========================================
        this.jTextField1.setEnabled(false);
        this.jTextField2.setEnabled(false);
        this.jTextField3.setEnabled(false);
        this.jTextField4.setEnabled(false);
        this.jTextField5.setEnabled(false);
        this.jTextField6.setEnabled(false);
    }
    void SetLabel_SEDAN(){
        this.jLabel2.setText("Número de Placa");
        this.jLabel3.setText("Modelo");
        this.jLabel4.setText("Marca");
        this.jLabel5.setText("Medida de Maletera");
        this.jLabel6.setText("Número de puertas");
        this.jLabel7.setText("Combustible");
        //==========================================
        this.jTextField1.getText();
        this.jTextField2.getText();
        this.jTextField3.getText();
        this.jTextField4.getText();
        this.jTextField5.getText();
        this.jTextField6.getText();
        //==========================================
        this.jTextField1.setEnabled(false);
        this.jTextField2.setEnabled(false);
        this.jTextField3.setEnabled(false);
        this.jTextField4.setEnabled(false);
        this.jTextField5.setEnabled(false);
        this.jTextField6.setEnabled(false);
    }
    void SetLabel_PICK_UP(){
        this.jLabel2.setText("Número de Placa");
        this.jLabel3.setText("Modelo");
        this.jLabel4.setText("Marca");
        this.jLabel5.setText("Medida Cabina");
        this.jLabel6.setText("Largo");
        this.jLabel7.setText("Tracción");
        //==========================================
        this.jTextField1.getText();
        this.jTextField2.getText();
        this.jTextField3.getText();
        this.jTextField4.getText();
        this.jTextField5.getText();
        this.jTextField6.getText();
        //==========================================
        this.jTextField1.setEnabled(false);
        this.jTextField2.setEnabled(false);
        this.jTextField3.setEnabled(false);
        this.jTextField4.setEnabled(false);
        this.jTextField5.setEnabled(false);
        this.jTextField6.setEnabled(false);
    }
    void SetLabel_TRUCK(){
        this.jLabel2.setText("Número de Placa");
        this.jLabel3.setText("Modelo");
        this.jLabel4.setText("Marca");
        this.jLabel5.setText("Capacidad carga");
        this.jLabel6.setText("Cantidad de llantas");
        this.jLabel7.setText("Tipo de Caja");
        //==========================================
        this.jTextField1.getText();
        this.jTextField2.getText();
        this.jTextField3.getText();
        this.jTextField4.getText();
        this.jTextField5.getText();
        this.jTextField6.getText();
        //==========================================
        this.jTextField1.setEnabled(false);
        this.jTextField2.setEnabled(false);
        this.jTextField3.setEnabled(false);
        this.jTextField4.setEnabled(false);
        this.jTextField5.setEnabled(false);
        this.jTextField6.setEnabled(false);
    }
    void SetLabel_VAN(){
        this.jLabel2.setText("Número de Placa");
        this.jLabel3.setText("Modelo");
        this.jLabel4.setText("Marca");
        this.jLabel5.setText("Número de Asientos");
        this.jLabel6.setText("Cantidad de Personas");
        this.jLabel7.setText("Tipo de combustible");
        //==========================================
        this.jTextField1.getText();
        this.jTextField2.getText();
        this.jTextField3.getText();
        this.jTextField4.getText();
        this.jTextField5.getText();
        this.jTextField6.getText();
        //==========================================
        this.jTextField1.setEnabled(false);
        this.jTextField2.setEnabled(false);
        this.jTextField3.setEnabled(false);
        this.jTextField4.setEnabled(false);
        this.jTextField5.setEnabled(false);
        this.jTextField6.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 3));

        jLabel1.setBackground(new java.awt.Color(255, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("SELECT A VEHICLE TYPE:");
        jLabel1.setOpaque(true);

        jComboBox1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOTORCYCLE.", "SEDAN.", "PICK-UP.", "TRUCK.", "VAN.", " ", " " }));

        jLabel2.setText("jLabel2");
        jLabel2.setEnabled(false);

        jLabel3.setText("jLabel2");
        jLabel3.setEnabled(false);

        jLabel4.setText("jLabel2");
        jLabel4.setEnabled(false);

        jLabel5.setText("jLabel2");
        jLabel5.setEnabled(false);

        jLabel6.setText("jLabel2");
        jLabel6.setEnabled(false);

        jLabel7.setText("jLabel2");
        jLabel7.setEnabled(false);

        jTextField1.setEnabled(false);

        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEnabled(false);

        jTextField4.setEnabled(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setEnabled(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setEnabled(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton1.setText("SAVE DATA");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jRadioButton1.setText("ADD DATA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(INTERFACE_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INTERFACE_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INTERFACE_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INTERFACE_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INTERFACE_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
