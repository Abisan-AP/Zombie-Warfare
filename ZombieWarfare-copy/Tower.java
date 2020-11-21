import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower extends Actor
{
    private int hp = 3;
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        HP();
        isGameOver();
    }  
    
    public void HP()
    {
     
     if(isTouching(Zombie.class))
      {
          hp -= 1;
          getWorld().removeObject(getWorld().getObjects(Zombie.class).get(0));

      }
    }
    
    public void isGameOver()
    {
        if(hp == 0)
      {
          getWorld().showText("YOU LOSE :(", 300, 200);
          Greenfoot.stop();
      }
    }
}
