package Score;
import static GUI.GUI.Buttons;
        
public class vertical extends Score{
    @Override
    public int[] getScore() {
        
        int bScore = 0;
        int gScore = 0;
        
        int gscorePerCol = 0;
        int bscorePerCol = 0;
        
        for (int col = 0 ; col < 8; col ++) {
            for (int row = 0; row <= 4; row ++){
                if ((Buttons[col + (row * 8)].getBackground() == Buttons[col + (row * 8) + 8].getBackground())) {
                    if ((Buttons[col + (row * 8) + 8].getBackground() == Buttons[col + (row * 8) + 16].getBackground())) {
                        if ((Buttons[col + (row * 8) + 16].getBackground() == Buttons[col + (row * 8) + 24].getBackground())) {

                            if (Buttons[col + (row * 8) + 16].getBackground().getGreen() == 255) {
                                gscorePerCol ++;
                            }
                            if (Buttons[col + (row * 8) + 16].getBackground().getGreen() == 0){
                                bscorePerCol ++;
                            } 
                        }
                    }
                }
            }
                
            int fullCol = 0;
            for (int i = 0; i<8; i++) {
                
                if (Buttons[col + (i * 8)].getBackground().getGreen() == 255) {
                    fullCol ++;
                }
                if (fullCol == 8) gScore ++;   
            }
            fullCol = 0;
            for (int i = 0; i<8; i++) {
                if (Buttons[col + (i * 8)].getBackground().getGreen() == 0) {
                    fullCol ++;
                }
                if (fullCol == 8) bScore ++;
            }
            if (bscorePerCol >= 1) bScore ++;
            if (gscorePerCol >= 1) gScore ++;
            gscorePerCol = 0;
            bscorePerCol = 0;
        }
        int saver[] = new int[2];
        saver[0] = gScore;
        saver[1] = bScore;
        return saver;
    }
}
