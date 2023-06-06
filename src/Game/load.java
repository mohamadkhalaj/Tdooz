package Game;

import Cells.SuperBtns;
import GUI.GUI;
import static Game.Game.greenSu3;
import static Game.Game.selectOne;
import Score.netScore;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import static Game.FlagForContinue.PN;

public class load {
    public static void continue_game(GUI NewGame) {
    String currentLine;
            try {
                
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Position.txt"), "UTF8"));
            int counter = 0;
            while ((currentLine = br.readLine()) != null) {
                
                if (counter == 64) {
                    Game.greenName = currentLine.split(",")[0];
                    Game.blackName = currentLine.split(",")[1];
                    PN = currentLine.split(",")[2];
                }
                else if (counter == 65) {
                    System.out.println(currentLine);
                    int gB = Integer.valueOf(currentLine.split(",")[0]);
                    int bB = Integer.valueOf(currentLine.split(",")[1]);
                    
                    if (gB > 0) { 
                        Game.greenOrBtns -= gB;
                        Game.blackOrBtns -= bB;
                    }
                    else if (bB > 0) {
                        Game.blackOrBtns -= bB;
                        Game.greenOrBtns += bB;
                    }
                }
                else {
                    String[] fields = currentLine.split("\n", -1);
                    String[] S = fields[0].split(",",-1);
                    int i = Integer.valueOf(S[0]);
                    switch (S[1]) {
                        case "Green":
                            NewGame.Buttons[i].setBackground(Color.green);
                            if (S[2].charAt(0) == '$' || S[2].charAt(0) == '*' || S[2].charAt(0) == '%') { 
                                if (S[2].charAt(0) == '$') {
                                    Game.greenSu2 = 1;
                                    NewGame.Buttons[i].setText("$");
                                }
                                if (S[2].charAt(0) == '*') {
                                    Game.greenSu3 = 1;
                                    NewGame.Buttons[i].setText("*");
                                }
                                if (S[2].charAt(0) == '%') {
                                    Game.greenSu1 = 1;
                                    NewGame.Buttons[i].setText("%");
                                }
                                NewGame.Buttons[i].setForeground(Color.white);
                            }
                            else {
                                Game.greenOrBtns ++;
                                NewGame.Buttons[i].setText("O");
                                NewGame.Buttons[i].setForeground(Color.green);
                            }
                            break;
                        case "Black":
                            NewGame.Buttons[i].setBackground(Color.black);
                            if (S[2].charAt(0) == '$' || S[2].charAt(0) == '*' || S[2].charAt(0) == '%') { 
                                if (S[2].charAt(0) == '$') {
                                    Game.blackSu2 = 1;
                                    NewGame.Buttons[i].setText("$");
                                }
                                if (S[2].charAt(0) == '*') {
                                    Game.blackSu3 = 1;
                                    NewGame.Buttons[i].setText("*");
                                }
                                if (S[2].charAt(0) == '%') {
                                    Game.blackSu1 = 1;
                                    NewGame.Buttons[i].setText("%");
                                }
                                NewGame.Buttons[i].setForeground(Color.white);
                            }
                            else {
                                Game.blackOrBtns ++;
                                NewGame.Buttons[i].setText("O");
                                NewGame.Buttons[i].setForeground(Color.black);
                            }
                            break;
                    }
                }
                counter++;
            }
            
            br.close();
        } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Loading Error!");
          }
          finally {
                netScore scr = new netScore();
                scr.get();
                SuperBtns.superColors();
                Game.clearSupers();
                selectOne = 0; 
          }
    }
    public static void getName() {
        String currentLine;
        try {
                
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Position.txt"), "UTF8"));
            int counter = 0;
            while ((currentLine = br.readLine()) != null) {

                if (counter == 64) {
                    char c = currentLine.split(",")[2].charAt(0);
                    if (c == 'G')
                        PN = "G";
                    else
                        PN = "B";
                }
                counter ++;
            }
            br.close();
        } 
        catch (Exception e) {
                e.printStackTrace();
                System.out.println("getName Error!");
        }
    }
}
