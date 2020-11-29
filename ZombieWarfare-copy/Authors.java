import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Authors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Authors extends Actor
{
    public Authors()
    {
        GreenfootImage Authors = new GreenfootImage(600,100);
        Font adjustedFont = new Font(true,false,10);
        Authors.setFont(adjustedFont);
        Authors.setColor(Color.BLACK);
        Authors.drawString("By: Mark Neefa, Abisan Poothapillai, Gevorg Markarov, Roberto Natale",0,50);
        setImage(Authors);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
