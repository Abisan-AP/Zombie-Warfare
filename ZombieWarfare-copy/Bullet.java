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

    public void hitZombie() {
        Zombie zombie = (Zombie) getOneObjectAtOffset(0, 0, Zombie.class);
        if (zombie != null) {
            zombie.removeHP(25);
            if (zombie.isZombieDead()) {
                removeTouching(Zombie.class);
                if (getWorld() instanceof MyWorld) {
                    MyWorld world = (MyWorld)getWorld();
                    world.addScore(1);
                }
                else if (getWorld() instanceof World2) {
                    World2 world2 = (World2)getWorld();
                    world2.addScore(1);
                }
                else if (getWorld() instanceof World3) {
                    World3 world3 = (World3)getWorld();
                    world3.addScore(1);
                }
            }
            getWorld().removeObject(this);
        }
        else if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
