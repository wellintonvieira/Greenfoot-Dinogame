import greenfoot.*;  

/**
 * Write a description of class asd here.
 * 
 * @author Wellinton 
 * @version 14/05/2018
 */

public class Plan extends Actor{
    
    private GreenfootImage image;
    private int speed;
    
    public Plan(int speed){
        image = new GreenfootImage("plan.png");
        setImage(image);
        this.speed = speed;
    }
    
    /**
     * Prototype Method 
     */
    
    public Plan clone(){
        return new Plan(this.speed);
    }
    
    /**
     * Method scroll in the Stage 
     */
    
    public void scroll(int speed){
        if(getX() < -getImage().getWidth() / 2){
            setLocation(getWorld().getWidth() + 295, getY());
        }
        setLocation(getX() + speed, getY());
    }
}