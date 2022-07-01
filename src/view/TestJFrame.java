package view;

import java.awt.Toolkit;
import java.awt.Image;
import java.awt.Point;
import java.awt.Cursor;

/**
 * Tesztfeladatsor képernyője
 * @author Márta Krisztián
 * @since 2022-06-30
 * @version 1.0
 */
public class TestJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TestJFrame
     */
    public TestJFrame() {
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

        termLabel = new javax.swing.JLabel();
        definitionTextField = new javax.swing.JTextField();
        answerButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WORD-PERFECT");
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        termLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        termLabel.setText("Term");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(100, 0, 25, 0);
        getContentPane().add(termLabel, gridBagConstraints);

        definitionTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        definitionTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        definitionTextField.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 441;
        gridBagConstraints.ipady = 28;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 25, 0);
        getContentPane().add(definitionTextField, gridBagConstraints);

        answerButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        answerButton.setText("Válasz");
        answerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        answerButton.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 25, 0);
        getContentPane().add(answerButton, gridBagConstraints);

        quitButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        quitButton.setForeground(new java.awt.Color(255, 0, 0));
        quitButton.setText("Kilépés");
        quitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        quitButton.setFocusable(false);
        quitButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                quitButtonMouseMoved(evt);
            }
        });
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(150, 0, 0, 0);
        getContentPane().add(quitButton, gridBagConstraints);

        setSize(new java.awt.Dimension(800, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Kurzor beállítása, ha az egeret az elem felé húzzuk
     * @param evt 
     */
    private void quitButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitButtonMouseMoved
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("src/view/images/quit_cursor.png");
        Point p = new Point(0, 0);
        Cursor c = toolkit.createCustomCursor(image, p, "quit");
        quitButton.setCursor(c);
    }//GEN-LAST:event_quitButtonMouseMoved

    /**
     * Kattintásra bezárja az alkalmazást
     * @param evt 
     */
    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerButton;
    private javax.swing.JTextField definitionTextField;
    private javax.swing.JButton quitButton;
    private javax.swing.JLabel termLabel;
    // End of variables declaration//GEN-END:variables
}
