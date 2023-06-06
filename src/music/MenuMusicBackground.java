package music;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class MenuMusicBackground {
    public static Clip clip; 
    public static void playMusic(String musicLocation, int lop){
        try{
            File musicPath = new File(musicLocation);
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                try {
                    clip.close();
                } catch (Exception e) {}
                
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.loop(lop);
                clip.start();
            }
            else
            {
                System.out.println("Cant find main menu music file");
            }
        }
        
        catch(Exception Ex){
            Ex.printStackTrace();
        }
    }
    public static void stopMusic() {
        try {
            clip.close();
        } catch (Exception Ex){
            
        }
    }
}
