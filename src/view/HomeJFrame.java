package view;

import controller.FileAction;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.Point;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;
import model.Exercise;
import model.Word;


/**
 * Alkalmazás kezdő képernyője
 * @author Márta Krisztián
 * @since 2022-06-29
 * @version 1.0
 */
public class HomeJFrame extends javax.swing.JFrame {
    
    private Exercise exercise;
    private List<Word> allWordsList;

    /**
     * Creates new form Home
     */
    public HomeJFrame() {
        initComponents();
        setJFrameBackground();
        wordNumberSpinnerSettings();
        this.allWordsList = FileAction.fileReader("words.txt");
        this.englishRadioButton.setActionCommand("Angol");
        this.hungarianRadioButton.setActionCommand("Magyar");
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
        this.wordsNumberSpinner.setModel(spinnerModel);
        if (this.wordsNumberSpinner.getEditor() instanceof JSpinner.DefaultEditor) {
           JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) this.wordsNumberSpinner.getEditor();
           editor.getTextField().setEditable(false);
           editor.getTextField().setHorizontalAlignment(JTextField.CENTER);
           editor.getTextField().setBackground(Color.WHITE);
        }
    }
      
    /**
     * Teszt indítása
     */
    public void testStart() {
        dispose();
        this.exercise = new Exercise((int)this.wordsNumberSpinner.getValue(), selectWordsFromAll(), this.languageButtonGroup.getSelection().getActionCommand());
        LoadingWordsJFrame lw = new LoadingWordsJFrame(this.exercise);
        lw.setVisible(true);
    }
    
    /**
     * A wordsNumberSpinner értékének megfelelően véletlenszerűen kiválaszt szavakat a tesztfeladatsorhoz az összes szóból.
     * @return A kiválogatott szavakat tartalmazó lista.
     */
    public List<Word> selectWordsFromAll() {
        List<Word> selectedWordsList = new ArrayList<>();
        boolean contain;
        for (int i = 1; i <= (int)this.wordsNumberSpinner.getValue(); i++) {
            do {
                contain = false;
                int random = (int)(Math.random()*allWordsList.size());
                Word selectedWord = this.allWordsList.get(random);
                if (selectedWordsList.contains(selectedWord)) {
                    contain = true;
                } else {
                    selectedWordsList.add(selectedWord);
                }
            } while (contain);
        }
        return selectedWordsList;
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

        languageButtonGroup = new javax.swing.ButtonGroup();
        quitButton = new javax.swing.JButton();
        wordsNumberSpinner = new javax.swing.JSpinner();
        testStartButton = new javax.swing.JButton();
        englishRadioButton = new javax.swing.JRadioButton();
        hungarianRadioButton = new javax.swing.JRadioButton();
        menuBar = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        testStartMenuItem = new javax.swing.JMenuItem();
        quitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WORD-PERFECT");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

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
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        getContentPane().add(quitButton, gridBagConstraints);

        wordsNumberSpinner.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        wordsNumberSpinner.setModel(new javax.swing.SpinnerNumberModel(50, 50, 200, 10));
        wordsNumberSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        wordsNumberSpinner.setFocusable(false);
        wordsNumberSpinner.setMinimumSize(new java.awt.Dimension(100, 100));
        wordsNumberSpinner.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 25, 0);
        getContentPane().add(wordsNumberSpinner, gridBagConstraints);

        testStartButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        testStartButton.setText("Teszt indítása");
        testStartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        testStartButton.setFocusable(false);
        testStartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testStartButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 25, 0);
        getContentPane().add(testStartButton, gridBagConstraints);

        languageButtonGroup.add(englishRadioButton);
        englishRadioButton.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        englishRadioButton.setSelected(true);
        englishRadioButton.setText("Angol");
        englishRadioButton.setBorder(null);
        englishRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        englishRadioButton.setFocusable(false);
        englishRadioButton.setOpaque(false);
        englishRadioButton.setPreferredSize(new java.awt.Dimension(93, 45));
        englishRadioButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                englishRadioButtonMouseMoved(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 25, 5);
        getContentPane().add(englishRadioButton, gridBagConstraints);

        languageButtonGroup.add(hungarianRadioButton);
        hungarianRadioButton.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        hungarianRadioButton.setText("Magyar");
        hungarianRadioButton.setBorder(null);
        hungarianRadioButton.setFocusable(false);
        hungarianRadioButton.setOpaque(false);
        hungarianRadioButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hungarianRadioButtonMouseMoved(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(25, 5, 25, 0);
        getContentPane().add(hungarianRadioButton, gridBagConstraints);

        menu1.setText("Menü");
        menu1.setToolTipText("");

        testStartMenuItem.setText("Teszt indítása");
        testStartMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testStartMenuItemActionPerformed(evt);
            }
        });
        menu1.add(testStartMenuItem);

        quitMenuItem.setText("Kilépés");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        menu1.add(quitMenuItem);

        menuBar.add(menu1);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(800, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Kattintásra bezárja az alkalmazást
     * @param evt 
     */
    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    /**
     * Kattintásra bezárja az alkalmazást
     * @param evt 
     */
    private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitMenuItemActionPerformed

    /**
     * Kurzor beállítása, ha az egeret az elem felé húzzuk
     * @param evt 
     */
    private void englishRadioButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_englishRadioButtonMouseMoved
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage(getClass().getResource("/view/images/uk_cursor.png"));
        Point p = new Point(0, 0);
        Cursor c = toolkit.createCustomCursor(image, p, "uk");
        this.englishRadioButton.setCursor(c);
    }//GEN-LAST:event_englishRadioButtonMouseMoved

    /**
     * Kurzor beállítása, ha az egeret az elem felé húzzuk
     * @param evt 
     */
    private void hungarianRadioButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hungarianRadioButtonMouseMoved
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage(getClass().getResource("/view/images/hu_cursor.png"));
        Point p = new Point(0, 0);
        Cursor c = toolkit.createCustomCursor(image, p, "hu");
        this.hungarianRadioButton.setCursor(c);
    }//GEN-LAST:event_hungarianRadioButtonMouseMoved

    /**
     * Kurzor beállítása, ha az egeret az elem felé húzzuk
     * @param evt 
     */
    private void quitButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitButtonMouseMoved
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage(getClass().getResource("/view/images/quit_cursor.png"));
        Point p = new Point(0, 0);
        Cursor c = toolkit.createCustomCursor(image, p, "quit");
        this.quitButton.setCursor(c);
    }//GEN-LAST:event_quitButtonMouseMoved

    /**
     * Kattintásra elindítja a tesztfeladatsort
     * @param evt 
     */
    private void testStartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testStartButtonActionPerformed
        testStart();
    }//GEN-LAST:event_testStartButtonActionPerformed

    /**
     * Kattintásra elindítja a tesztfeladatsort
     * @param evt 
     */
    private void testStartMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testStartMenuItemActionPerformed
        testStart();
    }//GEN-LAST:event_testStartMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton englishRadioButton;
    private javax.swing.JRadioButton hungarianRadioButton;
    private javax.swing.ButtonGroup languageButtonGroup;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton quitButton;
    private javax.swing.JMenuItem quitMenuItem;
    private javax.swing.JButton testStartButton;
    private javax.swing.JMenuItem testStartMenuItem;
    public javax.swing.JSpinner wordsNumberSpinner;
    // End of variables declaration//GEN-END:variables
}
