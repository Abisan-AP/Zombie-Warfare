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
    final int speed = 2;
    private int shotTimer;
    private int zombieCount = 0;
    private GreenfootSound bulletSound = new GreenfootSound("bulletshot.wav");
    private GreenfootImage run0 = new GreenfootImage("survivor-idle_shotgun_0 copy.png");
    private GreenfootImage run1 = new GreenfootImage("survivor-move_shotgun_1.png");
    private GreenfootImage run2 = new GreenfootImage("survivor-move_shotgun_2.png");
    private GreenfootImage run3 = new GreenfootImage("survivor-move_shotgun_3.png");
    private GreenfootImage run4 = new GreenfootImage("survivor-move_shotgun_4.png");
    private GreenfootImage run5 = new GreenfootImage("survivor-move_shotgun_5.png");
    private GreenfootImage run6 = new GreenfootImage("survivor-move_shotgun_6.png");
    private GreenfootImage run7 = new GreenfootImage("survivor-move_shotgun_7.png");
    private GreenfootImage run8 = new GreenfootImage("survivor-move_shotgun_8.png");
    private GreenfootImage run9 = new GreenfootImage("survivor-move_shotgun_9.png");
    private GreenfootImage run10 = new GreenfootImage("survivor-move_shotgun_10.png");
    private GreenfootImage run11 = new GreenfootImage("survivor-move_shotgun_11.png");
    private GreenfootImage run12 = new GreenfootImage("survivor-move_shotgun_12.png");
    private GreenfootImage run13 = new GreenfootImage("survivor-move_shotgun_13.png");
    private GreenfootImage run14 = new GreenfootImage("survivor-move_shotgun_14.png");
    private GreenfootImage run15 = new GreenfootImage("survivor-move_shotgun_15.png");
    private GreenfootImage run16 = new GreenfootImage("survivor-move_shotgun_16.png");
    private GreenfootImage run17 = new GreenfootImage("survivor-move_shotgun_17.png");
    private GreenfootImage run18 = new GreenfootImage("survivor-move_shotgun_18.png");
    private GreenfootImage run19 = new GreenfootImage("survivor-move_shotgun_19.png");
    private int frame = 1;
    private int animationCounter = 0;
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    final public void act()
    {
        MouseInfo m = Greenfoot.getMouseInfo();
        //nextZombie();
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
        
        if (shotTimer == 0 && Greenfoot.mouseClicked(null)) {
            shoot();
            shotTimer = 20;
        }
        if (shotTimer > 0) {
            shotTimer--;
        }
        animationCounter++;
        if(animationCounter % 3 == 0){
            animation();
        }
    }
    
    public void animation()
    {
        if(frame == 1)
        {
            setImage(run0);
        }
        else if(frame == 2)
        {
            setImage(run1);
        }
        else if(frame == 3)
        {
            setImage(run2);
        }
        else if(frame == 4)
        {
            setImage(run3);
        }
        else if(frame == 5)
        {
            setImage(run4);
        }
        else if(frame == 6)
        {
            setImage(run5);
        }
        else if(frame == 7)
        {
            setImage(run6);
        }
        else if(frame == 8)
        {
            setImage(run7);
        }
        else if(frame == 9)
        {
            setImage(run8);
        }
        else if(frame == 10)
        {
            setImage(run9);
        }
        else if(frame == 11)
        {
            setImage(run10);
        }
        else if(frame == 12)
        {
            setImage(run11);
        }
        else if(frame == 13)
        {
            setImage(run12);
        }
        else if(frame == 14)
        {
            setImage(run13);
        }
        else if(frame == 15)
        {
            setImage(run14);
        }
        else if(frame == 16)
        {
            setImage(run15);
        }
        else if(frame == 17)
        {
            setImage(run16);
        }
        else if(frame == 18)
        {
            setImage(run17);
        }
        else if(frame == 19)
        {
            setImage(run18);
        }
        else if(frame == 20)
        {
            setImage(run19);
        }
        else if(frame == 21)
        {
            setImage(run0);
            frame = 1;
            return;
        }
        frame++;
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
        if (m != null) {
            int x = m.getX();
            int y = m.getY();
        
        
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet, getX(), getY());
        
           bullet.turnTowards(x, y);
           bulletSound.stop();
           bulletSound.play();
           
        }
    }
    
    private void nextZombie(){
        zombieCount++;
        if(zombieCount%50 == 0 && zombieCount<=500){
            Zombie zombie =  new  Zombie();
            getWorld().addObject(zombie, 125,25);
            zombie.turn(90);
        }
    }
}
