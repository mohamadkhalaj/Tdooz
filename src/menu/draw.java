package menu;
import Cells.SuperBtns;
import Game.Game;
import javax.swing.JOptionPane;
import menu.StartTypeMenu;
import music.MenuMusicBackground;

public class draw extends javax.swing.JFrame {

    public Game game;
    public SuperBtns enable;
    public SuperBtns colr;
    MenuMusicBackground musWin = new MenuMusicBackground();
    
    public draw() {
        initComponents();
        this.setVisible(true);
        String filePath = "draw.wav";
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
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(540, 670));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jButton1.setText("New Game");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawNewGame(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 470, 300, 70);

        jButton2.setBackground(new java.awt.Color(195, 132, 132));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jButton2.setText("Exit");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawExit(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 560, 250, 61);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/draw.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 670);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void drawNewGame(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawNewGame
        musWin.stopMusic();
        this.colr.superColors();
        this.enable.superStatusResetToEnable();
        this.setVisible(false);
        StartTypeMenu.newWindows();
    }//GEN-LAST:event_drawNewGame

    private void drawExit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawExit
                int resultB = JOptionPane.showConfirmDialog(null,
        "Are you sure you want to exit?",
        "Confirm Quit", JOptionPane.YES_NO_OPTION);
        if (resultB == JOptionPane.YES_OPTION) System.exit(0);
    }//GEN-LAST:event_drawExit

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new draw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
