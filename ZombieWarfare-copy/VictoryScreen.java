import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VictoryScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VictoryScreen extends World
{
    /**
     * Constructor for objects of class VictoryScreen.
     * 
     */
    public VictoryScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void prepare()
    {
        GreenfootImage victory = new GreenfootImage("VictoryGG.png");
        Picture victoryPic = new Picture(victory);
        addObject(victoryPic,getWidth()/2,150);
        BackToMainMenu backToMainMenu = new BackToMainMenu();
        addObject(backToMainMenu,130,319);
        backToMainMenu.setLocation(156,328);
        Credits1 credits1 = new Credits1();
        addObject(credits1,450,300);
        credits1.setLocation(320,320);
        backToMainMenu.setLocation(160,320);
        credits1.setLocation(435,320);
    }
}
