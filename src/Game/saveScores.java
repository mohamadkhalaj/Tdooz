package Game;

import Score.netScore;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static menu.getNameMenu.greenname;
import static menu.getNameMenu.blackname;

public class saveScores extends Game{
    public static void save() {
        try {
            File myfile = new File("ScoresTable.txt");
            if (!myfile.exists()) {
                myfile.createNewFile();
            }
            else {
                //System.out.println("File Updated.");
            }
            FileWriter file = new FileWriter("ScoresTable.txt", true);
            
            if (greenname == null) {
                file.write(greenName + ", " + netScore.greenScores + ", " + time +"\n");
                file.write(blackName + ", " + netScore.blackScores + ", " + time +"\n");
            }
            else {
                file.write(greenname + ", " + netScore.greenScores + ", " + time +"\n");
                file.write(blackname + ", " + netScore.blackScores + ", " + time +"\n");
            }
            
            System.out.println("Scores Saved");
            file.close();
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
