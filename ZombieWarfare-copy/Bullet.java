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
        hitZombie();
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
    
    public void hitZombie() {
        Zombie zombie = (Zombie) getOneObjectAtOffset(0, 0, Zombie.class);
        if (zombie != null) {
            zombie.removeHP(25);
            if (zombie.isZombieDead()) {
                removeTouching(Zombie.class);
                MyWorld world = (MyWorld)getWorld();
                world.addScore(1);
            }
            getWorld().removeObject(this);
        }
        else if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}

