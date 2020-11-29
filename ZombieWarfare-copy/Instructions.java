import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Buttons
{
    public Instructions()
    {
        GreenfootImage myIntro = new GreenfootImage(235,60);
        Font adjustedFont = new Font(true,false,40);
        myIntro.setFont(adjustedFont);
        myIntro.setColor(Color.BLACK);
        myIntro.drawString("Instructions",0,50);
        setImage(myIntro);
    }
    
    public void act() 
    {
        checkMouse();
        checkClick(new InstructionWorld());
    }    
}
