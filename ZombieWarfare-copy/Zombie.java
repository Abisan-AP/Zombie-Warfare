import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Zombie extends Actor
{
    private int score = 0;
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Tower tower = (Tower) getWorld().getObjects(Tower.class).get(0);
        if(isTouching(Go_Right.class)){
           turn (2);
        }
        move(1);
    }
    public void lookTowards(Actor tower) {
        double towerX = tower.getX() - getX();
        double towerY = tower.getY() - getY();
        int angle = (int) (Math.atan2(towerY, towerX) * 180 / Math.PI);

        setRotation(angle);
    }
}
