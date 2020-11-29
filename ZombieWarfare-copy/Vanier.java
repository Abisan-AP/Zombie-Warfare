import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vanier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vanier extends Actor
{
    public Vanier()
    {
        GreenfootImage Vanier = new GreenfootImage(155,105);
        Font adjustedFont = new Font(true,false,15);
        Vanier.setFont(adjustedFont);
        Vanier.setColor(Color.BLACK);
        Vanier.drawString("Game Programming 1",0,50);
        Vanier.drawString("Fall 2020",0,75);
        Vanier.drawString("Tassia Araujo",0,100);
        setImage(Vanier);
    }
    
    public void act() 
    {
        //nothing here for now
    }    
}
