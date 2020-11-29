import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends Buttons
{
    public Credits()
    {
        GreenfootImage myCredit = new GreenfootImage(145,60);
        Font adjustedFont = new Font(true,false,40);
        myCredit.setFont(adjustedFont);
        myCredit.setColor(Color.BLACK);
        myCredit.drawString("Credits",0,50);
        setImage(myCredit);
    }
    
    public void act() 
    {
        checkMouse();
        checkClick(new CreditWorld());
    }    
}
