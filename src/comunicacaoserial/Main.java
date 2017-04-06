/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacaoserial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Super i3
 */
public class Main extends javax.swing.JFrame {

    //Arduino conn = new Arduino();
    /**
     * Creates new form Teste
     */
    public Main() throws FontFormatException, IOException {
        initComponents();

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamTela = kit.getScreenSize();
        double fLarg = (tamTela.width) * 0.7;
        double fAlt = (tamTela.height) * 0.17;

        int larg = (int) Math.round(fLarg);
        int alt = (int) Math.round(fAlt);

        this.setSize(larg, alt);

        int locationX = (int) Math.round(tamTela.width - (tamTela.width) * 0.86);
        int locationY = (int) Math.round(tamTela.height - (tamTela.height) * 0.83);;

        System.out.println("[" + locationX + ", " + locationY + "]");
        this.setLocation(locationX, locationY);

        panelGeral.setPreferredSize(new Dimension(larg, alt));

        Dimension tamanhoPanelLim = new Dimension((int) Math.round((larg * 0.20)), alt);
        int fontSize = (int) Math.round(tamanhoPanelLim.getWidth() * 0.17);

        Font minhaFonte = Font.createFont(Font.TRUETYPE_FONT,
                new File("src/comunicacaoserial/fontes/digital-7.ttf"))
                .deriveFont(Font.PLAIN, fontSize);

        /*
        InputStream is = getClass().getResourceAsStream("/digital-7.tff");
        Font minhaFonte = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(Font.PLAIN, fontSize); */
        //---------------------Painel Limite------------------------
        panelLimite.setSize(tamanhoPanelLim);
        panelLimite.setPreferredSize(tamanhoPanelLim);
        panelLimite.setLocation(0, 0);
        panelNum1.setSize((int) Math.round(tamanhoPanelLim.getWidth() * 0.7), (int) Math.round(tamanhoPanelLim.getHeight() * 0.4));
        panelNum1.setPreferredSize(tamanhoPanelLim);
        panelLimite.setBackground(Color.BLACK);
        panelNum1.setBounds((int) Math.round((larg * 0.025)), (int) Math.round((alt * 0.35)), (int) Math.round((larg * 0.15)), (int) Math.round((alt * 0.3)));
        txtLimite1.setBounds((int) Math.round((larg * 0.045)), (int) -Math.round((alt * 0.025)), (int) Math.round((larg * 0.15)), (int) Math.round((alt * 0.3)));
        txtTitulo1.setBounds((int) Math.round((larg * 0.057)), (int) Math.round((alt * 0.1)), (int) Math.round((larg * 0.6)), (int) Math.round((alt * 0.3)));

        txtLimite1.setFont(minhaFonte);
        txtTitulo1.setFont(new java.awt.Font("Bookman Old Style", 1, (int) Math.round(fontSize * 0.7)));

        //---------------------------------------------------------
        //-------------Painel Sensor1 -----------------------------
        panelLimite.setSize(tamanhoPanelLim);
        panelLimite.setPreferredSize(tamanhoPanelLim);
        panelLimite.setLocation(0, 0);
        panelNum1.setSize((int) Math.round(tamanhoPanelLim.getWidth() * 0.7), (int) Math.round(tamanhoPanelLim.getHeight() * 0.4));
        panelNum1.setPreferredSize(tamanhoPanelLim);
        panelLimite.setBackground(Color.BLACK);
        panelNum1.setBounds((int) Math.round((larg * 0.025)), (int) Math.round((alt * 0.35)), (int) Math.round((larg * 0.15)), (int) Math.round((alt * 0.3)));
        txtLimite1.setBounds((int) Math.round((larg * 0.045)), (int) -Math.round((alt * 0.025)), (int) Math.round((larg * 0.15)), (int) Math.round((alt * 0.3)));
        txtTitulo1.setBounds((int) Math.round((larg * 0.057)), (int) Math.round((alt * 0.1)), (int) Math.round((larg * 0.6)), (int) Math.round((alt * 0.3)));

        txtLimite1.setFont(minhaFonte);
        txtTitulo1.setFont(new java.awt.Font("Bookman Old Style", 1, (int) Math.round(fontSize * 0.7)));

        //---------------------------------------------------------
        System.out.println((int) Math.round((larg * 0.035)));
        System.out.println(tamanhoPanelLim.getWidth() * 0.1);

        //------------------Painel Sensor1------------------------
        panelSensor1.setSize(tamanhoPanelLim);
        panelSensor1.setPreferredSize(tamanhoPanelLim);
        panelSensor1.setLocation(tamanhoPanelLim.width, 0);
        panelNum2.setSize((int) Math.round(tamanhoPanelLim.getWidth() * 0.7), (int) Math.round(tamanhoPanelLim.getHeight() * 0.4));
        panelNum2.setPreferredSize(tamanhoPanelLim);
        panelSensor1.setBackground(Color.BLACK);
        panelNum2.setBounds((int) Math.round((larg * 0.025)), (int) Math.round((alt * 0.35)), (int) Math.round((larg * 0.15)), (int) Math.round((alt * 0.3)));
        txtSensor1.setBounds((int) Math.round((larg * 0.045)), (int) -Math.round((alt * 0.025)), (int) Math.round((larg * 0.15)), (int) Math.round((alt * 0.3)));
        txtTitulo2.setBounds((int) Math.round((larg * 0.05)), (int) Math.round((alt * 0.1)), (int) Math.round((larg * 0.6)), (int) Math.round((alt * 0.3)));

        txtSensor1.setFont(minhaFonte);
        txtTitulo2.setFont(new java.awt.Font("Bookman Old Style", 1, (int) Math.round(fontSize * 0.7)));

        //--------------------------------------------------------
        //------------------Painel Sensor2------------------------
        panelSensor2.setSize(tamanhoPanelLim);
        panelSensor2.setPreferredSize(tamanhoPanelLim);
        panelSensor2.setLocation(tamanhoPanelLim.width * 2, 0);
        panelNum3.setSize((int) Math.round(tamanhoPanelLim.getWidth() * 0.7), (int) Math.round(tamanhoPanelLim.getHeight() * 0.4));
        panelNum3.setPreferredSize(tamanhoPanelLim);
        panelSensor2.setBackground(Color.BLACK);
        panelNum3.setBounds((int) Math.round((larg * 0.025)), (int) Math.round((alt * 0.35)), (int) Math.round((larg * 0.15)), (int) Math.round((alt * 0.3)));
        txtSensor2.setBounds((int) Math.round((larg * 0.045)), (int) -Math.round((alt * 0.025)), (int) Math.round((larg * 0.15)), (int) Math.round((alt * 0.3)));
        txtTitulo3.setBounds((int) Math.round((larg * 0.05)), (int) Math.round((alt * 0.1)), (int) Math.round((larg * 0.6)), (int) Math.round((alt * 0.3)));

        txtSensor2.setFont(minhaFonte);
        txtTitulo3.setFont(new java.awt.Font("Bookman Old Style", 1, (int) Math.round(fontSize * 0.7)));

        //--------------------------------------------------------
        //------------------Painel Sensor3------------------------
        panelSensor3.setSize(tamanhoPanelLim);
        panelSensor3.setPreferredSize(tamanhoPanelLim);
        panelSensor3.setLocation(tamanhoPanelLim.width * 3, 0);
        panelNum4.setSize((int) Math.round(tamanhoPanelLim.getWidth() * 0.7), (int) Math.round(tamanhoPanelLim.getHeight() * 0.4));
        panelNum4.setPreferredSize(tamanhoPanelLim);
        panelSensor3.setBackground(Color.BLACK);
        panelNum4.setBounds((int) Math.round((larg * 0.025)), (int) Math.round((alt * 0.35)), (int) Math.round((larg * 0.15)), (int) Math.round((alt * 0.3)));
        txtSensor3.setBounds((int) Math.round((larg * 0.045)), (int) -Math.round((alt * 0.025)), (int) Math.round((larg * 0.15)), (int) Math.round((alt * 0.3)));
        txtTitulo4.setBounds((int) Math.round((larg * 0.05)), (int) Math.round((alt * 0.1)), (int) Math.round((larg * 0.6)), (int) Math.round((alt * 0.3)));

        txtSensor3.setFont(minhaFonte);
        txtTitulo4.setFont(new java.awt.Font("Bookman Old Style", 1, (int) Math.round(fontSize * 0.7)));

        //--------------------------------------------------------
        //------------------Painel Sensor4------------------------
        panelSensor4.setSize(tamanhoPanelLim);
        panelSensor4.setPreferredSize(tamanhoPanelLim);
        panelSensor4.setLocation(tamanhoPanelLim.width * 4, 0);
        panelNum5.setSize((int) Math.round(tamanhoPanelLim.getWidth() * 0.7), (int) Math.round(tamanhoPanelLim.getHeight() * 0.4));
        panelNum5.setPreferredSize(tamanhoPanelLim);
        panelSensor4.setBackground(Color.BLACK);
        panelNum5.setBounds((int) Math.round((larg * 0.025)), (int) Math.round((alt * 0.35)), (int) Math.round((larg * 0.15)), (int) Math.round((alt * 0.3)));
        txtSensor4.setBounds((int) Math.round((larg * 0.045)), (int) -Math.round((alt * 0.025)), (int) Math.round((larg * 0.15)), (int) Math.round((alt * 0.3)));
        txtTitulo5.setBounds((int) Math.round((larg * 0.05)), (int) Math.round((alt * 0.1)), (int) Math.round((larg * 0.6)), (int) Math.round((alt * 0.3)));

        txtSensor4.setFont(minhaFonte);
        txtTitulo5.setFont(new java.awt.Font("Bookman Old Style", 1, (int) Math.round(fontSize * 0.7)));

        //--------------------------------------------------------
        /*
        String[] text = conn.arduino.receberDados();
        txtLimite1.setText(text[1]);
        txtSensor1.setText(text[2]);
        txtSensor2.setText(text[3]);
        txtSensor3.setText(text[4]);
        txtSensor4.setText(text[5]);
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
        txtTitulo1 = new javax.swing.JLabel();
        panelNum1 = new javax.swing.JPanel();
        txtLimite1 = new javax.swing.JLabel();
        panelSensor1 = new javax.swing.JPanel();
        txtTitulo2 = new javax.swing.JLabel();
        panelNum2 = new javax.swing.JPanel();
        txtSensor1 = new javax.swing.JLabel();
        panelSensor2 = new javax.swing.JPanel();
        txtTitulo3 = new javax.swing.JLabel();
        panelNum3 = new javax.swing.JPanel();
        txtSensor2 = new javax.swing.JLabel();
        panelSensor3 = new javax.swing.JPanel();
        txtTitulo4 = new javax.swing.JLabel();
        panelNum4 = new javax.swing.JPanel();
        txtSensor3 = new javax.swing.JLabel();
        panelSensor4 = new javax.swing.JPanel();
        txtTitulo5 = new javax.swing.JLabel();
        panelNum5 = new javax.swing.JPanel();
        txtSensor4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelGeral.setBackground(new java.awt.Color(0, 0, 0));
        panelGeral.setForeground(new java.awt.Color(0, 0, 255));
        panelGeral.setLayout(null);

        panelLimite.setBackground(new java.awt.Color(255, 204, 0));
        panelLimite.setLayout(null);

        txtTitulo1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        txtTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo1.setText("Limite");
        panelLimite.add(txtTitulo1);
        txtTitulo1.setBounds(55, 15, 82, 29);

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

        panelSensor1.setBackground(new java.awt.Color(255, 204, 0));
        panelSensor1.setLayout(null);

        txtTitulo2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        txtTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo2.setText("Sensor1");
        panelSensor1.add(txtTitulo2);
        txtTitulo2.setBounds(55, 15, 100, 29);

        panelNum2.setBackground(new java.awt.Color(0, 51, 51));
        panelNum2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelNum2.setLayout(null);

        txtSensor1.setFont(new java.awt.Font("Digital-7", 0, 36)); // NOI18N
        txtSensor1.setForeground(new java.awt.Color(51, 204, 0));
        txtSensor1.setText("3.00");
        panelNum2.add(txtSensor1);
        txtSensor1.setBounds(21, 1, 110, 63);

        panelSensor1.add(panelNum2);
        panelNum2.setBounds(40, 44, 70, 50);
        panelNum1.setBounds(25, 45, 0, 0);

        panelGeral.add(panelSensor1);
        panelSensor1.setBounds(1, 0, 90, 120);

        panelSensor2.setBackground(new java.awt.Color(255, 204, 0));
        panelSensor2.setLayout(null);

        txtTitulo3.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        txtTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo3.setText("Sensor2");
        panelSensor2.add(txtTitulo3);
        txtTitulo3.setBounds(55, 15, 100, 29);

        panelNum3.setBackground(new java.awt.Color(0, 51, 51));
        panelNum3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelNum3.setLayout(null);

        txtSensor2.setFont(new java.awt.Font("Digital-7", 0, 36)); // NOI18N
        txtSensor2.setForeground(new java.awt.Color(51, 204, 0));
        txtSensor2.setText("3.00");
        panelNum3.add(txtSensor2);
        txtSensor2.setBounds(21, 1, 110, 63);

        panelSensor2.add(panelNum3);
        panelNum3.setBounds(40, 44, 70, 50);
        panelNum1.setBounds(25, 45, 0, 0);

        panelGeral.add(panelSensor2);
        panelSensor2.setBounds(1, 0, 90, 120);

        panelSensor3.setBackground(new java.awt.Color(255, 204, 0));
        panelSensor3.setLayout(null);

        txtTitulo4.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        txtTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo4.setText("Sensor3");
        panelSensor3.add(txtTitulo4);
        txtTitulo4.setBounds(55, 15, 100, 29);

        panelNum4.setBackground(new java.awt.Color(0, 51, 51));
        panelNum4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelNum4.setLayout(null);

        txtSensor3.setFont(new java.awt.Font("Digital-7", 0, 36)); // NOI18N
        txtSensor3.setForeground(new java.awt.Color(51, 204, 0));
        txtSensor3.setText("3.00");
        panelNum4.add(txtSensor3);
        txtSensor3.setBounds(21, 1, 110, 63);

        panelSensor3.add(panelNum4);
        panelNum4.setBounds(40, 44, 70, 50);
        panelNum1.setBounds(25, 45, 0, 0);

        panelGeral.add(panelSensor3);
        panelSensor3.setBounds(1, 0, 90, 120);

        panelSensor4.setBackground(new java.awt.Color(255, 204, 0));
        panelSensor4.setLayout(null);

        txtTitulo5.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        txtTitulo5.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo5.setText("Sensor4");
        panelSensor4.add(txtTitulo5);
        txtTitulo5.setBounds(55, 15, 100, 29);

        panelNum5.setBackground(new java.awt.Color(0, 51, 51));
        panelNum5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelNum5.setLayout(null);

        txtSensor4.setFont(new java.awt.Font("Digital-7", 0, 36)); // NOI18N
        txtSensor4.setForeground(new java.awt.Color(51, 204, 0));
        txtSensor4.setText("3.00");
        panelNum5.add(txtSensor4);
        txtSensor4.setBounds(21, 1, 110, 63);

        panelSensor4.add(panelNum5);
        panelNum5.setBounds(40, 44, 70, 50);
        panelNum1.setBounds(25, 45, 0, 0);

        panelGeral.add(panelSensor4);
        panelSensor4.setBounds(1, 0, 90, 120);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 378, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 230, Short.MAX_VALUE))
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
                try {
                    new Main().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelGeral;
    private javax.swing.JPanel panelLimite;
    private javax.swing.JPanel panelNum1;
    private javax.swing.JPanel panelNum2;
    private javax.swing.JPanel panelNum3;
    private javax.swing.JPanel panelNum4;
    private javax.swing.JPanel panelNum5;
    private javax.swing.JPanel panelSensor1;
    private javax.swing.JPanel panelSensor2;
    private javax.swing.JPanel panelSensor3;
    private javax.swing.JPanel panelSensor4;
    private javax.swing.JLabel txtLimite1;
    private javax.swing.JLabel txtSensor1;
    private javax.swing.JLabel txtSensor2;
    private javax.swing.JLabel txtSensor3;
    private javax.swing.JLabel txtSensor4;
    private javax.swing.JLabel txtTitulo1;
    private javax.swing.JLabel txtTitulo2;
    private javax.swing.JLabel txtTitulo3;
    private javax.swing.JLabel txtTitulo4;
    private javax.swing.JLabel txtTitulo5;
    // End of variables declaration//GEN-END:variables
}
