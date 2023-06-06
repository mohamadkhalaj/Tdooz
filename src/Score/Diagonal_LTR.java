package Score;
import static GUI.GUI.Buttons;

public class Diagonal_LTR extends Score{
    @Override
    public int[] getScore() {
        
        int bScore = 0;
        int gScore = 0;
        
         for (int col = 0; col <= 4; col ++) {
            for (int row = 0; row <= 4; row ++) {
                if (Buttons[col + (row * 8)].getBackground() == Buttons[col + (row * 8) + 9].getBackground()) {
                    if (Buttons[col + (row * 8) + 9].getBackground() == Buttons[col + (row * 8) + 18].getBackground()) {
                        if (Buttons[col + (row * 8) + 18].getBackground() == Buttons[col + (row * 8) + 27].getBackground()) {
                                if (Buttons[col + (row * 8) + 18].getBackground().getGreen() == 255) {
                                    gScore ++;
                                }

                                if (Buttons[col + (row * 8) + 18].getBackground().getGreen() == 0) {
                                    bScore ++;
                                }
                        }
                    }
                }
            }
                   
               
           int counter = 0;
           boolean dontIncrement = false;
           for (int i = 0; i < (8 - col); i ++) {
               if (Buttons[col + (i * 8) + i].getBackground().getGreen() == 255) {
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
           for (int i = 0; i < (8 - col) - 1; i ++) {
               if (Buttons[(col + 1)*8 + i*8 + i].getBackground().getGreen() == 255) {
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
           for (int i = 0; i < (8 - col); i ++) {
               if (Buttons[col + (i * 8) + i].getBackground().getGreen() == 0) {
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
           for (int i = 0; i < (8 - col) - 1; i ++) {
               if (Buttons[(col + 1)*8 + i*8 + i].getBackground().getGreen() == 0) {
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
