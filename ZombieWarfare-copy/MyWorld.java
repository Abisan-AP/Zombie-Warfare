import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    private int score;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
        score = 0;
        showScore();
    }
    
    public void addScore(int points)
    {
       score = score + points;
       showScore();
       if (score > 7) {
           showText("YOU WIN!!!", 300, 200);
           Greenfoot.stop();
        }
    }
    
    private void showScore()
    {
        showText("Score: " + score, 550, 50);
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
            Zombie zombie =  new  Zombie();
            addObject(zombie, Greenfoot.getRandomNumber(550)+25, Greenfoot.getRandomNumber(100)+275);
        }
        Tower tower = new Tower();
        addObject(tower,305,48);
    }
}
