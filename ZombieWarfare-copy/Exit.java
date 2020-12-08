import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Buttons
{
    private GreenfootSound soundtrack = new GreenfootSound("Deal - AShamaluevMusic2.wav");
    public Exit()
    {
        GreenfootImage exitButton = new GreenfootImage(150,60);
        Font adjustedFont = new Font(true,false,40);
        exitButton.setFont(adjustedFont);
        exitButton.setColor(Color.RED);
        exitButton.drawString("Give Up",0,50);
        setImage(exitButton);
    }
    
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this))
        {
            checkClick(new TitleScreen());
            endTheGame();
        }
    } 
    
    public void endTheGame()
    {
        Greenfoot.stop();
    }
    
    public void started()
    {
        soundtrack.play();   
    }
    
    public void stopped()
    {
        soundtrack.stop();
    }
}
