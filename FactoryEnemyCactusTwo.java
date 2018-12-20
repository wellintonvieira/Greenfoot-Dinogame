import greenfoot.*;  

/**
 * Write a description of class asd here.
 * 
 * @author Wellinton 
 * @version 14/05/2018
 */

public class FactoryEnemyCactusTwo{
    
    /**
     * Abstract Method
     */
    
    public static Actor createActor(int speed){
        return new EnemyCactusTwo(speed);
    }
}