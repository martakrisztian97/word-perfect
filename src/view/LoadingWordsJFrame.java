package view;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Exercise;

/**
 * Feladatsor betöltési képernyője
 * @author Márta Krisztián
 * @since 2022-07-01
 * @version 1.0
 */
public class LoadingWordsJFrame extends javax.swing.JFrame {

    private Timer t;
    private TestJFrame test;
    
    /**
     * Creates new form LoadingWords
     */
    public LoadingWordsJFrame() {
        initComponents();
    }
    
    /**
     * /**
     * Creates new form LoadingWords
     * @param e A HomeJFrame osztálytól kapott tesztfeladatsor
     */
    public LoadingWordsJFrame(Exercise e) {
        initComponents();
        setJFrameBackground();
        startProgressBar();
        test = new TestJFrame(e);
    }
    
    /**
     * JFrame hátterének beállítása
     */
    public void setJFrameBackground() {
        getContentPane().setBackground(new java.awt.Color(177, 184, 252));
    }
    
    /**
     * ProgressBar működtetése Timer segítségével
     */
    public void startProgressBar() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (progressBar.getValue() < 100) {
                    progressBar.setValue(progressBar.getValue()+1);
                } else {
                    t.stop();
                }
                
                if (progressBar.getValue() == 100) {
                    dispose();
                    test.setVisible(true);
                }
            }
        };
        t = new Timer(20, al);
        t.start();
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

        progressBar = new javax.swing.JProgressBar();
        loadTextLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WORD-PERFECT");
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        progressBar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        progressBar.setPreferredSize(new java.awt.Dimension(200, 30));
        progressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 136;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        getContentPane().add(progressBar, gridBagConstraints);

        loadTextLabel.setText("Feladatsor összeállítása...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        getContentPane().add(loadTextLabel, gridBagConstraints);

        setSize(new java.awt.Dimension(400, 250));
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
            java.util.logging.Logger.getLogger(LoadingWordsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingWordsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingWordsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingWordsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadingWordsJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel loadTextLabel;
    public javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
