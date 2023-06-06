package menu;
import music.MenuMusicBackground;
import GUI.GUI;
import java.awt.Color;
import javax.swing.JTextField;
import static menu.StartTypeMenu.NewGame;
import menu.MainMenu;

public class getNameMenu extends javax.swing.JFrame {
    
    public static String greenname;
    public static String blackname;
    public MenuMusicBackground music = new MenuMusicBackground();
    
    public getNameMenu() {
        initComponents();
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        greenName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        blackName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(540, 330));
        setMinimumSize(new java.awt.Dimension(540, 330));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(540, 330));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        greenName.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        greenName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selected(evt);
            }
        });
        getContentPane().add(greenName);
        greenName.setBounds(210, 100, 226, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("Green");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 100, 92, 40);

        blackName.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        blackName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selected(evt);
            }
        });
        getContentPane().add(blackName);
        blackName.setBounds(210, 160, 226, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setText("Black");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 160, 86, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setText("Please Enter Your Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 20, 560, 42);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jButton1.setText("Start");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stratbtn(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 240, 97, 57);

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jButton2.setText("Return");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbtn(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 240, 160, 57);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/about.gif"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 560, 330);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stratbtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stratbtn
        MainMenu.startDemo.setVisible(false);
        MainMenu.startDemo.dispose();
        
        blackname = blackName.getText();
        greenname = greenName.getText();
        
        if (blackname.isEmpty()) {
            blackName.setBackground(Color.red);
        }
        if (greenname.isEmpty()) {
            greenName.setBackground(Color.red);
        }
        
        if (!greenname.isEmpty() && !blackname.isEmpty()) {  
            NewGame = new GUI();
            music.stopMusic();
            this.setVisible(false);
        }
    }//GEN-LAST:event_stratbtn

    private void returnbtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbtn
        this.setVisible(false);
        MainMenu.startDemo.setVisible(true);
    }//GEN-LAST:event_returnbtn

    private void selected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selected
        JTextField textfield = (JTextField) evt.getSource();
        textfield.setBackground(Color.white);
    }//GEN-LAST:event_selected

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new getNameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField blackName;
    private javax.swing.JTextField greenName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
