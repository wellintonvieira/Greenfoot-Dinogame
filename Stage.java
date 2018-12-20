import greenfoot.*;  

/**
 * Write a description of class asd here.
 * 
 * @author Wellinton 
 * @version 14/05/2018
 */

public class Stage extends World{

    private GreenfootSound sound;
    private Background background;
    private Background backgroundClone;
    private Plan plan;
    private Plan planClone1;
    private Plan planClone2;
    private Plan planClone3;
    private Player player;
    private ScoreBoard score;
    private Actor enemy;
    private Internet internet;
    private int count;
    private int speedActor;
    private int speedScene;
    private int speedStage;

    /**
     * Construtor class
     */

    public Stage(){    
        super(900, 600, 1, false); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */

    private void prepare(){

        //setPaintOrder(Player.class, Internet.class);
        sound = new GreenfootSound("game.wav");

        speedStage = 0;
        speedActor = -5;
        speedScene = -3;

        // Prototype Method
        background = new Background(speedScene);
        backgroundClone = background.clone();

        // Prototype Method
        plan = new Plan(speedActor);
        planClone1 = plan.clone();
        planClone2 = plan.clone();
        planClone3 = plan.clone();

        score = new ScoreBoard();
        internet = new Internet();

        //Singleton Method
        player = Player.getInstance();

        addObject(background, getWidth() / 2, 100); 
        addObject(backgroundClone, getWidth() + getWidth() / 2, 200);

        addObject(planClone1, getWidth() / 2, 545); 
        addObject(planClone2, getWidth() + getWidth() / 2, 545);
        addObject(planClone3, getWidth() + getWidth() + getWidth() / 2, 545);

        addObject(player, 130, 430);
        addObject(score, 100, 30);

        count = 0;

        sound.playLoop();
    }

     /**
     * Random Enemy in the World Stage
     */

    public void randomEnemy(){

        int random = Greenfoot.getRandomNumber(4);

        if(random == 1){
            enemy = FactoryEnemyCactusOne.createActor(speedActor);
            addObject(enemy, 900, 420);
        }else if(random == 2){
            enemy = FactoryEnemyCactusTwo.createActor(speedActor);
            addObject(enemy, 900, 420);
        }else if(random == 3){
            enemy = FactoryEnemyBird.createActor(speedActor);
            int birdPosition = Greenfoot.getRandomNumber(2);

            if(birdPosition == 1){
                addObject(enemy, 900, 420);
            }else{
                addObject(enemy, 900, 290);
            }
        }else{
            enemy = FactoryEnemyCactusThree.createActor(speedActor);
            addObject(enemy, 900, 420);
        }
    }

    public ScoreBoard getScoreBoard(){
        return score;
    }

    /**
     * Action
     */

    public void act(){
        
        background.scroll(speedScene);
        backgroundClone.scroll(speedScene);

        planClone1.scroll(speedScene);
        planClone2.scroll(speedScene);
        planClone3.scroll(speedScene);

        count++;
        speedStage++;

        if(count % 210 == 0){
            randomEnemy();
        }

        if(count % 530 == 0){
            randomEnemy();
        }

        if(speedStage % 1000 == 0){
            speedActor -= 1;
            speedScene -= 1;
            count = 0;
        }
        
        if(score.getScore() == 1000){
            GreenfootImage image = new GreenfootImage("background2.png");
            setBackground(image);
        }
        
        if(score.getScore() == 3000){
            addObject(internet, getWidth() / 2, getHeight() /2);
        }
    }
}
