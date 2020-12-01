//import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    private int score;
    private int xCord = 160;
    private int yCord = 60;
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
           nextLevel();
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
        path(); 
        for(int i = 0; i<100; i++){
            Zombie zombie =  new  Zombie();
            addObject(zombie, 125,60);
        }
        Tower tower = new Tower();
        addObject(tower,280,165);
    }
    private void path (){
        int time = 6;
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
        if(score == 8){
          showText("You are being transported to the next level...",400,300);
          World2 lvl2 = new World2();
          Greenfoot.delay(600);
          Greenfoot.setWorld(lvl2);
        }
    }
}
