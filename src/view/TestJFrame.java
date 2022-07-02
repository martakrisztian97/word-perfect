package view;

import java.awt.Toolkit;
import java.awt.Image;
import java.awt.Point;
import java.awt.Cursor;
import model.Exercise;

/**
 * Tesztfeladatsor képernyője
 * @author Márta Krisztián
 * @since 2022-06-30
 * @version 1.0
 */
public class TestJFrame extends javax.swing.JFrame {
    
    private Exercise exercise;

    /**
     * Creates new form TestJFrame
     */
    public TestJFrame() {
        initComponents();
    }
    
    /**
     * /**
     * Creates new form TestJFrame
     * @param e A HomeJFrame majd a LoadingWordsJFrame osztálytól kapott tesztfeladatsor
     */
    public TestJFrame(Exercise e) {
        initComponents();
        setJFrameBackground();
        this.exercise = e;
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

        definitionTextField = new javax.swing.JTextField();
        termLabel = new javax.swing.JLabel();
        quitButton = new javax.swing.JButton();
        answerButton = new javax.swing.JButton();
        dontKnowButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WORD-PERFECT");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        definitionTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        definitionTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        definitionTextField.setPreferredSize(new java.awt.Dimension(180, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 441;
        gridBagConstraints.ipady = 28;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 25, 0);
        getContentPane().add(definitionTextField, gridBagConstraints);

        termLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        termLabel.setText("Term");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(250, 0, 25, 0);
        getContentPane().add(termLabel, gridBagConstraints);

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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(250, 25, 0, 0);
        getContentPane().add(quitButton, gridBagConstraints);

        answerButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        answerButton.setText("Válasz");
        answerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        answerButton.setFocusable(false);
        answerButton.setPreferredSize(new java.awt.Dimension(120, 53));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 0);
        getContentPane().add(answerButton, gridBagConstraints);

        dontKnowButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        dontKnowButton.setText("Nem tudom");
        dontKnowButton.setFocusPainted(false);
        dontKnowButton.setPreferredSize(new java.awt.Dimension(120, 37));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 25, 0);
        getContentPane().add(dontKnowButton, gridBagConstraints);

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
     * Amikor megnyilík az ablak, a beviteli mezőbe fókuszál a kurzor
     * @param evt 
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        definitionTextField.requestFocus();
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JButton dontKnowButton;
    private javax.swing.JButton quitButton;
    private javax.swing.JLabel termLabel;
    // End of variables declaration//GEN-END:variables
}
