import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZombieSpawner2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZombieSpawner2 extends Actor
{
    private int zombieCount = 0;
    /**
     * Act - do whatever the ZombieSpawner2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        nextZombie();
    }  

    private void nextZombie(){
        zombieCount++;
        if(zombieCount%50 == 0 && zombieCount<=500){
            Zombie zombie =  new  Zombie();
            getWorld().addObject(zombie, getX(), getY());
            zombie.setHP(100);
            zombie.setMoveSpeed(2);
            zombie.setTurnSpeed(4);
            if (getWorld() instanceof World2) {
                zombie.turn(-90);
            }
        }
    }
}
