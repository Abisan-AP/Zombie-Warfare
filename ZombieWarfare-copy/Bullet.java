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
     if(isTouching(Zombie.class)){
         removeTouching(Zombie.class);
         MyWorld world = (MyWorld)getWorld();
         world.addScore(1);
         getWorld().removeObject(this);
    }
     else if (this.isAtEdge()){
         getWorld().removeObject(this);
    }
    }
}
