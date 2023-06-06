package Score;
import static GUI.GUI.Buttons;

public class Diagonal_RTL extends Score {
    @Override
    public int[] getScore() {
        int bScore = 0;
        int gScore = 0;
        for (int col = 0; col <= 4; col ++) {
           for (int row = 7; row >= 3; row --) {
               if (Buttons[col + (row * 8)].getBackground() == Buttons[col + (row * 8) - 7].getBackground()) {
                   if (Buttons[col + (row * 8) - 7].getBackground() == Buttons[col + (row * 8) - 14].getBackground()) {
                       if (Buttons[col + (row * 8) - 14].getBackground() == Buttons[col + (row * 8) - 21].getBackground()) {
                            if (Buttons[col + (row * 8) - 14].getBackground().getGreen() == 255) {
                                gScore ++;
                            }

                            if (Buttons[col + (row * 8) - 14].getBackground().getGreen() == 0) {
                                bScore ++;
                            }
                       }
                   }
               }
           }
           
           int counter = 0;
           boolean dontIncrement = false;
           for (int i = 7; i > (col) - 1; i --) {
               if (Buttons[(i * 8) + (7 - i) + col].getBackground().getGreen() == 255) {
                   if (!dontIncrement) 
                   counter ++;
               }
               else {
                   if (counter < 4) counter = 0;
                   else dontIncrement = true;
               }
           }
           if (counter == 8) {
                   gScore -= (3 - col);
           }
           else if (counter > 4){
                gScore -= (counter - 4);
           }
           
           counter = 0;
           dontIncrement = false;
           for (int i = 7; i > (col); i --) {
               if (Buttons[(48 - (8 * col)) - (7 - i) * 7].getBackground().getGreen() == 255) {
                   if (!dontIncrement) 
                   counter ++;
               }
               else {
                   if (counter < 4) counter = 0;
                   else dontIncrement = true;
               }
           }
           if (counter > 4){
                gScore -= (counter - 4);
           }
           
           counter = 0;
           dontIncrement = false;
           for (int i = 7; i > (col) - 1; i --) {
               if (Buttons[(i * 8) + (7 - i) + col].getBackground().getGreen() == 0) {
                   if (!dontIncrement) 
                   counter ++;
               }
               else {
                   if (counter < 4) counter = 0;
                   else dontIncrement = true;
               }
           }
           if (counter == 8) {
                   bScore -= (3 - col);
           }
           else if (counter > 4){
                bScore -= (counter - 4);
           }
           
           counter = 0;
           dontIncrement = false;
           for (int i = 7; i > (col); i --) {
               if (Buttons[(48 - (8 * col)) - (7 - i) * 7].getBackground().getGreen() == 0) {
                   if (!dontIncrement) 
                   counter ++;
               }
               else {
                   if (counter < 4) counter = 0;
                   else dontIncrement = true;
               }
           }
           if (counter > 4){
                bScore -= (counter - 4);
           } 
       }
       int saver[] = new int[2];
       saver[0] = gScore;
       saver[1] = bScore;
       return saver;
    }
}
