package Game;

import static GUI.GUI.Buttons;
import static Game.Game.draw;
import Score.netScore;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;

public class drawGame extends Game{
    public static void drawGameToFile() {
        try {
            File myfile = new File("MatrixTable.txt");
            if (!myfile.exists()) {
                myfile.createNewFile();
            }
            else {
                System.out.println("File Updated.");
            }
            FileWriter file = new FileWriter("MatrixTable.txt", true);
            int counter = 0;
            for (JButton jb:Buttons) {
                if (jb.getBackground() == Color.GREEN) {
                    if (jb.getText() == "O") {
                        file.write("G");
                    }
                    else {
                        file.write("G" + String.valueOf(jb.getText()));
                    }
                    file.write("\t");
                    counter ++;
                }
                else {
                    if (jb.getText() == "O") {
                        file.write("B");
                    }
                    else {
                        file.write("B" + String.valueOf(jb.getText()));
                    }
                    file.write("\t");
                    counter ++;
                }
                if (counter == 8) {
                    file.write("\n");
                    counter = 0;                
                }
            }
            file.write("Green: " + netScore.greenScores + ", Black: " + netScore.blackScores + "\n");
            if (netScore.greenScores > netScore.blackScores) {
                file.write("Green Wone!");
            }
            else if(netScore.greenScores < netScore.blackScores) {
                file.write("Black Wone!");
            }
            else {
                file.write("Equal!");
            }
            file.write("\n----------------------------------------------------------" + "\n");
            draw = 1;
            file.close();
            System.out.println("Successfully Wrote!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
