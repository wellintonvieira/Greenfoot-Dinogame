import greenfoot.*; 

/**
 * Write a description of class asd here.
 * 
 * @author Wellinton 
 * @version 14/05/2018
 */

public class GameOver extends Actor{

    private GifImage image;
    
    public GameOver(){
        image = new GifImage("gameover.png");
    }  
    
    public void act(){
        Greenfoot.playSound("gameover.wav");
        Greenfoot.stop();
    }
}
