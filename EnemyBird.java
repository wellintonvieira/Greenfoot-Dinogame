import greenfoot.*; 

/**
 * Write a description of class asd here.
 * 
 * @author Wellinton 
 * @version 14/05/2018
 */

public class EnemyBird extends Actor{

    private GifImage image;
    private int speed;
    
    public EnemyBird(int speed){
        image = new GifImage("bird.gif");
        this.speed = speed;
    }
    
    public void act(){
        setImage(image.getCurrentImage());
        setLocation(getX() + speed, getY());
        gameOver();
    }
    
    public void gameOver(){
        Actor player = getOneObjectAtOffset(0,0, Player.class);
        if(player != null){
            World world = getWorld();
            Stage stage = (Stage) world;
            world.addObject(new GameOver(), world.getWidth() / 2, world.getHeight() / 2);
            world.removeObject(stage.getScoreBoard());
        }
    }
}
