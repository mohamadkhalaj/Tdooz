package Game;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import menu.StartTypeMenu;

public class save {
    public static void saveG() {
        try{              
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Position.txt"), "UTF8"));
            for(int g = 0 ; g<64 ; g++){
                String color = "";
                if(StartTypeMenu.NewGame.Buttons[g].getBackground() == Color.green) {color = "Green";}
                else if (StartTypeMenu.NewGame.Buttons[g].getBackground() == Color.black) {color = "Black";}
                bw.write(String.valueOf(g) + "," + color + "," + StartTypeMenu.NewGame.Buttons[g].getText());
                bw.newLine();
            }
        }
        catch(Exception e){System.out.println(e);}
    }
}
