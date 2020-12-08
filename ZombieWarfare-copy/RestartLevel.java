    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
/**
 * Write a description of class RestartLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestartLevel extends Buttons
{
    public RestartLevel()
    {
        GreenfootImage restartLevelButton = new GreenfootImage(250,60);
        Font adjustedFont = new Font(true,false,40);
        restartLevelButton.setFont(adjustedFont);
        restartLevelButton.setColor(Color.WHITE);
        restartLevelButton.drawString("Restart Level",0,50);
        setImage(restartLevelButton);
    }
    
    public void act() 
    {
        checkMouse();
        checkClick(new MyWorld());
    }    
}

