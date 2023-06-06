package menu;
import Game.Game;
import Cells.SuperBtns;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;
import static Game.FlagForContinue.PN;

public class InsideGameMenu extends javax.swing.JFrame {
    public Game game;
    public SuperBtns enable;
    public SuperBtns colr;
    
    public InsideGameMenu() {
        initComponents();
        this.setVisible(true);
    }
    
    public void setVars(Game game, SuperBtns enable, SuperBtns colr) {
        this.game = game;
        this.colr = colr;
        this.enable = enable;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        tryAgain = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(540, 670));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("menu");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonAction(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 180, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Exit");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonAction(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 180, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Continue");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueButton(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 180, 40));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("save");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 180, 40));

        tryAgain.setBackground(new java.awt.Color(0, 0, 0));
        tryAgain.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        tryAgain.setForeground(new java.awt.Color(255, 255, 255));
        tryAgain.setText("Restart");
        tryAgain.setBorder(null);
        tryAgain.setBorderPainted(false);
        tryAgain.setContentAreaFilled(false);
        tryAgain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tryAgain.setFocusPainted(false);
        tryAgain.setFocusable(false);
        tryAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetGame(evt);
            }
        });
        getContentPane().add(tryAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 180, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/insidemnu.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(550, 670));
        jLabel1.setMinimumSize(new java.awt.Dimension(550, 670));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonAction
        int result = JOptionPane.showConfirmDialog(null,
        "Are you sure you want to exit?",
        "Confirm Quit", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) System.exit(0);
    }//GEN-LAST:event_ExitButtonAction

    private void ContinueButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueButton
        this.setVisible(false);
        StartTypeMenu.NewGame.setVisible(true);
    }//GEN-LAST:event_ContinueButton

    private void MenuButtonAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonAction
        PN = null;
        MainMenu menu = new MainMenu();
        this.setVisible(false);
        StartTypeMenu.NewGame.setVisible(false);
        StartTypeMenu.NewGame.dispose();
        this.dispose();
    }//GEN-LAST:event_MenuButtonAction

    private void saveButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton

        try{              
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Position.txt"), "UTF8"));
            for(int g = 0 ; g<64 ; g++){
                String color = "";
                if(StartTypeMenu.NewGame.Buttons[g].getBackground() == Color.green) {color = "Green";}
                else if (StartTypeMenu.NewGame.Buttons[g].getBackground() == Color.black) {color = "Black";}
                bw.write(String.valueOf(g) + "," + color + "," + StartTypeMenu.NewGame.Buttons[g].getText());
                bw.newLine();
        }
            String player = Game.whoIsPlaying();
            bw.write(Game.greenName + "," + Game.blackName + "," + player);
            bw.newLine();
            if (Game.greenDiff > 3) Game.greenDiff = 3;
            else if (Game.greenDiff < -3) Game.greenDiff = -3;
            else if (Game.blackDiff < -3) Game.blackDiff = -3;
            else if (Game.blackDiff < -3) Game.blackDiff = -3;
            bw.write(Game.greenDiff + "," + Game.blackDiff);
            JOptionPane.showMessageDialog(rootPane, "Save was Sucsess.");
            bw.close();
        }
        catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_saveButton

    private void resetGame(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetGame
        PN = null;
        game.resetGame();
        this.colr.superColors();
        this.enable.superStatusResetToEnable();
        this.setVisible(false);
        StartTypeMenu.NewGame.setVisible(true);
    
    }//GEN-LAST:event_resetGame

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsideGameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton tryAgain;
    // End of variables declaration//GEN-END:variables
}
