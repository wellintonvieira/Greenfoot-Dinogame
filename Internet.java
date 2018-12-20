import greenfoot.*; 

/**
 * Write a description of class asd here.
 * 
 * @author Wellinton 
 * @version 14/05/2018
 */

public class Internet extends Actor{
    
    private GreenfootImage image;
    
    public Internet(){
        image = new GreenfootImage("internet.png");
        setImage(image);
    }
    
    public void act(){
        gameOver();
    }
        
    public void gameOver(){
        World world = getWorld();
        Stage stage = (Stage) world;
        world.addObject(new GameOver(), world.getWidth() / 2, world.getHeight() / 2);
        world.removeObject(stage.getScoreBoard());
    }
}
