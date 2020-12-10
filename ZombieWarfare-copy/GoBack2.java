import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoBack2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoBack2 extends Buttons
{
    public GoBack2()
    {
        GreenfootImage goBack2 = new GreenfootImage(60,60);
        Font adjustedFont = new Font(true,false,25);
        goBack2.setFont(adjustedFont);
        goBack2.setColor(Color.BLACK);
        goBack2.drawString("Back",0,50);
        setImage(goBack2);
    }
    
    public void act() 
    {
        checkMouse();
        checkClick(new CreditWorld());
    }    
}