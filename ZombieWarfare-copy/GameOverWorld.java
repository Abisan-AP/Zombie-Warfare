import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{
    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    public GameOverWorld()
    {    
        super(600, 400, 1); 
        prepare();
    }

    public void prepare()
    {
        GreenfootImage gameover = new GreenfootImage("Youdied.png");
        Picture gameoverPic = new Picture(gameover);
        addObject(gameoverPic,getWidth()/2,150);
        BackToMainMenu backToMainMenu = new BackToMainMenu();
        addObject(backToMainMenu,150,300);
        backToMainMenu.setLocation(150,275);
        RestartLevel restartLevel = new RestartLevel();
        addObject(restartLevel,430,300);
        restartLevel.setLocation(430,275);
        Exit exit = new Exit();
        addObject(exit,300,375);
        exit.setLocation(280,345);
    }
}
