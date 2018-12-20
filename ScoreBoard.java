import greenfoot.*; 

/**
 * Write a description of class asd here.
 * 
 * @author Wellinton 
 * @version 14/05/2018
 */

public class ScoreBoard extends Actor{
    
    private ScoreBoard score;
    private int count;
    private int sum;
    
    public ScoreBoard(){
        count = 0;
        sum = 0;
        setImage(new GreenfootImage("Pontos: "+sum, 30, Color.WHITE, Color.BLACK));
    }
    
    public void act(){
        count++;
        if(count == 5){
            sum++;
            count = 0;
        }
        setImage(new GreenfootImage("Pontos: "+sum, 30, Color.WHITE, Color.BLACK));
    }
    
    public int getScore(){
        return sum;
    }
}
