package Cells;

import javax.swing.JButton;
import GUI.GUI;
import Game.Game;
import java.awt.Color;

public class Cells extends Game{
    
    public int getCell(JButton btn) {
        int cell = 0;
        for(int i = 0; i<64; i++) {
            if (btn == GUI.Buttons[i]) {
                return i + 1;
            }
        }
        return 1;
    }
    public int getRow(int cell) {
        int row = cell / 8;
        if (cell % 8 == 0) return row;
        else return row + 1;
    }
    public int getCol(int cell) {
        cell -= 1;
        return cell % 8 + 1;
    }
    
    public boolean canFill(int row, int cell) {
        if (row == 8) return true;
        else {
            if (!GUI.Buttons[cell + 7].getText().isEmpty()) {
                return true;
            }else return false;
        }
    }
    
}
