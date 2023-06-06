package menu;
import Cells.SuperBtns;
import javax.swing.JOptionPane;
import menu.StartTypeMenu;
import Game.Game;
import music.MenuMusicBackground;

public class greenWins extends javax.swing.JFrame {

    public Game game;
    public SuperBtns enable;
    public SuperBtns colr;
    MenuMusicBackground musWin = new MenuMusicBackground();
    
    public greenWins() {
        
        initComponents();
        this.setVisible(true);
        String filePath = "win.wav";
        musWin.playMusic(filePath,0);
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(540, 670));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jButton1.setText("New Game");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameGreenWin(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 500, 280, 66);

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jButton2.setText("Exit");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGreenWin(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 580, 280, 61);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/greenwins.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 670);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newGameGreenWin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameGreenWin
        musWin.stopMusic();
        this.colr.superColors();
        this.enable.superStatusResetToEnable();
        this.setVisible(false);
        StartTypeMenu.newWindows();
    }//GEN-LAST:event_newGameGreenWin

    private void exitGreenWin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGreenWin

        int resultB = JOptionPane.showConfirmDialog(null,
        "Are you sure you want to exit?",
        "Confirm Quit", JOptionPane.YES_NO_OPTION);
        if (resultB == JOptionPane.YES_OPTION) System.exit(0);
                                
    }//GEN-LAST:event_exitGreenWin

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new greenWins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
