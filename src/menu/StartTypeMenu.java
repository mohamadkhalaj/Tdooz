package menu;
import Game.load;
import GUI.GUI;
import menu.getNameMenu;
import music.MenuMusicBackground;
import Game.Run;
import static Game.FlagForContinue.cont;
import static menu.loading.main;

public class StartTypeMenu extends javax.swing.JFrame {
    public static GUI NewGame;
    public MenuMusicBackground music = new MenuMusicBackground();
    public static getNameMenu name;
    public StartTypeMenu() {

        initComponents();
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNewGame = new javax.swing.JButton();
        btnContinue = new javax.swing.JButton();
        btnContinue1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(553, 670));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        btnNewGame.setBackground(new java.awt.Color(153, 153, 153));
        btnNewGame.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        btnNewGame.setForeground(new java.awt.Color(255, 255, 255));
        btnNewGame.setText("New Game");
        btnNewGame.setBorder(null);
        btnNewGame.setBorderPainted(false);
        btnNewGame.setContentAreaFilled(false);
        btnNewGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewGame.setFocusPainted(false);
        btnNewGame.setFocusable(false);
        btnNewGame.setMaximumSize(new java.awt.Dimension(77, 31));
        btnNewGame.setMinimumSize(new java.awt.Dimension(77, 31));
        btnNewGame.setPreferredSize(new java.awt.Dimension(77, 31));
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameButtonAction(evt);
            }
        });
        getContentPane().add(btnNewGame);
        btnNewGame.setBounds(150, 240, 250, 40);

        btnContinue.setBackground(new java.awt.Color(153, 153, 153));
        btnContinue.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        btnContinue.setForeground(new java.awt.Color(255, 255, 255));
        btnContinue.setText("Continue");
        btnContinue.setBorder(null);
        btnContinue.setBorderPainted(false);
        btnContinue.setContentAreaFilled(false);
        btnContinue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinue.setFocusPainted(false);
        btnContinue.setFocusable(false);
        btnContinue.setMaximumSize(new java.awt.Dimension(77, 31));
        btnContinue.setMinimumSize(new java.awt.Dimension(77, 31));
        btnContinue.setPreferredSize(new java.awt.Dimension(77, 31));
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueStartGame(evt);
            }
        });
        getContentPane().add(btnContinue);
        btnContinue.setBounds(150, 340, 250, 40);

        btnContinue1.setBackground(new java.awt.Color(153, 153, 153));
        btnContinue1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        btnContinue1.setForeground(new java.awt.Color(255, 255, 255));
        btnContinue1.setText("Return");
        btnContinue1.setBorder(null);
        btnContinue1.setBorderPainted(false);
        btnContinue1.setContentAreaFilled(false);
        btnContinue1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinue1.setFocusPainted(false);
        btnContinue1.setFocusable(false);
        btnContinue1.setMaximumSize(new java.awt.Dimension(77, 31));
        btnContinue1.setMinimumSize(new java.awt.Dimension(77, 31));
        btnContinue1.setPreferredSize(new java.awt.Dimension(77, 31));
        btnContinue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbtn(evt);
            }
        });
        getContentPane().add(btnContinue1);
        btnContinue1.setBounds(150, 440, 250, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/newgame_continue.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 580, 670);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NewGameButtonAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameButtonAction
        name = new getNameMenu();
        this.setVisible(false);
    }//GEN-LAST:event_NewGameButtonAction

    private void ContinueStartGame(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueStartGame
        load.getName();
        NewGame = new GUI();        
        music.stopMusic();
        load.continue_game(NewGame);
        this.setVisible(false);
    }//GEN-LAST:event_ContinueStartGame

    private void returnbtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbtn
        this.setVisible(false);
        main.setVisible(true);
    }//GEN-LAST:event_returnbtn

    public static void newWindows() {
        name = new getNameMenu();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartTypeMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnContinue1;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
