package menu;

import menu.MainMenu;
import static Game.Run.Loading;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import static menu.loading.main;

public class loading extends javax.swing.JFrame {
    public static loading n = new loading();
    public static MainMenu main;
    public loading() {
        initComponents();
        delay newd = new delay();
        newd.setper(percentage);
        Thread object = new Thread(new delay()); 
        object.start(); 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        percentage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("TDooz");
        setMinimumSize(new java.awt.Dimension(760, 536));
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 20, 200, 190);

        percentage.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        percentage.setForeground(new java.awt.Color(255, 255, 255));
        percentage.setText("0%");
        jPanel1.add(percentage);
        percentage.setBounds(360, 470, 110, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/splash.gif"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 210, 520, 270);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                n.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel percentage;
    // End of variables declaration//GEN-END:variables
}

class delay extends Thread {
    public static JLabel percentage;
    public void run() {
        for (int i = 0; i<=100; i+= 5) {
            try {
                int j = i*5; 
                Thread.sleep(j);
                percentage.setText(i + "%");
            } catch (InterruptedException ex) {
                
            }
        }
        main = new MainMenu();
    }
    public void setper(JLabel percentage) {
        this.percentage = percentage;
    }
}