import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    private GreenfootSound soundtrack = new GreenfootSound("Deal - AShamaluevMusic2.wav");
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GreenfootImage logo = new GreenfootImage("ZombieeeTitle2.png");
        Picture logoPic = new Picture(logo);
        addObject(logoPic,getWidth()/2,75);
        Start start = new Start();
        addObject(start,50,200);
        start.setLocation(420,190);
        Instructions instructions = new Instructions();
        addObject(instructions,50,300);
        instructions.setLocation(425,260);
        Credits credits = new Credits();
        addObject(credits,50,400);
        credits.setLocation(420,330);
        Authors authors = new Authors();
        addObject(authors,200,150);
        authors.setLocation(350,130);
        Vanier vanier = new Vanier();
        addObject(vanier,400,300);
        vanier.setLocation(100,330);
    }
    
    public void started()
    {
        soundtrack.play();   
    }
    
    public void stopped()
    {
        soundtrack.stop();
    }
}
