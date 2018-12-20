import greenfoot.*;  

/**
 * Write a description of class asd here.
 * 
 * @author Wellinton 
 * @version 14/05/2018
 */

public class Background extends Actor{
    
    private GreenfootImage image;
    private int speed;
    
    public Background(int speed){
        image = new GreenfootImage("cloud.png");
        setImage(image);
        this.speed = speed;
    }
    
    /**
     * Prototype Method 
     */
    
    public Background clone(){
        return new Background(this.speed);
    }
    
    /**
     * Method scroll in the Stage 
     */
    
    public void scroll(int speed){
        if(getX() < -getImage().getWidth() / 2){
            setLocation(getWorld().getWidth() + 250, getY());
        }
        setLocation(getX() + speed, getY());
    }
}
