import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoBack extends Buttons
{
    public GoBack()
    {
        GreenfootImage goBack = new GreenfootImage(85,60);
        Font adjustedFont = new Font(true,false,25);
        goBack.setFont(adjustedFont);
        goBack.setColor(Color.BLACK);
        goBack.drawString("Return",0,50);
        setImage(goBack);
    }
    
    public void act() 
    {
        checkMouse();
        checkClick(new TitleScreen());
    }    
}
