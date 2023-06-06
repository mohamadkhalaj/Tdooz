package menu;
import Cells.SuperBtns;
import Game.Game;
import javax.swing.JOptionPane;
import music.MenuMusicBackground;
import menu.StartTypeMenu;

public class blackWin extends javax.swing.JFrame {

    public Game game;
    public SuperBtns enable;
    public SuperBtns colr;
    MenuMusicBackground musWin = new MenuMusicBackground();
    
    public blackWin() {
        initComponents();
        this.setVisible(true);
        String filePath = "win.wav";
        musWin.playMusic(filePath, 0);
    }
    
    public void setVars(Game game, SuperBtns enable, SuperBtns colr) {
        this.game = game;
        this.colr = colr;
        this.enable = enable;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(540, 670));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(110, 182, 187));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jButton1.setText("New Game");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackWinNewGame(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 520, 320, 40);

        jButton2.setBackground(new java.awt.Color(0, 255, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jButton2.setText("Exit");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setMaximumSize(new java.awt.Dimension(211, 65));
        jButton2.setMinimumSize(new java.awt.Dimension(211, 65));
        jButton2.setPreferredSize(new java.awt.Dimension(211, 65));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackWinExit(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 580, 320, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/blackwins.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 670);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void blackWinNewGame(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackWinNewGame
        
        musWin.stopMusic();
        this.colr.superColors();
        this.enable.superStatusResetToEnable();
        this.setVisible(false);
        StartTypeMenu.newWindows();
    }//GEN-LAST:event_blackWinNewGame

    private void blackWinExit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackWinExit
        int resultB = JOptionPane.showConfirmDialog(null,
        "Are you sure you want to exit?",
        "Confirm Quit", JOptionPane.YES_NO_OPTION);
        if (resultB == JOptionPane.YES_OPTION) System.exit(0);
    }//GEN-LAST:event_blackWinExit

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new blackWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
