//import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    private int score;
    private int xCord = 125;
    private int yCord = 60;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
        score = 20;
        showScore();
    }
    
    public void addScore(int points)
    {
        score -= points;
        showScore();
        if (score == 10) {
            ZombieSpawner zombieSpawner2 = new ZombieSpawner();
            addObject(zombieSpawner2,123,10);
            zombieSpawner2.setLocation(127,25);
        }
        if (score == 0) {
           showText("You've survived Day1...", 300, 200);
           nextLevel();
        }
    }
    
    private void showScore()
    {
        showText("Zombies Left: " + score, 500, 50);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player =  new  Player();
        addObject(player, 86, 213);
        path(); 
        Tower tower = new Tower(1);
        addObject(tower,280,165);
        setPaintOrder(Player.class, Zombie.class, Bullet.class);
        ZombieSpawner zombieSpawner = new ZombieSpawner();
        addObject(zombieSpawner,123,10);
        zombieSpawner.setLocation(127,25);
    }

    private void path (){
        int time = 6;
        Go_Left goLeft = new Go_Left();
        addObject(goLeft, xCord, yCord);
        goLeft.turn(90);
        xCord+=35;
        for(;time>0; time-=2){
           for(int i = 0; i < time+1; i++){
               Go_Streight goStreight1 = new Go_Streight();
               addObject(goStreight1, xCord, yCord);
               xCord+=35;
               goStreight1.turn (90);
           }
           Go_Right goRight = new Go_Right();
           addObject(goRight, xCord, yCord);
           goRight.turn(180);
           for(int i = 0; i < time; i++){
               Go_Streight goStreight1 = new Go_Streight();
               yCord+=35;
               addObject(goStreight1, xCord, yCord);
           }
           Go_Right goRight1 = new Go_Right();
           yCord+=35;
           addObject(goRight1, xCord, yCord);
           goRight1.turn(270);
           for(int i = 0; i < time; i++){
               Go_Streight goStreight1 = new Go_Streight();
               xCord-=35;
               addObject(goStreight1, xCord, yCord);
               goStreight1.turn (90);
           }
           Go_Right goRight2 = new Go_Right();
           xCord-=35;
           addObject(goRight2, xCord, yCord);
           for(int i = 0; i < time-1; i++){
               Go_Streight goStreight1 = new Go_Streight();
               yCord-=35;
               addObject(goStreight1, xCord, yCord);
           }
           Go_Right goRight3 = new Go_Right();
           yCord-=35;
           addObject(goRight3, xCord, yCord);
           goRight3.turn(90);
           xCord+=35;
        }
    }
    
    private void nextLevel()
    {
        if(score == 0){
          showText("You are being transported to the next level...",300,300);
          World2 lvl2 = new World2();
          Greenfoot.delay(600);
          Greenfoot.setWorld(lvl2);
        }
    }
    
}
