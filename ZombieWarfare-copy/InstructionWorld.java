import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionWorld extends World
{

    /**
     * Constructor for objects of class InstructionWorld.
     * 
     */
    public InstructionWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void prepare()
    {
        GreenfootImage instructions = new GreenfootImage("instructionsbackground3.png");
        Picture instructionsPic = new Picture(instructions);
        addObject(instructionsPic,getWidth()/2,190);
        GoBack goBack = new GoBack();
        addObject(goBack,60,400);
        goBack.setLocation(65,350);
    }
}
