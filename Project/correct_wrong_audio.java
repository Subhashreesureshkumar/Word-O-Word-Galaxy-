/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author Team5
 */
import jaco.mp3.player.MP3Player;
import java.io.File;


public class correct_wrong_audio {

    /**
     * @param args the command line arguments
     */
    public  static final String correct="C:\\Users\\SUBHAHARINI\\Documents\\NetBeansProjects\\Word-O-Word Galaxy\\src\\Project\\correct.mp3";
    MP3Player m=new MP3Player(new File(correct));
    
    public  static final String wrong="C:\\Users\\SUBHAHARINI\\Documents\\NetBeansProjects\\Word-O-Word Galaxy\\src\\Project\\wrong.mp3";
    MP3Player n=new MP3Player(new File(wrong));
    
    public void correct_music()
    {
        m.play();
    }
    
    public void wrong_music()
    {
        n.play();
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

