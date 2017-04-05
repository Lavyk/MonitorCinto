/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacaoserial;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Super i3
 */
public class Main extends javax.swing.JFrame {

    /*Arduino conn = new Arduino();

    /**
     * Creates new form Teste
     */
    public Main() {
        initComponents();

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamTela = kit.getScreenSize();
        double fLarg = (tamTela.width) * 0.7;
        double fAlt = (tamTela.height) * 0.17;

        int larg = (int) Math.round(fLarg);
        int alt = (int) Math.round(fAlt);

        this.setSize(larg, alt);
        
        int locationX = (int) Math.round(tamTela.width - (tamTela.width)*0.86);
        int locationY = (int) Math.round(tamTela.height - (tamTela.height)*0.83);;
        
        System.out.println("["+locationX+", "+locationY+"]");
        this.setLocation(locationX, locationY);
        
        panelGeral.setPreferredSize(new Dimension(larg, alt));
        
        Dimension tamanhoPanelLim = new Dimension((int) Math.round((larg * 0.20)), alt);
        
        panelLimite.setSize(tamanhoPanelLim);
        panelLimite.setPreferredSize(tamanhoPanelLim);
        panelLimite.setLocation(0, 0);
        panelNum1.setSize((int) Math.round(tamanhoPanelLim.getWidth()*0.7), (int) Math.round(tamanhoPanelLim.getHeight()*0.4));
        panelNum1.setPreferredSize(tamanhoPanelLim);
        System.out.println(tamanhoPanelLim.getWidth()*0.3);
        
        
        panelSensor2.setPreferredSize(new Dimension((int) Math.round((larg * 0.2)), alt));
        panelSensor2.setLocation((int) Math.round(larg*0.25), 0);
        
        /*
        txtLimite.setText(conn.valores[0]);
        txtSensor1.setText(conn.valores[1]);
        txtSensor2.setText(conn.valores[2]);
        txtSensor3.setText(conn.valores[3]);
        txtSensor4.setText(conn.valores[4]);
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelGeral = new javax.swing.JPanel();
        panelLimite = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelNum1 = new javax.swing.JPanel();
        txtLimite1 = new javax.swing.JLabel();
        panelSensor2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txtLimite = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelGeral.setBackground(new java.awt.Color(0, 0, 0));
        panelGeral.setForeground(new java.awt.Color(0, 0, 255));
        panelGeral.setLayout(null);

        panelLimite.setBackground(new java.awt.Color(255, 204, 0));
        panelLimite.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Limite");
        panelLimite.add(jLabel8);
        jLabel8.setBounds(55, 15, 83, 29);

        panelNum1.setBackground(new java.awt.Color(0, 51, 51));
        panelNum1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelNum1.setLayout(null);

        txtLimite1.setFont(new java.awt.Font("Digital-7", 0, 36)); // NOI18N
        txtLimite1.setForeground(new java.awt.Color(51, 204, 0));
        txtLimite1.setText("3.00");
        panelNum1.add(txtLimite1);
        txtLimite1.setBounds(21, 1, 110, 63);

        panelLimite.add(panelNum1);
        panelNum1.setBounds(40, 44, 70, 50);
        panelNum1.setBounds(25, 45, 0, 0);

        panelGeral.add(panelLimite);
        panelLimite.setBounds(1, 0, 90, 120);

        panelSensor2.setBackground(new java.awt.Color(255, 204, 0));

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sensor2");

        jPanel9.setBackground(new java.awt.Color(0, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        txtLimite.setFont(new java.awt.Font("Digital-7", 0, 36)); // NOI18N
        txtLimite.setForeground(new java.awt.Color(51, 204, 0));
        txtLimite.setText("3.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 5, 0);
        jPanel9.add(txtLimite, gridBagConstraints);

        panelSensor2.setSize(522, 477);

        javax.swing.GroupLayout panelSensor2Layout = new javax.swing.GroupLayout(panelSensor2);
        panelSensor2.setLayout(panelSensor2Layout);
        panelSensor2Layout.setHorizontalGroup(
            panelSensor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSensor2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel7))
            .addGroup(panelSensor2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSensor2Layout.setVerticalGroup(
            panelSensor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSensor2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelGeral.add(panelSensor2);
        panelSensor2.setBounds(384, 0, 172, 138);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 251, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel panelGeral;
    private javax.swing.JPanel panelLimite;
    private javax.swing.JPanel panelNum1;
    private javax.swing.JPanel panelSensor2;
    private javax.swing.JLabel txtLimite;
    private javax.swing.JLabel txtLimite1;
    // End of variables declaration//GEN-END:variables
}
