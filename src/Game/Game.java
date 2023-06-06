package Game;

import java.io.File;
import java.io.FileWriter; 
import java.io.IOException;
import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import static menu.getNameMenu.greenname;
import static menu.getNameMenu.blackname;
import static GUI.GUI.Buttons;
import static Game.FlagForContinue.PN;
import static Game.saveScores.save;
import java.time.Duration;
import java.time.Instant;
import Game.drawGame;
import Score.netScore;
import menu.StartTypeMenu;
import menu.blackWin;
import menu.draw;
import menu.greenWins;

public class Game {
    
    public static String greenName = greenname;
    public static String blackName = blackname;
    
    public static Instant StartTime;
    public static Instant StopTime;
    public static long time;
    
    protected static String Player;
    
    protected static int blackSu1 = 0;
    protected static int blackSu2 = 0;
    protected static int blackSu3 = 0;
    
    public static int blackDiff = 0;
    public static int greenDiff = 0;
    
    protected static int draw = 0;
    
    protected static int greenSu1 = 0;
    protected static int greenSu2 = 0;
    protected static int greenSu3 = 0;
    
    protected static int selectOne = 0;
    protected static int greenOrBtns = 0;
    protected static int blackOrBtns = 0;
    
    protected static int greenSupBtns = 0;
    protected static int blackSupBtns = 0;
    
    protected static javax.swing.JButton super1;
    protected static javax.swing.JButton super2;
    protected static javax.swing.JButton super3;
    
    protected static javax.swing.JLabel prompt;
    protected static javax.swing.JButton status;
    
    protected static javax.swing.JLabel greenScore;
    protected static javax.swing.JLabel blackScore;
    
    public void setVars(JButton super1, JButton super2, JButton super3, JLabel prompt, JButton status, JLabel greenScore, JLabel blackScore) {
        this.super1 = super1;
        this.super2 = super2;
        this.super3 = super3;
        
        this.prompt = prompt;
        this.status = status;
        
        this.greenScore = greenScore;
        this.blackScore = blackScore;
        
    }
    
    public static String whoIsPlaying() {
        return Player;
    }
   
    public static void setPlayer(String p) {
        Player = p;
    }
    
    public String getPlayer() {
        StartTime = Instant.now();
        
        if (PN == null) {
            System.out.println("random");
            Random rn = new Random();
            boolean rand = rn.nextBoolean();
            if (rand) {
                this.Player = "G";
                return "G";
            }
            else {
                this.Player = "B";
                return "B";
            }
        }
        else {
            System.out.println("getName");
            return PN;
        }
    }
    
    public static boolean isEnd() {
        boolean end = true;
        for (JButton jb:Buttons) {
            if(jb.getText().isEmpty()) {
                end = false;
            }
        }
        if (end && draw == 0) {
            StopTime = Instant.now();
            Duration timeElapsed = Duration.between(StartTime, StopTime);
            time = timeElapsed.toMillis()/1000;
            System.out.println(time);
            PN = null;
            drawGame.drawGameToFile();
            save();
        }
        return end;
    }
    
    
    public void resetGame() {
        selectOne = 0;
        Player = this.getPlayer();
        greenOrBtns = 0;
        blackOrBtns = 0;
        
        blackSu1 = 0;
        blackSu2 = 0;
        blackSu3 = 0;
        
        draw = 0;
        greenDiff = 0;
        blackDiff = 0;
        
        greenSu1 = 0;
        greenSu2 = 0;
        greenSu3 = 0;
        
        greenScore.setText("0");
        blackScore.setText("0");
  
        for (JButton jb:Buttons) {
            jb.setText("");
            jb.setBackground(new java.awt.Color(204, 204, 204));
        }
        getStatus();
        prompt.setText("");
    }
    
    
    public void getStatus() {
        if (Player == "B") {
            status.setText("Black round");
            status.setBackground(Color.black);
        }
        else {
            status.setText("Green round");
            status.setBackground(Color.green);
        }
		if (Game.isEnd()) {
            int gscore = Integer.valueOf(greenScore.getText());
            int bscore = Integer.valueOf(blackScore.getText());
            
            if (gscore > bscore) {
                greenWins green = new greenWins();
                this.resetGame();
                StartTypeMenu.NewGame.setVisible(false);
            }
            else if (bscore > gscore) {
                blackWin black = new blackWin();
                this.resetGame();
                StartTypeMenu.NewGame.setVisible(false);
            }
            else {
                draw draw = new draw();
                this.resetGame();
                StartTypeMenu.NewGame.setVisible(false);
            }
        }
    }
    public static void clearSupers() {    
        if (Player == "G") {
            if (greenSu1 == 0)  super1.setEnabled(true);
            else super1.setEnabled(false);
            if (greenSu2 == 0)  super2.setEnabled(true);
            else super2.setEnabled(false);
            if (greenSu3 == 0)  super3.setEnabled(true);
            else super3.setEnabled(false);
        }
        if (Player == "B") {
            if (blackSu1 == 0)  super1.setEnabled(true);
            else super1.setEnabled(false);
            if (blackSu2 == 0)  super2.setEnabled(true);
            else super2.setEnabled(false);
            if (blackSu3 == 0)  super3.setEnabled(true);
            else super3.setEnabled(false);
        }
        selectOne = 0;
    }
}
