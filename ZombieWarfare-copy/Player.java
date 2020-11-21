import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.lang.Object;
import greenfoot.MouseInfo;

/**
 * 
 */
public class Player extends Actor
{
    final int speed = 5;
    
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    final public void act()
    {
        MouseInfo m = Greenfoot.getMouseInfo();
        
        if (m != null) {
            turnTowards(m);
        }
        
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + speed);
        }
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + speed, getY());
        }
        
        if (Greenfoot.mouseClicked(null)) {
            shoot();
        }
    }
    
    public void turnTowards(int x, int y) {
        double x2 = x - getX();
        double y2 = y - getY();
        double angle = Math.atan2(y2, x2) * 180.0 / Math.PI;
        setRotation((int)angle);
    }
    
    public void turnTowards(MouseInfo m) {
        turnTowards(m.getX(), m.getY());
    }
    
    public void shoot() {
        MouseInfo m = Greenfoot.getMouseInfo();
        
        int x = m.getX();
        int y = m.getY();
        
        Bullet bullet = new Bullet();
        getWorld().addObject(bullet, getX(), getY());
        
        bullet.turnTowards(x, y);
    }
}
