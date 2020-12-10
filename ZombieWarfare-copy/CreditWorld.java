import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditWorld extends World
{
    /**
     * Constructor for objects of class CreditWorld.
     * 
     */
    public CreditWorld()
    {    
        super(600, 400, 1); 
        prepare();
    }

    public void prepare()
    {
        GreenfootImage credits = new GreenfootImage("HalfCredits.png");
        Picture creditsPic = new Picture(credits);
        addObject(creditsPic,getWidth()/2,200);
        GoBack goBack = new GoBack();
        addObject(goBack,32,350);
        goBack.setLocation(65,350);
        Next next = new Next();
        addObject(next,542,350);
        next.setLocation(530,350);
    }
}