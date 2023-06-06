package Cells;

import java.awt.Color;
import javax.swing.JButton;

import GUI.GUI;
import static GUI.GUI.Buttons;
import music.ButtonMusic;

public class mouseEvents extends Cells{
    
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        JButton btn = (JButton) evt.getSource();
        int cell = getCell(btn);
        int row = getRow(cell);
        if (canFill(row, cell)) {
            if (btn.getText() != "O" && btn.getText() != "%" && btn.getText() != "*" && btn.getText() != "$") {
                if (Player == "G") {

                    btn.setBackground(new java.awt.Color(204,255,204));
                }
                else {

                    btn.setBackground(new java.awt.Color(102,102,102));
                }
            }
        }
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        JButton btn = (JButton) evt.getSource();
        int cell = getCell(btn);
        
        if (btn.getText() != "O" && btn.getText() != "%" && btn.getText() != "*" && btn.getText() != "$") {
            btn.setBackground(new java.awt.Color(204, 204, 204));
        }
    }
    
    public boolean isBlack(JButton jb) {
        if(jb.getForeground().getBlue() == 0) {
            if(jb.getForeground().getRed() == 0) {
                if(jb.getForeground().getGreen() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean isGreen(JButton jb) {
        if(jb.getForeground().getGreen() == 0) {
            return true;
        }
        return false;
    }
    
    public void actionCall(java.awt.event.ActionEvent evt) {
        
        prompt.setText("");
        JButton btn = (JButton) evt.getSource();
        
        if (!btn.getText().isEmpty()) {
            clearSupers();
            return;
        }
        
        int cell = getCell(btn); 
        int row = getRow(cell);
        
        if (!canFill(row, cell)) {
            prompt.setText("Can\'t Fill This Cell!");
            clearSupers();
            prompt.setForeground(Color.red);
            return;
        }
        
        ButtonMusic music = new ButtonMusic();
        String filePath = "buttonClick.wav";
        music.playMusic(filePath);
        
        if (blackSu1 == 0 && selectOne == 4) { 
            if (getRow(cell) != 8 && getCol(cell) != 1) {
                btn.setText("%"); 
                blackSu1 ++; 
                JButton current = Buttons[cell + 6];
                if (!current.getText().isEmpty()) {
                    if (current.getForeground() == Color.green) {
                        current.setForeground(Color.black);
                        current.setBackground(Color.black);
                        greenDiff --;
                        blackDiff ++;
                    }
                }    
            }
            else {
                prompt.setText("Whitout effect!");
                btn.setText("%"); 
                blackSu1 ++; 
            }
            btn.setForeground(Color.white);
            btn.setBackground(Color.black);
        }
        else if (blackSu2 == 0 && selectOne == 5) { 
            if (getRow(cell) != 8) {
                btn.setText("$"); 
                blackSu2 ++; 
                JButton current = Buttons[cell + 7];
                if (!current.getText().isEmpty()) {
                    if (current.getForeground() == Color.green) {
                        current.setForeground(Color.black);
                        current.setBackground(Color.black);
                        greenDiff --;
                        blackDiff ++;
                    }
                }
            }
            else {
                prompt.setText("can\'t use this here");
                clearSupers();
                return;
            }
            btn.setForeground(Color.white);
            btn.setBackground(Color.black);
        }
        else if (blackSu3 == 0 && selectOne == 6) { 
            if (getRow(cell) != 8 && getCol(cell) != 8) {
                btn.setText("*"); 
                blackSu3 ++; 
                JButton current = Buttons[cell + 8];
                if (!current.getText().isEmpty()) {
                    if (current.getForeground() == Color.green) {
                        current.setForeground(Color.black);
                        current.setBackground(Color.black);
                        greenDiff --;
                        blackDiff ++;
                    }
                }
            }
            else {
                prompt.setText("Whitout effect!");
                btn.setText("*"); 
                blackSu3 ++; 
            }
            btn.setForeground(Color.white);
            btn.setBackground(Color.black);
        }
        else if (greenSu1 == 0 && selectOne == 1) { 
            if (getRow(cell) != 8 && getCol(cell) != 1) {
                btn.setText("%"); 
                greenSu1 ++; 
                JButton current = Buttons[cell + 6];
                if (!current.getText().isEmpty()) {
                    if (current.getForeground() == Color.black) {
                        current.setForeground(Color.green);
                        current.setBackground(Color.green);
                        greenDiff ++;
                        blackDiff --;
                    }
                }
            }
            else {
                prompt.setText("Whitout effect!");
                btn.setText("%"); 
                greenSu1 ++; 
            }
            btn.setForeground(Color.white);
            btn.setBackground(Color.green);
        }
        else if (greenSu2 == 0 && selectOne == 2) { 
            if (getRow(cell) != 8) {
                btn.setText("$"); 
                greenSu2 ++; 
                JButton current = Buttons[cell + 7];
                if (!current.getText().isEmpty()) {
                    if (current.getForeground() == Color.black) {
                        current.setForeground(Color.green);
                        current.setBackground(Color.green);
                        greenDiff ++;
                        blackDiff --;
                    }
                }
            }
            else {
                prompt.setText("can\'t use this here");
                clearSupers();
                return;
            }
            btn.setForeground(Color.white);
            btn.setBackground(Color.green);
        }
        else if (greenSu3 == 0 && selectOne == 3) { 
            if (getRow(cell) != 8 && getCol(cell) != 8) {
                btn.setText("*"); 
                greenSu3 ++; 
                JButton current = Buttons[cell + 8];
                if (!current.getText().isEmpty()) {
                    if (current.getForeground() == Color.black) {
                        current.setForeground(Color.green);
                        current.setBackground(Color.green);
                        greenDiff ++;
                        blackDiff --;
                    }
                }
            }
            else {
                prompt.setText("Whitout effect!");
                btn.setText("*"); 
                greenSu3 ++; 
            }
            btn.setForeground(Color.white);
            btn.setBackground(Color.green);
        }
        else if (greenOrBtns < 29 && Player == "G") {
            btn.setText("O");
            btn.setBackground(Color.green);
            btn.setForeground(Color.green);
        }
        else if (blackOrBtns < 29 && Player == "B") {
            btn.setText("O");
            btn.setBackground(Color.black);
            btn.setForeground(Color.black);
        }
        else { clearSupers(); prompt.setText("Use your super buttons!"); prompt.setBackground(Color.red);}
        
        if (greenOrBtns < 29 && Player == "G") {
            
            if (btn.getForeground() != Color.white)
            greenOrBtns ++;
            Player = "B";

        }
        else if (blackOrBtns < 29 && Player == "B") {
            
            if (btn.getForeground() != Color.white)
            blackOrBtns ++;
            Player = "G";

        }
        else if (Player == "G" && btn.getForeground() == Color.white) {
            Player = "B";
        }
        else if (Player == "B" && btn.getForeground() == Color.white) {
            Player = "G";
        }
        System.out.println(greenOrBtns + " Black: " + blackOrBtns);
        System.out.println(greenDiff + " Black: " + blackDiff);
        selectOne = 0;
    }
}
