import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        begoneZombie();
    }    
    
    public void begoneZombie()
    {
     if(isTouching(Banana.class)){
         removeTouching(Banana.class);
         getWorld().removeObject(this);
         MyWorld world = (MyWorld) getWorld().getObjects(MyWorld.class).get(0);
         world.addScore(1);
    }
    else if (this.isAtEdge()){
         getWorld().removeObject(this);  
    }
    }
}
