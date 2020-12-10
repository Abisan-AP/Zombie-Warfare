import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower extends Actor
{
    //private int worldnum;
    private int hp = 3;
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Tower(int worldnum)
    {
        //this.worldnum = worldnum;
    }
    
    public void act() 
    {
        HP();
        isGameOver();
    }  
    
    public void HP()
    {
     
        if(isTouching(Zombie.class)) {
            hp -= 1;
            getWorld().removeObject(getWorld().getObjects(Zombie.class).get(0));
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
    }
    
    public void isGameOver()
    {
        if(hp == 0)
      {
          getWorld().showText("YOU LOSE :(", 300, 200);
          GameOverWorld gameover = new GameOverWorld();
          Greenfoot.setWorld(gameover);
          //Greenfoot.stop();
      }
    }
}
