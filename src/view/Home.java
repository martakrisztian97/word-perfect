/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 * Alkalmazás kezdő képernyője
 * @author Márta Krisztián
 * @since 2022-06-29
 * @version 1.0
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setJFrameBackground();
        wordNumberSpinnerSettings();
    }
    
    /**
     * JFrame hátterének beállítása
     */
    public void setJFrameBackground() {
        getContentPane().setBackground(new java.awt.Color(177, 184, 252));
    }
    
    /**
     * wordNumberSpinner beállításai: 
     * - Szerkeszthetőség tiltása
     * - Horizontálisan középre helyezés
     * - Spinner Model beállítása
     */
    public void wordNumberSpinnerSettings(){
        SpinnerModel spinnerModel = new SpinnerNumberModel(50, 20, 200, 10);
        wordsNumberSpinner.setModel(spinnerModel);
        if (wordsNumberSpinner.getEditor() instanceof JSpinner.DefaultEditor) {
           JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) wordsNumberSpinner.getEditor();
           editor.getTextField().setEditable(false);
           editor.getTextField().setHorizontalAlignment(JTextField.CENTER);
        }
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

        quitButton = new javax.swing.JButton();
        wordsNumberSpinner = new javax.swing.JSpinner();
        testStartButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word-pressed");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setMinimumSize(new java.awt.Dimension(800, 800));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        quitButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        quitButton.setForeground(new java.awt.Color(255, 0, 0));
        quitButton.setText("Kilépés");
        quitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quitButton.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 0);
        getContentPane().add(quitButton, gridBagConstraints);

        wordsNumberSpinner.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        wordsNumberSpinner.setModel(new javax.swing.SpinnerNumberModel(50, 50, 200, 10));
        wordsNumberSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        wordsNumberSpinner.setMinimumSize(new java.awt.Dimension(100, 100));
        wordsNumberSpinner.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(wordsNumberSpinner, gridBagConstraints);

        testStartButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        testStartButton.setText("Teszt indítása");
        testStartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        testStartButton.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(100, 0, 0, 0);
        getContentPane().add(testStartButton, gridBagConstraints);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton testStartButton;
    private javax.swing.JSpinner wordsNumberSpinner;
    // End of variables declaration//GEN-END:variables
}