import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Zombie extends Actor
{
    private int HP = 100;
    private GreenfootImage move0 = new GreenfootImage("skeleton-move_0.png");
    private GreenfootImage move1 = new GreenfootImage("skeleton-move_1.png");
    private GreenfootImage move2 = new GreenfootImage("skeleton-move_2.png");
    private GreenfootImage move3 = new GreenfootImage("skeleton-move_3.png");
    private GreenfootImage move4 = new GreenfootImage("skeleton-move_4.png");
    private GreenfootImage move5 = new GreenfootImage("skeleton-move_5.png");
    private GreenfootImage move6 = new GreenfootImage("skeleton-move_6.png");
    private GreenfootImage move7 = new GreenfootImage("skeleton-move_7.png");
    private GreenfootImage move8 = new GreenfootImage("skeleton-move_8.png");
    private GreenfootImage move9 = new GreenfootImage("skeleton-move_9.png");
    private GreenfootImage move10 = new GreenfootImage("skeleton-move_10.png");
    private GreenfootImage move11 = new GreenfootImage("skeleton-move_11.png");
    private GreenfootImage move12 = new GreenfootImage("skeleton-move_12.png");
    private GreenfootImage move13 = new GreenfootImage("skeleton-move_13.png");
    private GreenfootImage move14 = new GreenfootImage("skeleton-move_14.png");
    private GreenfootImage move15 = new GreenfootImage("skeleton-move_15.png");
    private GreenfootImage move16 = new GreenfootImage("skeleton-move_16.png");
    private int frame = 1;
    private int animationCounter = 0;
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Tower tower = (Tower) getWorld().getObjects(Tower.class).get(0);
        if(isTouching(Go_Right.class)){
           turn (2);
        }
        if(isTouching(Go_Left.class)){
           turn (-2);
        }
        move(1);
        animationCounter++;
        if(animationCounter % 2 == 0){
            animation();
        }
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
    
    public void animation()
    {
        if(frame == 1)
        {
            setImage(move0);
        }
        if(frame == 2)
        {
            setImage(move1);
        }
        if(frame == 3)
        {
            setImage(move2);
        }
        if(frame == 4)
        {
            setImage(move3);
        }
        if(frame == 5)
        {
            setImage(move4);
        }
        if(frame == 6)
        {
            setImage(move5);
        }
        if(frame == 7)
        {
            setImage(move6);
        }
        if(frame == 8)
        {
            setImage(move7);
        }
        if(frame == 9)
        {
            setImage(move8);
        }
        if(frame == 10)
        {
            setImage(move9);
        }
        if(frame == 11)
        {
            setImage(move10);
        }
        if(frame == 12)
        {
            setImage(move11);
        }
        if(frame == 13)
        {
            setImage(move12);
        }
        if(frame == 14)
        {
            setImage(move13);
        }
        if(frame == 15)
        {
            setImage(move14);
        }
        if(frame == 16)
        {
            setImage(move15);
        }
        if(frame == 17)
        {
            setImage(move16);
        }
        if(frame == 18)
        {
            setImage(move0);
            frame = 1;
            return;
        }
        frame++;
    }
}
