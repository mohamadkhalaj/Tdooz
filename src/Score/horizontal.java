package Score;
import static GUI.GUI.Buttons;

public class horizontal extends Score{
    @Override
    public int[] getScore() {
        
        int bScore = 0;
        int gScore = 0;

        int bscorePerRow = 0;
        int gscorePerRow = 0;

        for (int row = 0; row < 8; row++) {
                for (int start = 0; start<=4; start++) {
                    if ((Buttons[(row * 8)+ start].getBackground() == Buttons[(row * 8)+ start + 1].getBackground())) {
                        if ((Buttons[(row * 8)+ start + 1].getBackground() == Buttons[(row * 8)+ start + 2].getBackground())) {
                            if ((Buttons[(row * 8)+ start + 2].getBackground() == Buttons[(row * 8)+ start + 3].getBackground())) {

                                if (Buttons[(row * 8)+ start + 2].getBackground().getGreen() == 255) {
                                    gscorePerRow ++;
                                }
                                if (Buttons[(row * 8)+ start + 2].getBackground().getGreen() == 0){
                                    bscorePerRow ++;
                                } 
                            }
                        }
                    }
                }
                
                int fullRow = 0;
                for (int i = 0; i<8; i++) {

                    if (Buttons[(row * 8) + i].getBackground().getGreen() == 255) {
                        fullRow ++;
                    }
                    if (fullRow == 8) gScore ++;   
                }
                fullRow = 0;
                for (int i = 0; i<8; i++) {
                    if (Buttons[(row * 8) + i].getBackground().getGreen() == 0) {
                        fullRow ++;
                    }
                    if (fullRow == 8) bScore ++;
                }
                if (bscorePerRow >= 1) bScore ++;
                if (gscorePerRow >= 1) gScore ++;
                gscorePerRow = 0;
                bscorePerRow = 0;
        }
        int saver[] = new int[2];
        saver[0] = gScore;
        saver[1] = bScore;
        return saver;
    }
}
