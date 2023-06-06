package Score;

import Game.Game;

public class netScore extends Game{
    public static int greenScores = 0;
    public static int blackScores = 0;
    public void get(){

        Score netscore[] = new Score[5];

        netscore[0] = new Diagonal_LTR();
        netscore[1] = new Diagonal_RTL();
        netscore[2] = new horizontal();
        netscore[3] = new square();
        netscore[4] = new vertical();

        int gScore = 0;
        int bScore = 0;

        for (Score item:netscore) {
            gScore += item.getScore()[0];
            bScore += item.getScore()[1];
        }
        
        blackScores = bScore;
        greenScores = gScore;
        
        greenScore.setText(Integer.toString(gScore));
        blackScore.setText(Integer.toString(bScore));
    }
}
