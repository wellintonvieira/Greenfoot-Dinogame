import greenfoot.*;  

/**
 * Write a description of class asd here.
 * 
 * @author Wellinton 
 * @version 14/05/2018
 */

public class FactoryEnemyCactusOne{
    
    /**
     * Abstract Method
     */
    
    public static Actor createActor(int speed){
        return new EnemyCactusOne(speed);
    }
}