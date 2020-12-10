import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Zombie extends Actor
{
    private int HP;
    private int moveSpeed;
    private int turnSpeed;
    
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Tower tower = (Tower) getWorld().getObjects(Tower.class).get(0);
        if(isTouching(Go_Right.class)){
           turn (turnSpeed);
        }
        if(isTouching(Go_Left.class)){
           turn (-turnSpeed);
        }
        move(moveSpeed);
    }
    
    public void lookTowards(Actor tower) {
        double towerX = tower.getX() - getX();
        double towerY = tower.getY() - getY();
        int angle = (int) (Math.atan2(towerY, towerX) * 180 / Math.PI);

        setRotation(angle);
    }
    
    public void removeHP(int damage) {
        HP -= damage;
    }
    
    public boolean isZombieDead() {
        return HP <= 0;
    }
    
    public void setHP(int HP) {
        this.HP = HP;
    }
    
    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
    
    public void setTurnSpeed(int turnSpeed) {
        this.turnSpeed = turnSpeed;
    }
}
