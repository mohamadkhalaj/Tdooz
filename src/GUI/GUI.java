package GUI;
import javax.swing.*;
import java.awt.Color;
import java.util.Random;
import Cells.*;
import Game.*;
import menu.InsideGameMenu;
import Score.netScore;

public class GUI extends javax.swing.JFrame {   
    public static JButton[] Buttons = new JButton[64];
    Game game = new Game();
    public String Player = game.getPlayer();
    public SuperBtns RTE = new SuperBtns();
    SuperBtns clr = new SuperBtns();
    
    public GUI() {
        initComponents();
	initGame();
        game.resetGame();
        superColors();
        superStatusResetToEnable();
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn48 = new javax.swing.JButton();
        btn47 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn56 = new javax.swing.JButton();
        btn55 = new javax.swing.JButton();
        btn54 = new javax.swing.JButton();
        btn53 = new javax.swing.JButton();
        btn52 = new javax.swing.JButton();
        btn51 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btn49 = new javax.swing.JButton();
        btn64 = new javax.swing.JButton();
        btn63 = new javax.swing.JButton();
        btn62 = new javax.swing.JButton();
        btn61 = new javax.swing.JButton();
        btn60 = new javax.swing.JButton();
        btn59 = new javax.swing.JButton();
        btn58 = new javax.swing.JButton();
        btn57 = new javax.swing.JButton();
        super1 = new javax.swing.JButton();
        super2 = new javax.swing.JButton();
        super3 = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        status = new javax.swing.JButton();
        greenScore = new javax.swing.JLabel();
        greenScoreText = new javax.swing.JLabel();
        blackScoreText = new javax.swing.JLabel();
        blackScore = new javax.swing.JLabel();
        menuButton = new javax.swing.JButton();
        prompt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tedooz beta");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn1.setToolTipText("");
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn1.setFocusPainted(false);
        btn1.setFocusable(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 60, 60));

