import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Next here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next extends Buttons
{
    public Next()
    {
        GreenfootImage next = new GreenfootImage(60,50);
        Font adjustedFont = new Font(true,false,25);
        next.setFont(adjustedFont);
        next.setColor(Color.BLACK);
        next.drawString("Next",0,50);
        setImage(next);
    }
    /**
     * Act - do whatever the Next wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkMouse();
        checkClick(new CreditWorld2());
    }    
}
