package menu;
import javax.swing.*;
import java.awt.*;
import menu.scoreBoard;
import music.MenuMusicBackground;
import static Game.Run.Loading;
import java.awt.event.WindowEvent;

public class MainMenu extends javax.swing.JFrame {
    public static StartTypeMenu startDemo;
    public MainMenu() {
        initComponents();
        
        Loading.setVisible(false);
        Loading.dispose();
        
        this.setVisible(true);
        
        String filePath = "menu.wav";
        MenuMusicBackground mus = new MenuMusicBackground();
        mus.playMusic(filePath,100);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jLabel1.setText("d");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tdooz");
        setMinimumSize(new java.awt.Dimension(540, 670));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        StartButton.setBackground(new java.awt.Color(204, 0, 0));
        StartButton.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        StartButton.setForeground(new java.awt.Color(255, 255, 255));
        StartButton.setText("Start");
        StartButton.setBorder(null);
        StartButton.setBorderPainted(false);
        StartButton.setContentAreaFilled(false);
        StartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StartButton.setFocusPainted(false);
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenu(evt);
            }
        });
        getContentPane().add(StartButton);
        StartButton.setBounds(190, 200, 170, 40);

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("About");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setPreferredSize(new java.awt.Dimension(77, 31));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbout(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(190, 380, 170, 40);

        jButton7.setBackground(new java.awt.Color(204, 0, 0));
        jButton7.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Exit");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.setPreferredSize(new java.awt.Dimension(77, 31));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(190, 470, 170, 40);

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ScoreBoard");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.setPreferredSize(new java.awt.Dimension(77, 31));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreboard(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(120, 290, 310, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/mainmenu.jpg"))); // NOI18N
        bg.setText("bg");
        getContentPane().add(bg);
        bg.setBounds(0, 0, 560, 670);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMenu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenu

        startDemo = new StartTypeMenu();
        this.setVisible(false);
        this.dispose();
          
    }//GEN-LAST:event_BtnMenu

    private void btnAbout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbout
        AboutMenu About = new AboutMenu();
        this.setVisible(false);
    }//GEN-LAST:event_btnAbout

    private void btnExit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit
        int result = JOptionPane.showConfirmDialog(null,
        "Are you sure you want to exit?",
        "Confirm Quit", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) System.exit(0);
    }//GEN-LAST:event_btnExit

    private void scoreboard(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreboard
        this.setVisible(false);
        scoreBoard sb = new scoreBoard();
    }//GEN-LAST:event_scoreboard

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new MainMenu().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
