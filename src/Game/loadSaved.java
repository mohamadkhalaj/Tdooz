package Game;

import static Game.Game.greenName;
import Score.netScore;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class loadSaved {
    public static String names[] = new String[100];
    public static String colors[] = new String[100];
    public static int scoress[] = new int[100];
    public static long time[] = new long[100];
    
    public static void load() {
        try {
            File file = new File("ScoresTable.txt");
  
            BufferedReader br = new BufferedReader(new FileReader(file)); 

            String st; 
            int counter = 0;
            while ((st = br.readLine()) != null) {
                
                names[counter] = st.split(", ")[0];
                
                if (counter %2 == 0)
                {
                    colors[counter] = "G";
                }
                else {
                    colors[counter] = "B";
                }
                
                scoress[counter] = Integer.valueOf(st.split(", ")[1]);
                
                time[counter] = Long.valueOf(st.split(", ")[2]);
                
                counter ++;
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        sort();
    }
    
    public static void sort() {
        
        
        for (int i = 0; i<99; i++) {
            boolean swapped = false;
            for (int j = 0; j<99; j++) {
                if (scoress[j] < scoress[j+1]) {
                    int temp = scoress[j];
                    scoress[j] = scoress[j+1];
                    scoress[j+1] = temp;
                    
                    long temp2 = time[j];
                    time[j] = time[j+1];
                    time[j+1] = temp2;
                    
                    String temp3 = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp3;
                    
                    String temp4 = colors[j];
                    colors[j] = colors[j+1];
                    colors[j+1] = temp4;
                    
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    
    public static void removeDuplicate() {
        
    }
}
