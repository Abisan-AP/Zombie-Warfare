import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Buttons
{
    public Start()
    {
        GreenfootImage startButton = new GreenfootImage(100,60);
        Font adjustedFont = new Font(true,false,40);
        startButton.setFont(adjustedFont);
        startButton.setColor(Color.BLACK);
        startButton.drawString("Start",0,50);
        setImage(startButton);
    }
    
    public void act() 
    {
        checkMouse();
        checkClick(new MyWorld());
    }    
}
