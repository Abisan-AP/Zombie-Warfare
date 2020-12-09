import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackToMainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackToMainMenu extends Buttons
{
    public BackToMainMenu()
    {
        GreenfootImage mainmenuButton = new GreenfootImage(205,60);
        Font adjustedFont = new Font(true,false,40);
        mainmenuButton.setFont(adjustedFont);
        mainmenuButton.setColor(Color.WHITE);
        mainmenuButton.drawString("Main Menu",0,50);
        setImage(mainmenuButton);
    }
    
    public void act() 
    {
        checkMouse();
        checkClick(new TitleScreen());
    }   
}
