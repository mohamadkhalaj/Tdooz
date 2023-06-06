package Score;
import static GUI.GUI.Buttons;

public class square extends Score{
    @Override
    public int[] getScore() {
        
        int bScore = 0;
        int gScore = 0;
        
        for (int col = 0; col <= 4; col++) {
            for (int row = 0; row <= 4; row ++) {
                if (Buttons[col + (row * 8)].getBackground() == Buttons[col + 3 + (row * 8)].getBackground()) {
                    if (Buttons[col + 3 + (row * 8)].getBackground() == Buttons[(row + 3) * 8 + col].getBackground()) {
                        if (Buttons[(row + 3) * 8 + col].getBackground() == Buttons[(row + 3) * 8 + col + 3].getBackground()) {

                            if (Buttons[(row + 3) * 8 + col].getBackground().getGreen() == 255) {

                                gScore ++;

                            }

                            if (Buttons[(row + 3) * 8 + col].getBackground().getGreen() == 0) {

                                bScore ++;

                            }
                        }
                    }
                }
            }
        }
                
        int saver[] = new int[2];
        saver[0] = gScore;
        saver[1] = bScore;
        return saver;
    }
}
