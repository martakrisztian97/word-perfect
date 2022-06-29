/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;

/**
 * Splash screen GUI
 * @author Márta Krisztián
 * @since 2022-06-28
 * @version 1.0
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public SplashScreen() {
        initComponents();
        setJFrameBackground();
    }
    
    /**
     * JFrame hátterének beállítása
     */
    public void setJFrameBackground() {
        getContentPane().setBackground(new java.awt.Color(177, 184, 252));
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

        wordPerfectLabel = new javax.swing.JLabel();
        loadingGIFLabel = new javax.swing.JLabel();
        percentLabel = new javax.swing.JLabel();
        loadTextLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word-pressed");
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        wordPerfectLabel.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        wordPerfectLabel.setText("WORD-PERFECT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 150, 0);
        getContentPane().add(wordPerfectLabel, gridBagConstraints);

        loadingGIFLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/loading.gif"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        getContentPane().add(loadingGIFLabel, gridBagConstraints);

        percentLabel.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        percentLabel.setText("0%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        getContentPane().add(percentLabel, gridBagConstraints);

        loadTextLabel.setText("Angol szavak betöltése...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(140, 0, 0, 0);
        getContentPane().add(loadTextLabel, gridBagConstraints);

        setSize(new java.awt.Dimension(800, 800));
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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel loadTextLabel;
    private javax.swing.JLabel loadingGIFLabel;
    public javax.swing.JLabel percentLabel;
    private javax.swing.JLabel wordPerfectLabel;
    // End of variables declaration//GEN-END:variables
}
