import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditWorld2 extends World
{
    /**
     * Constructor for objects of class CreditWorld2.
     * 
     */
    public CreditWorld2()
    {    
        super(600, 400, 1); 
        prepare();
    }

    private void prepare()
    {
        GreenfootImage credits2 = new GreenfootImage("FullCredits.png");
        Picture creditsPic2 = new Picture(credits2);
        addObject(creditsPic2,getWidth()/2,200);
        GoBack2 goBack2 = new GoBack2();
        addObject(goBack2,77,360);
        goBack2.setLocation(74,362);
        goBack2.setLocation(70,350);
    }
}
