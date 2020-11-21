import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    private int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        score = 0;
        prepare();
    }
    
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if (score > 8) {
            Greenfoot.stop();
        }
    }
    
    private void showScore()
    {
        showText("Score: " + score, 550, 100);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player =  new  Player();
        addObject(player, 86, 213);
        for(int i = 0; i<10; i++){
            Banana banana =  new  Banana();
            addObject(banana, Greenfoot.getRandomNumber(550)+25, Greenfoot.getRandomNumber(100)+275);
        }
        Tower tower = new Tower();
        addObject(tower,305,48);
    }
}
