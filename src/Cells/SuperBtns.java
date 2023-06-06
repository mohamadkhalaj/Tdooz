package Cells;
import Game.Game;
import java.awt.Color;
import javax.swing.JButton;
import music.ButtonMusic;

public class SuperBtns extends Game{
    
    public void superbtns1 () {
        
        String filePath = "superClick.wav";    //music
        ButtonMusic Test = new ButtonMusic();  //musuc
        Test.playMusic(filePath);   //music
        
        if (Player == "G" && greenSu1 == 0) {
            if (greenSu2 == 0) {
                super2.setEnabled(true);
            }
            if (greenSu3 == 0) {
                super3.setEnabled(true);
            }
            super1.setEnabled(false);
            selectOne = 1;
        }
        if (Player == "B" && blackSu1 == 0) {
            if (blackSu2 == 0) {
                super2.setEnabled(true);
            }
            if (blackSu3 == 0) {
                super3.setEnabled(true);
            }
            super1.setEnabled(false);
            selectOne = 4;
        }
    }
    
    public void superbtns2 () {
        
        String filePath = "superClick.wav";    //music
        ButtonMusic Test = new ButtonMusic();  //musuc
        Test.playMusic(filePath);   //music
        
        if (Player == "G" && greenSu2 == 0) {
            if (greenSu1 == 0) {
                super1.setEnabled(true);
            }
            if (greenSu3 == 0) {
                super3.setEnabled(true);
            }
            super2.setEnabled(false);
            selectOne = 2;
        }
        if (Player == "B" && blackSu2 == 0) {
            if (blackSu1 == 0) {
                super1.setEnabled(true);
            }
            if (blackSu3 == 0) {
                super3.setEnabled(true);
            }
            super2.setEnabled(false);
            selectOne = 5;
        }
    }
    
    public void superbtns3 () {
        
        String filePath = "superClick.wav";    //music
        ButtonMusic Test = new ButtonMusic();  //musuc
        Test.playMusic(filePath);   //music
        
        if (Player == "G" && greenSu3 == 0) {
            if (greenSu1 == 0) {
                super1.setEnabled(true);
            }
            if (greenSu2 == 0) {
                super2.setEnabled(true);
            }
            super3.setEnabled(false);
            selectOne = 3;
        }
        if (Player == "B" && blackSu3 == 0) {
            if (blackSu1 == 0) {
                super1.setEnabled(true);
            }
            if (blackSu2 == 0) {
                super2.setEnabled(true);
            }
            super3.setEnabled(false);
            selectOne = 6;
        }
    }
    
    public static void superStatusResetToDisable() {
        
        if (Player == "G" && blackSu1 == 1) {
            super1.setEnabled(false);
        }
        if (Player == "G" && blackSu2 == 1) {
            super2.setEnabled(false);
        }
        if (Player == "G" && blackSu3 == 1) {
            super3.setEnabled(false);
        }
        
        if (Player == "B" && greenSu1 == 1) {
            super1.setEnabled(false);
        }
        if (Player == "B" && greenSu2 == 1) {
            super2.setEnabled(false);
        }
        if (Player == "B" && greenSu3 == 1) {
            super3.setEnabled(false);
        }
    }
    
    public static void superStatusResetToEnable() {
        
        if (Player == "G" && blackSu1 == 0) {
            super1.setEnabled(true);
        }
        if (Player == "G" && blackSu2 == 0) {
            super2.setEnabled(true);
        }
        if (Player == "G" && blackSu3 == 0) {
            super3.setEnabled(true);
        }
        
        if (Player == "B" && greenSu1 == 0) {
            super1.setEnabled(true);
        }
        if (Player == "B" && greenSu2 == 0) {
            super2.setEnabled(true);
        }
        if (Player == "B" && greenSu3 == 0) {
            super3.setEnabled(true);
        }
    }
    
    public static void superColors() {
        
        if (Player == "G") {
            super1.setBackground(Color.green);
            super2.setBackground(Color.green);
            super3.setBackground(Color.green);
        }
        else {
            super1.setBackground(Color.black);
            super2.setBackground(Color.black);
            super3.setBackground(Color.black);
        }
    }
    

    public static void clearSupers() {                             
        if (Player == "G") {
            if (greenSu1 == 0)  super1.setEnabled(true);
            if (greenSu2 == 0)  super2.setEnabled(true);
            if (greenSu3 == 0)  super3.setEnabled(true);
        }
        if (Player == "B") {
            if (blackSu1 == 0)  super1.setEnabled(true);
            if (blackSu2 == 0)  super2.setEnabled(true);
            if (blackSu3 == 0)  super3.setEnabled(true);
        }
        selectOne = 0;
    }
}
