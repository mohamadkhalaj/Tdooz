package menu;
import Game.Run;
import javax.swing.JLabel;
import static Game.loadSaved.*;
import static menu.loading.main;

public class scoreBoard extends javax.swing.JFrame {
    public JLabel labels[] = new JLabel[40];
    public scoreBoard() {
        initComponents();
        initlabels();
        this.setVisible(true);
        load();
        setVar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        l24 = new javax.swing.JLabel();
        l23 = new javax.swing.JLabel();
        l22 = new javax.swing.JLabel();
        l21 = new javax.swing.JLabel();
        l28 = new javax.swing.JLabel();
        l27 = new javax.swing.JLabel();
        l26 = new javax.swing.JLabel();
        l25 = new javax.swing.JLabel();
        l32 = new javax.swing.JLabel();
        l31 = new javax.swing.JLabel();
        l30 = new javax.swing.JLabel();
        l29 = new javax.swing.JLabel();
        l36 = new javax.swing.JLabel();
        l35 = new javax.swing.JLabel();
        l34 = new javax.swing.JLabel();
        l33 = new javax.swing.JLabel();
        l40 = new javax.swing.JLabel();
        l39 = new javax.swing.JLabel();
        l38 = new javax.swing.JLabel();
        l37 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setFocusableWindowState(false);
        setMinimumSize(new java.awt.Dimension(540, 670));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("ScoreBoard");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 10, 200, 89);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 100, 58, 28);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("Color");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 100, 56, 28);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setText("Time");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 100, 51, 28);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setText("Score");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 100, 56, 28);

        l4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l4.setText("-");
        getContentPane().add(l4);
        l4.setBounds(390, 140, 90, 28);

        l3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l3.setText("-");
        getContentPane().add(l3);
        l3.setBounds(290, 140, 90, 28);

        l2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l2.setText("-");
        getContentPane().add(l2);
        l2.setBounds(200, 140, 90, 28);

        l1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        l1.setText("-");
        getContentPane().add(l1);
        l1.setBounds(100, 140, 80, 30);

        l8.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l8.setText("-");
        getContentPane().add(l8);
        l8.setBounds(390, 180, 90, 28);

        l7.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l7.setText("-");
        getContentPane().add(l7);
        l7.setBounds(290, 180, 90, 28);

        l6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l6.setText("-");
        getContentPane().add(l6);
        l6.setBounds(200, 180, 90, 28);

        l5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        l5.setText("-");
        getContentPane().add(l5);
        l5.setBounds(100, 180, 80, 30);

        l12.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l12.setText("-");
        getContentPane().add(l12);
        l12.setBounds(390, 220, 90, 28);

        l11.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l11.setText("-");
        getContentPane().add(l11);
        l11.setBounds(290, 220, 90, 28);

        l10.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l10.setText("-");
        getContentPane().add(l10);
        l10.setBounds(200, 220, 90, 28);

        l9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        l9.setText("-");
        getContentPane().add(l9);
        l9.setBounds(100, 220, 80, 30);

        l16.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l16.setText("-");
        getContentPane().add(l16);
        l16.setBounds(390, 260, 90, 28);

        l15.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l15.setText("-");
        getContentPane().add(l15);
        l15.setBounds(290, 260, 90, 28);

        l14.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l14.setText("-");
        getContentPane().add(l14);
        l14.setBounds(200, 260, 90, 28);

        l13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        l13.setText("-");
        getContentPane().add(l13);
        l13.setBounds(100, 260, 80, 30);

        l20.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l20.setText("-");
        getContentPane().add(l20);
        l20.setBounds(390, 300, 90, 28);

        l19.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l19.setText("-");
        getContentPane().add(l19);
        l19.setBounds(290, 300, 90, 28);

        l18.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l18.setText("-");
        getContentPane().add(l18);
        l18.setBounds(200, 300, 90, 28);

        l17.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        l17.setText("-");
        getContentPane().add(l17);
        l17.setBounds(100, 300, 80, 30);

        l24.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l24.setText("-");
        getContentPane().add(l24);
        l24.setBounds(390, 340, 90, 28);

        l23.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l23.setText("-");
        getContentPane().add(l23);
        l23.setBounds(290, 340, 90, 28);

        l22.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l22.setText("-");
        getContentPane().add(l22);
        l22.setBounds(200, 340, 90, 28);

        l21.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        l21.setText("-");
        getContentPane().add(l21);
        l21.setBounds(100, 340, 80, 30);

        l28.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l28.setText("-");
        getContentPane().add(l28);
        l28.setBounds(390, 380, 90, 28);

        l27.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l27.setText("-");
        getContentPane().add(l27);
        l27.setBounds(290, 380, 90, 28);

        l26.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l26.setText("-");
        getContentPane().add(l26);
        l26.setBounds(200, 380, 90, 28);

        l25.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        l25.setText("-");
        getContentPane().add(l25);
        l25.setBounds(100, 380, 80, 30);

        l32.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l32.setText("-");
        getContentPane().add(l32);
        l32.setBounds(390, 420, 90, 28);

        l31.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l31.setText("-");
        getContentPane().add(l31);
        l31.setBounds(290, 420, 90, 28);

        l30.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l30.setText("-");
        getContentPane().add(l30);
        l30.setBounds(200, 420, 90, 28);

        l29.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        l29.setText("-");
        getContentPane().add(l29);
        l29.setBounds(100, 420, 80, 30);

        l36.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l36.setText("-");
        getContentPane().add(l36);
        l36.setBounds(390, 460, 90, 28);

        l35.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l35.setText("-");
        getContentPane().add(l35);
        l35.setBounds(290, 460, 90, 28);

        l34.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l34.setText("-");
        getContentPane().add(l34);
        l34.setBounds(200, 460, 90, 28);

        l33.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        l33.setText("-");
        getContentPane().add(l33);
        l33.setBounds(100, 460, 80, 30);

        l40.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l40.setText("-");
        getContentPane().add(l40);
        l40.setBounds(390, 500, 90, 28);

        l39.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l39.setText("-");
        getContentPane().add(l39);
        l39.setBounds(290, 500, 90, 28);

        l38.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l38.setText("-");
        getContentPane().add(l38);
        l38.setBounds(200, 500, 90, 28);

        l37.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        l37.setText("-");
        getContentPane().add(l37);
        l37.setBounds(100, 500, 80, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jButton1.setText("Return");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 590, 180, 40);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/about.gif"))); // NOI18N
        jLabel46.setText("jLabel46");
        getContentPane().add(jLabel46);
        jLabel46.setBounds(0, 0, 540, 670);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        this.dispose();
        main.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void setVar() {
        
        for (int row = 0; row < 10; row++) {
            try {
                labels[row * 4].setText(names[row]);
                labels[(row * 4) + 1].setText(colors[row]);
                labels[(row * 4) + 2].setText(String.valueOf(scoress[row]));
                labels[(row * 4) + 3].setText(String.valueOf(time[row]));
            } catch (Exception e) {
            }
        }
        for (int i = 0; i<40; i++) {
            if (labels[i].getText() == "-") {
                labels[i].setText("");
            }
        }
    }
    
    public void initlabels() {
        labels[0] = l1;
        labels[1] = l2;
        labels[2] = l3;
        labels[3] = l4;
        labels[4] = l5;
        labels[5] = l6;
        labels[6] = l7;
        labels[7] = l8;
        labels[8] = l9;
        labels[9] = l10;
        labels[10] = l11;
        labels[11] = l12;
        labels[12] = l13;
        labels[13] = l14;
        labels[14] = l15;
        labels[15] = l16;
        labels[16] = l17;
        labels[17] = l18;
        labels[18] = l19;
        labels[19] = l20;
        labels[20] = l21;
        labels[21] = l22;
        labels[22] = l23;
        labels[23] = l24;
        labels[24] = l25;
        labels[25] = l26;
        labels[26] = l27;
        labels[27] = l28;
        labels[28] = l29;
        labels[29] = l30;
        labels[30] = l31;
        labels[31] = l32;
        labels[32] = l33;
        labels[33] = l34;
        labels[34] = l35;
        labels[35] = l36;
        labels[36] = l37;
        labels[37] = l38;
        labels[38] = l39;
        labels[39] = l40;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scoreBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l18;
    private javax.swing.JLabel l19;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l20;
    private javax.swing.JLabel l21;
    private javax.swing.JLabel l22;
    private javax.swing.JLabel l23;
    private javax.swing.JLabel l24;
    private javax.swing.JLabel l25;
    private javax.swing.JLabel l26;
    private javax.swing.JLabel l27;
    private javax.swing.JLabel l28;
    private javax.swing.JLabel l29;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l30;
    private javax.swing.JLabel l31;
    private javax.swing.JLabel l32;
    private javax.swing.JLabel l33;
    private javax.swing.JLabel l34;
    private javax.swing.JLabel l35;
    private javax.swing.JLabel l36;
    private javax.swing.JLabel l37;
    private javax.swing.JLabel l38;
    private javax.swing.JLabel l39;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l40;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    // End of variables declaration//GEN-END:variables
}