        btn2.setBackground(new java.awt.Color(204, 204, 204));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn2.setToolTipText("");
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn2.setFocusPainted(false);
        btn2.setFocusable(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 31, 60, 60));

        btn3.setBackground(new java.awt.Color(204, 204, 204));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn3.setToolTipText("");
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn3.setFocusPainted(false);
        btn3.setFocusable(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 31, 60, 60));

        btn4.setBackground(new java.awt.Color(204, 204, 204));
        btn4.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn4.setToolTipText("");
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn4.setFocusPainted(false);
        btn4.setFocusable(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 31, 60, 60));

        btn5.setBackground(new java.awt.Color(204, 204, 204));
        btn5.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn5.setToolTipText("");
        btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn5.setFocusPainted(false);
        btn5.setFocusable(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 31, 60, 60));

        btn6.setBackground(new java.awt.Color(204, 204, 204));
        btn6.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn6.setToolTipText("");
        btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn6.setFocusPainted(false);
        btn6.setFocusable(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 31, 60, 60));

        btn7.setBackground(new java.awt.Color(204, 204, 204));
        btn7.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn7.setToolTipText("");
        btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn7.setFocusPainted(false);
        btn7.setFocusable(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 31, 60, 60));

        btn8.setBackground(new java.awt.Color(204, 204, 204));
        btn8.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn8.setToolTipText("");
        btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn8.setFocusPainted(false);
        btn8.setFocusable(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 31, 60, 60));

        btn16.setBackground(new java.awt.Color(204, 204, 204));
        btn16.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn16.setToolTipText("");
        btn16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));
        btn16.setFocusPainted(false);
        btn16.setFocusable(false);
        btn16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 97, 60, 60));

        btn15.setBackground(new java.awt.Color(204, 204, 204));
        btn15.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn15.setToolTipText("");
        btn15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn15.setFocusPainted(false);
        btn15.setFocusable(false);
        btn15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 97, 60, 60));

        btn14.setBackground(new java.awt.Color(204, 204, 204));
        btn14.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn14.setToolTipText("");
        btn14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn14.setFocusPainted(false);
        btn14.setFocusable(false);
        btn14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 97, 60, 60));

        btn13.setBackground(new java.awt.Color(204, 204, 204));
        btn13.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn13.setToolTipText("");
        btn13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn13.setFocusPainted(false);
        btn13.setFocusable(false);
        btn13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 97, 60, 60));

        btn12.setBackground(new java.awt.Color(204, 204, 204));
        btn12.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn12.setToolTipText("");
        btn12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn12.setFocusPainted(false);
        btn12.setFocusable(false);
        btn12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 97, 60, 60));

        btn11.setBackground(new java.awt.Color(204, 204, 204));
        btn11.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn11.setToolTipText("");
        btn11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn11.setFocusPainted(false);
        btn11.setFocusable(false);
        btn11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 97, 60, 60));

        btn10.setBackground(new java.awt.Color(204, 204, 204));
        btn10.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn10.setToolTipText("");
        btn10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn10.setFocusPainted(false);
        btn10.setFocusable(false);
        btn10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 97, 60, 60));

        btn9.setBackground(new java.awt.Color(204, 204, 204));
        btn9.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn9.setToolTipText("");
        btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn9.setFocusPainted(false);
        btn9.setFocusable(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, 60, 60));

        btn24.setBackground(new java.awt.Color(204, 204, 204));
        btn24.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn24.setToolTipText("");
        btn24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn24.setFocusPainted(false);
        btn24.setFocusable(false);
        btn24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 163, 60, 60));

        btn23.setBackground(new java.awt.Color(204, 204, 204));
        btn23.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn23.setToolTipText("");
        btn23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn23.setFocusPainted(false);
        btn23.setFocusable(false);
        btn23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 163, 60, 60));

        btn22.setBackground(new java.awt.Color(204, 204, 204));
        btn22.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn22.setToolTipText("");
        btn22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn22.setFocusPainted(false);
        btn22.setFocusable(false);
        btn22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 163, 60, 60));

        btn21.setBackground(new java.awt.Color(204, 204, 204));
        btn21.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn21.setToolTipText("");
        btn21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn21.setFocusPainted(false);
        btn21.setFocusable(false);
        btn21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 163, 60, 60));

        btn20.setBackground(new java.awt.Color(204, 204, 204));
        btn20.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn20.setToolTipText("");
        btn20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn20.setFocusPainted(false);
        btn20.setFocusable(false);
        btn20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 163, 60, 60));

        btn19.setBackground(new java.awt.Color(204, 204, 204));
        btn19.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn19.setToolTipText("");
        btn19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn19.setFocusPainted(false);
        btn19.setFocusable(false);
        btn19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 163, 60, 60));

        btn18.setBackground(new java.awt.Color(204, 204, 204));
        btn18.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn18.setToolTipText("");
        btn18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn18.setFocusPainted(false);
        btn18.setFocusable(false);
        btn18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 163, 60, 60));

        btn17.setBackground(new java.awt.Color(204, 204, 204));
        btn17.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn17.setToolTipText("");
        btn17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn17.setFocusPainted(false);
        btn17.setFocusable(false);
        btn17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, 60, 60));

        btn32.setBackground(new java.awt.Color(204, 204, 204));
        btn32.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn32.setToolTipText("");
        btn32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));
        btn32.setFocusPainted(false);
        btn32.setFocusable(false);
        btn32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn32, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 229, 60, 60));

        btn31.setBackground(new java.awt.Color(204, 204, 204));
        btn31.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn31.setToolTipText("");
        btn31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn31.setFocusPainted(false);
        btn31.setFocusable(false);
        btn31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn31, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 229, 60, 60));

        btn30.setBackground(new java.awt.Color(204, 204, 204));
        btn30.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn30.setToolTipText("");
        btn30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn30.setFocusPainted(false);
        btn30.setFocusable(false);
        btn30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 229, 60, 60));

        btn29.setBackground(new java.awt.Color(204, 204, 204));
        btn29.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn29.setToolTipText("");
        btn29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn29.setFocusPainted(false);
        btn29.setFocusable(false);
        btn29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn29, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 229, 60, 60));

        btn28.setBackground(new java.awt.Color(204, 204, 204));
        btn28.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn28.setToolTipText("");
        btn28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn28.setFocusPainted(false);
        btn28.setFocusable(false);
        btn28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn28, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 229, 60, 60));

        btn27.setBackground(new java.awt.Color(204, 204, 204));
        btn27.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn27.setToolTipText("");
        btn27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn27.setFocusPainted(false);
        btn27.setFocusable(false);
        btn27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn27, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 229, 60, 60));

        btn26.setBackground(new java.awt.Color(204, 204, 204));
        btn26.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn26.setToolTipText("");
        btn26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn26.setFocusPainted(false);
        btn26.setFocusable(false);
        btn26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn26, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 229, 60, 60));

        btn25.setBackground(new java.awt.Color(204, 204, 204));
        btn25.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn25.setToolTipText("");
        btn25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn25.setFocusPainted(false);
        btn25.setFocusable(false);
        btn25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 229, 60, 60));

        btn40.setBackground(new java.awt.Color(204, 204, 204));
        btn40.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn40.setToolTipText("");
        btn40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        btn40.setFocusPainted(false);
        btn40.setFocusable(false);
        btn40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn40, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 295, 60, 60));

        btn39.setBackground(new java.awt.Color(204, 204, 204));
        btn39.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn39.setToolTipText("");
        btn39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn39.setFocusPainted(false);
        btn39.setFocusable(false);
        btn39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn39, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 295, 60, 60));

        btn38.setBackground(new java.awt.Color(204, 204, 204));
        btn38.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn38.setToolTipText("");
        btn38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn38.setFocusPainted(false);
        btn38.setFocusable(false);
        btn38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn38, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 295, 60, 60));

        btn37.setBackground(new java.awt.Color(204, 204, 204));
        btn37.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn37.setToolTipText("");
        btn37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn37.setFocusPainted(false);
        btn37.setFocusable(false);
        btn37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn37, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 295, 60, 60));

        btn36.setBackground(new java.awt.Color(204, 204, 204));
        btn36.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn36.setToolTipText("");
        btn36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn36.setFocusPainted(false);
        btn36.setFocusable(false);
        btn36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn36, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 295, 60, 60));

        btn35.setBackground(new java.awt.Color(204, 204, 204));
        btn35.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn35.setToolTipText("");
        btn35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn35.setFocusPainted(false);
        btn35.setFocusable(false);
        btn35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn35, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 295, 60, 60));

        btn34.setBackground(new java.awt.Color(204, 204, 204));
        btn34.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn34.setToolTipText("");
        btn34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn34.setFocusPainted(false);
        btn34.setFocusable(false);
        btn34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn34, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 295, 60, 60));

        btn33.setBackground(new java.awt.Color(204, 204, 204));
        btn33.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn33.setToolTipText("");
        btn33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn33.setFocusPainted(false);
        btn33.setFocusable(false);
        btn33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 60, 60));

        btn48.setBackground(new java.awt.Color(204, 204, 204));
        btn48.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn48.setToolTipText("");
        btn48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn48.setFocusPainted(false);
        btn48.setFocusable(false);
        btn48.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn48, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 361, 60, 60));

        btn47.setBackground(new java.awt.Color(204, 204, 204));
        btn47.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn47.setToolTipText("");
        btn47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn47.setFocusPainted(false);
        btn47.setFocusable(false);
        btn47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn47, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 361, 60, 60));

        btn46.setBackground(new java.awt.Color(204, 204, 204));
        btn46.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn46.setToolTipText("");
        btn46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn46.setFocusPainted(false);
        btn46.setFocusable(false);
        btn46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn46, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 361, 60, 60));

        btn45.setBackground(new java.awt.Color(204, 204, 204));
        btn45.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn45.setToolTipText("");
        btn45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn45.setFocusPainted(false);
        btn45.setFocusable(false);
        btn45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn45, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 361, 60, 60));

        btn44.setBackground(new java.awt.Color(204, 204, 204));
        btn44.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn44.setToolTipText("");
        btn44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn44.setFocusPainted(false);
        btn44.setFocusable(false);
        btn44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn44, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 361, 60, 60));

        btn43.setBackground(new java.awt.Color(204, 204, 204));
        btn43.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn43.setToolTipText("");
        btn43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn43.setFocusPainted(false);
        btn43.setFocusable(false);
        btn43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn43, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 361, 60, 60));

        btn42.setBackground(new java.awt.Color(204, 204, 204));
        btn42.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn42.setToolTipText("");
        btn42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn42.setFocusPainted(false);
        btn42.setFocusable(false);
        btn42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn42, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 361, 60, 60));

        btn41.setBackground(new java.awt.Color(204, 204, 204));
        btn41.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn41.setToolTipText("");
        btn41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn41.setFocusPainted(false);
        btn41.setFocusable(false);
        btn41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 361, 60, 60));

        btn56.setBackground(new java.awt.Color(204, 204, 204));
        btn56.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn56.setToolTipText("");
        btn56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn56.setFocusPainted(false);
        btn56.setFocusable(false);
        btn56.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn56, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 427, 60, 60));

        btn55.setBackground(new java.awt.Color(204, 204, 204));
        btn55.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn55.setToolTipText("");
        btn55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn55.setFocusPainted(false);
        btn55.setFocusable(false);
        btn55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn55, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 427, 60, 60));

        btn54.setBackground(new java.awt.Color(204, 204, 204));
        btn54.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn54.setToolTipText("");
        btn54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn54.setFocusPainted(false);
        btn54.setFocusable(false);
        btn54.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn54, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 427, 60, 60));

        btn53.setBackground(new java.awt.Color(204, 204, 204));
        btn53.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn53.setToolTipText("");
        btn53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn53.setFocusPainted(false);
        btn53.setFocusable(false);
        btn53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn53, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 427, 60, 60));

        btn52.setBackground(new java.awt.Color(204, 204, 204));
        btn52.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn52.setToolTipText("");
        btn52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn52.setFocusPainted(false);
        btn52.setFocusable(false);
        btn52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn52, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 427, 60, 60));

        btn51.setBackground(new java.awt.Color(204, 204, 204));
        btn51.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn51.setToolTipText("");
        btn51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn51.setFocusPainted(false);
        btn51.setFocusable(false);
        btn51.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn51, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 427, 60, 60));

        btn50.setBackground(new java.awt.Color(204, 204, 204));
        btn50.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn50.setToolTipText("");
        btn50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn50.setFocusPainted(false);
        btn50.setFocusable(false);
        btn50.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn50, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 427, 60, 60));

        btn49.setBackground(new java.awt.Color(204, 204, 204));
        btn49.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn49.setToolTipText("");
        btn49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn49.setFocusPainted(false);
        btn49.setFocusable(false);
        btn49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 427, 60, 60));

        btn64.setBackground(new java.awt.Color(204, 204, 204));
        btn64.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn64.setToolTipText("");
        btn64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn64.setFocusPainted(false);
        btn64.setFocusable(false);
        btn64.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn64, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 493, 60, 60));

        btn63.setBackground(new java.awt.Color(204, 204, 204));
        btn63.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn63.setToolTipText("");
        btn63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn63.setFocusPainted(false);
        btn63.setFocusable(false);
        btn63.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn63, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 493, 60, 60));

        btn62.setBackground(new java.awt.Color(204, 204, 204));
        btn62.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn62.setToolTipText("");
        btn62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn62.setFocusPainted(false);
        btn62.setFocusable(false);
        btn62.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn62, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 493, 60, 60));

        btn61.setBackground(new java.awt.Color(204, 204, 204));
        btn61.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn61.setToolTipText("");
        btn61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn61.setFocusPainted(false);
        btn61.setFocusable(false);
        btn61.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn61, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 493, 60, 60));

        btn60.setBackground(new java.awt.Color(204, 204, 204));
        btn60.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn60.setToolTipText("");
        btn60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn60.setFocusPainted(false);
        btn60.setFocusable(false);
        btn60.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn60, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 493, 60, 60));

        btn59.setBackground(new java.awt.Color(204, 204, 204));
        btn59.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn59.setToolTipText("");
        btn59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn59.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn59.setFocusPainted(false);
        btn59.setFocusable(false);
        btn59.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn59, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 493, 60, 60));

        btn58.setBackground(new java.awt.Color(204, 204, 204));
        btn58.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn58.setToolTipText("");
        btn58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn58.setFocusPainted(false);
        btn58.setFocusable(false);
        btn58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn58, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 493, 60, 60));

        btn57.setBackground(new java.awt.Color(204, 204, 204));
        btn57.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btn57.setToolTipText("");
        btn57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        btn57.setDefaultCapable(false);
        btn57.setFocusPainted(false);
        btn57.setFocusable(false);
        btn57.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn57.setRequestFocusEnabled(false);
        btn57.setVerifyInputWhenFocusTarget(false);
        btn57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        btn57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionCall(evt);
            }
        });
        getContentPane().add(btn57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 493, 60, 60));

        super1.setBackground(new java.awt.Color(255, 255, 255));
        super1.setForeground(new java.awt.Color(255, 255, 255));
        super1.setText("%");
        super1.setCursor(new java.awt.Cursor(java.awt.Cursor.SW_RESIZE_CURSOR));
        super1.setFocusable(false);
        super1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superStatus1(evt);
            }
        });
        getContentPane().add(super1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 571, 53, -1));

        super2.setBackground(new java.awt.Color(255, 255, 255));
        super2.setForeground(new java.awt.Color(255, 255, 255));
        super2.setText("$");
        super2.setCursor(new java.awt.Cursor(java.awt.Cursor.S_RESIZE_CURSOR));
        super2.setFocusable(false);
        super2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superStatus2(evt);
            }
        });
        getContentPane().add(super2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 53, -1));

        super3.setBackground(new java.awt.Color(255, 255, 255));
        super3.setForeground(new java.awt.Color(255, 255, 255));
        super3.setText("*");
        super3.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        super3.setFocusable(false);
        super3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superStatus3(evt);
            }
        });
        getContentPane().add(super3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 629, 53, -1));

        Clear.setBackground(new java.awt.Color(255, 255, 255));
        Clear.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Clear.setText("Clear");
        Clear.setBorder(null);
        Clear.setBorderPainted(false);
        Clear.setContentAreaFilled(false);
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.setFocusable(false);
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSupers(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 600, 70, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        status.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("status");
        status.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        status.setEnabled(false);
        status.setFocusPainted(false);
        status.setFocusable(false);
        status.setMargin(new java.awt.Insets(0, 0, 0, 0));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel4.add(status);
        status.setBounds(180, 589, 200, 36);

        greenScore.setText("0");
        jPanel4.add(greenScore);
        greenScore.setBounds(244, 5, 41, 25);

        greenScoreText.setText("Green");
        jPanel4.add(greenScoreText);
        greenScoreText.setBounds(200, 5, 42, 25);

        blackScoreText.setText("Black");
        jPanel4.add(blackScoreText);
        blackScoreText.setBounds(303, 5, 42, 25);

        blackScore.setText("0");
        jPanel4.add(blackScore);
        blackScore.setBounds(352, 5, 29, 25);

        menuButton.setBackground(new java.awt.Color(255, 255, 255));
        menuButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        menuButton.setText("menu");
        menuButton.setBorder(null);
        menuButton.setBorderPainted(false);
        menuButton.setContentAreaFilled(false);
        menuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuButton.setFocusPainted(false);
        menuButton.setFocusable(false);
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonAction(evt);
            }
        });
        jPanel4.add(menuButton);
        menuButton.setBounds(460, 0, 68, 28);

        prompt.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        prompt.setForeground(new java.awt.Color(255, 0, 0));
        prompt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prompt.setText("prompt");
        prompt.setFocusable(false);
        jPanel4.add(prompt);
        prompt.setBounds(200, 632, 159, 38);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/Game.jpg"))); // NOI18N
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 670);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ActionCall(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionCall

        superStatusResetToDisable();
        superStatusResetToEnable();
        
        mouseEvents ac = new mouseEvents();
        ac.actionCall(evt);
        superColors();
        getStatus();
        //game.clearSupers();
    }//GEN-LAST:event_ActionCall

    private void superStatus3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superStatus3
        SuperBtns su3 = new SuperBtns();
        su3.superbtns3();
    }//GEN-LAST:event_superStatus3

    private void superStatus2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superStatus2
        SuperBtns su2 = new SuperBtns();
        su2.superbtns2();
    }//GEN-LAST:event_superStatus2

    private void superStatus1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superStatus1
        SuperBtns su1 = new SuperBtns();
        su1.superbtns1();
    }//GEN-LAST:event_superStatus1

    private void clearSupers(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSupers
        game.clearSupers();
    }//GEN-LAST:event_clearSupers

    private void MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseEntered
        mouseEvents mE = new mouseEvents();
        mE.mouseEntered(evt);
    }//GEN-LAST:event_MouseEntered

    private void MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseExited
        mouseEvents mEx = new mouseEvents();
        mEx.mouseExited(evt);
    }//GEN-LAST:event_MouseExited

    private void MenuButtonAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonAction
        InsideGameMenu MenuIn = new InsideGameMenu();
        MenuIn.setVars(game, RTE, clr);
    }//GEN-LAST:event_MenuButtonAction

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed
    
    private void superStatusResetToEnable() {
        RTE.superStatusResetToEnable();
    }
    
    private void superStatusResetToDisable() {
        SuperBtns RTD = new SuperBtns();
        RTD.superStatusResetToDisable();
    }
    
    private void superColors() {
        clr.superColors();
    }
    
    private void getStatus() {
        score();
        game.getStatus();
    }
    
    public void score() {
        netScore scr = new netScore();
        scr.get();
    }
    
    public void initGame() {
        
        game.setVars(super1, super2, super3, prompt, status, greenScore, blackScore);
        initButtons();
        superColors();
        getStatus();
        prompt.setText("");
    }
    
    public void initButtons() {
        Buttons[0] = btn1;
        Buttons[1] = btn2;
        Buttons[2] = btn3;
        Buttons[3] = btn4;
        Buttons[4] = btn5;
        Buttons[5] = btn6;
        Buttons[6] = btn7;
        Buttons[7] = btn8;
        Buttons[8] = btn9;
        Buttons[9] = btn10;
        Buttons[10] = btn11;
        Buttons[11] = btn12;
        Buttons[12] = btn13;
        Buttons[13] = btn14;
        Buttons[14] = btn15;
        Buttons[15] = btn16;
        Buttons[16] = btn17;
        Buttons[17] = btn18;
        Buttons[18] = btn19;
        Buttons[19] = btn20;
        Buttons[20] = btn21;
        Buttons[21] = btn22;
        Buttons[22] = btn23;
        Buttons[23] = btn24;
        Buttons[24] = btn25;
        Buttons[25] = btn26;
        Buttons[26] = btn27;
        Buttons[27] = btn28;
        Buttons[28] = btn29;
        Buttons[29] = btn30;
        Buttons[30] = btn31;
        Buttons[31] = btn32;
        Buttons[32] = btn33;
        Buttons[33] = btn34;
        Buttons[34] = btn35;
        Buttons[35] = btn36;
        Buttons[36] = btn37;
        Buttons[37] = btn38;
        Buttons[38] = btn39;
        Buttons[39] = btn40;
        Buttons[40] = btn41;
        Buttons[41] = btn42;
        Buttons[42] = btn43;
        Buttons[43] = btn44;
        Buttons[44] = btn45;
        Buttons[45] = btn46;
        Buttons[46] = btn47;
        Buttons[47] = btn48;
        Buttons[48] = btn49;
        Buttons[49] = btn50;
        Buttons[50] = btn51;
        Buttons[51] = btn52;
        Buttons[52] = btn53;
        Buttons[53] = btn54;
        Buttons[54] = btn55;
        Buttons[55] = btn56;
        Buttons[56] = btn57;
        Buttons[57] = btn58;
        Buttons[58] = btn59;
        Buttons[59] = btn60;
        Buttons[60] = btn61;
        Buttons[61] = btn62;
        Buttons[62] = btn63;
        Buttons[63] = btn64;
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JLabel blackScore;
    private javax.swing.JLabel blackScoreText;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn47;
    private javax.swing.JButton btn48;
    private javax.swing.JButton btn49;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn51;
    private javax.swing.JButton btn52;
    private javax.swing.JButton btn53;
    private javax.swing.JButton btn54;
    private javax.swing.JButton btn55;
    private javax.swing.JButton btn56;
    private javax.swing.JButton btn57;
    private javax.swing.JButton btn58;
    private javax.swing.JButton btn59;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn60;
    private javax.swing.JButton btn61;
    private javax.swing.JButton btn62;
    private javax.swing.JButton btn63;
    private javax.swing.JButton btn64;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel greenScore;
    private javax.swing.JLabel greenScoreText;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton menuButton;
    private javax.swing.JLabel prompt;
    private javax.swing.JButton status;
    private javax.swing.JButton super1;
    private javax.swing.JButton super2;
    private javax.swing.JButton super3;
    // End of variables declaration//GEN-END:variables
}
