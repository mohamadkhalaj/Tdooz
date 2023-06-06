package menu;
import Game.Run;
import static menu.loading.main;
public class AboutMenu extends javax.swing.JFrame {
    public AboutMenu() {
        initComponents();
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("about");
        setMinimumSize(new java.awt.Dimension(553, 670));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("This game is developed by a team of first \nyear  students at IKIU University, \nas an Object Oriented Programming project.\n\nDevelopers:\nMohammadMahdi Khalaj\nAmirHossein MousaviNasab\nAli HassanZade\n\nWe hope you enjoy this famous game\nThank you\n\nTDooz, developed in 2020.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setCaretColor(new java.awt.Color(255, 204, 0));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setSelectedTextColor(new java.awt.Color(255, 51, 51));
        jTextArea1.setSelectionColor(new java.awt.Color(102, 153, 255));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 110, 430, 410);

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Return");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDefaultCapable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButton(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 560, 170, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/about.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 550, 670);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButton
        this.setVisible(false);
        this.dispose();
        main.setVisible(true);
    }//GEN-LAST:event_ReturnButton

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
