import greenfoot.*; 

/**
 * Write a description of class asd here.
 * 
 * @author Wellinton 
 * @version 14/05/2018
 */

public class Player extends Actor{
    
    private static Player player;
    private GifImage image;
    private int speed;
    private int time;
    
    public Player(){
        image = new GifImage("dino.gif");
    }
    
    /**
     * Singleton Method
     */
    
    public static Player getInstance(){
        if(player == null){
            player = new Player();
        }
        return player;
    }
    
    /**
     * Action Actor with space
     * Copyright for an anonymous user 
     * of the greenfoot discussion forum
     * 
     */
    
    public void act(){
        
        int groundLevel = 430;
        
        boolean onGround = (getY() == groundLevel);
        if(!onGround){
            if(speed == 0 && time > 0) time--; 
                if(speed == 0 && time > 0) return;
                    speed++; 
                    setLocation(getX(), getY() + speed);
        if(getY() >= groundLevel){
                setLocation(getX(), groundLevel);
                Greenfoot.getKey(); 
            }
        }else{
            if("space".equals(Greenfoot.getKey())){
                Greenfoot.playSound("jump.wav");
                GreenfootImage imageSpace = image.getCurrentImage();
                setImage(imageSpace);
                speed = -18; 
                setLocation(getX(), getY()+speed); 
                time = 35;  
            }
        }
        setImage(image.getCurrentImage());
    }
}
