import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits1 extends Buttons
{
    public Credits1()
    {
        GreenfootImage myCredit = new GreenfootImage(145,60);
        Font adjustedFont = new Font(true,false,40);
        myCredit.setFont(adjustedFont);
        myCredit.setColor(Color.WHITE);
        myCredit.drawString("Credits",0,50);
        setImage(myCredit);
    }
    
    public void act() 
    {
        checkMouse();
        checkClick(new CreditWorld());
    } 
}
