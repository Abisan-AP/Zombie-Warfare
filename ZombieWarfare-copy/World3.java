
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World3 extends World
{
    private int score;
    
    /**
     * Constructor for objects of class World3.
     * 
     */
    public World3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        score = 0;
        showScore();
        prepare();
        path();
    }
    
    public void addScore(int points)
    {
       score += points;
       showScore();
       if (score > 7) {
           showText("YOU WIN!!!", 300, 200);
        }
    }
    
    public void showScore()
    {
        showText("Score: " + score,550,50);
    }
    
    private void prepare() {
        setPaintOrder(Player.class, Zombie.class, Bullet.class);
        Tower tower = new Tower();
        addObject(tower,527,207);
        tower.setLocation(500,200);
        tower.setRotation(90);
        Player player = new Player();
        addObject(player,530,200);
        player.setRotation(180);
        ZombieSpawner3 zombieSpawner3 = new ZombieSpawner3();
        addObject(zombieSpawner3,15,185);
        ZombieSpawner3 zombieSpawner32 = new ZombieSpawner3();
        addObject(zombieSpawner32,15,220);
    }
    
    public void path() {
        // first path
        Go_Streight go_Streight = new Go_Streight();
        addObject(go_Streight, 470, 185);
        go_Streight.setRotation(90);
        Go_Left go_Left = new Go_Left();
        addObject(go_Left, 435, 185);
        go_Left.setRotation(90);
        Go_Streight go_Streight2 = new Go_Streight();
        addObject(go_Streight2, 435, 150);
        Go_Streight go_Streight3 = new Go_Streight();
        addObject(go_Streight3, 435, 115);
        Go_Streight go_Streight4 = new Go_Streight();
        addObject(go_Streight4, 435, 80);
        Go_Right go_Right = new Go_Right();
        addObject(go_Right, 435, 45);
        go_Right.setRotation(180);
        Go_Streight go_Streight5 = new Go_Streight();
        addObject(go_Streight5, 400, 45);
        go_Streight5.setRotation(90);
        Go_Streight go_Streight6 = new Go_Streight();
        addObject(go_Streight6, 365, 45);
        go_Streight6.setRotation(90);
        Go_Streight go_Streight7 = new Go_Streight();
        addObject(go_Streight7, 330, 45);
        go_Streight7.setRotation(90);
        Go_Right go_Right2 = new Go_Right();
        addObject(go_Right2, 295, 45);
        go_Right2.setRotation(90);
        Go_Streight go_Streight8 = new Go_Streight();
        addObject(go_Streight8, 295, 80);
        Go_Streight go_Streight9 = new Go_Streight();
        addObject(go_Streight9, 295, 115);
        Go_Streight go_Streight10 = new Go_Streight();
        addObject(go_Streight10, 295, 150);
        Go_Streight go_Streight11 = new Go_Streight();
        addObject(go_Streight11, 295, 185);
        Go_Streight go_Streight12 = new Go_Streight();
        addObject(go_Streight12, 295, 220);
        Go_Streight go_Streight13 = new Go_Streight();
        addObject(go_Streight13, 295, 255);
        Go_Streight go_Streight14 = new Go_Streight();
        addObject(go_Streight14, 295, 290);
        Go_Left go_Left2 = new Go_Left();
        addObject(go_Left2, 295, 325);
        Go_Streight go_Streight15 = new Go_Streight();
        addObject(go_Streight15, 260, 325);
        go_Streight15.setRotation(90);
        Go_Left go_Left3 = new Go_Left();
        addObject(go_Left3, 225, 325);
        go_Left3.setRotation(90);
        Go_Streight go_Streight16 = new Go_Streight();
        addObject(go_Streight16, 225, 290);
        Go_Streight go_Streight17 = new Go_Streight();
        addObject(go_Streight17, 225, 255);
        Go_Streight go_Streight18 = new Go_Streight();
        addObject(go_Streight18, 225, 220);
        Go_Streight go_Streight19 = new Go_Streight();
        addObject(go_Streight19, 225, 185);
        Go_Streight go_Streight20 = new Go_Streight();
        addObject(go_Streight20, 225, 150);
        Go_Streight go_Streight21 = new Go_Streight();
        addObject(go_Streight21, 225, 115);
        Go_Streight go_Streight22 = new Go_Streight();
        addObject(go_Streight22, 225, 80);
        Go_Right go_Right3 = new Go_Right();
        addObject(go_Right3, 225, 45);
        go_Right3.setRotation(180);
        Go_Streight go_Streight23 = new Go_Streight();
        addObject(go_Streight23, 190, 45);
        go_Streight23.setRotation(90);
        Go_Streight go_Streight24 = new Go_Streight();
        addObject(go_Streight24, 155, 45);
        go_Streight24.setRotation(90);
        Go_Streight go_Streight25 = new Go_Streight();
        addObject(go_Streight25, 120, 45);
        go_Streight25.setRotation(90);
        Go_Right go_Right4 = new Go_Right();
        addObject(go_Right4, 85, 45);
        go_Right4.setRotation(90);
        Go_Streight go_Streight26 = new Go_Streight();
        addObject(go_Streight26, 85, 80);
        Go_Streight go_Streight27 = new Go_Streight();
        addObject(go_Streight27, 85, 115);
        Go_Streight go_Streight28 = new Go_Streight();
        addObject(go_Streight28, 85, 150);
        Go_Left go_Left4 = new Go_Left();
        addObject(go_Left4, 85, 185);
        Go_Streight go_Streight29 = new Go_Streight();
        addObject(go_Streight29, 50, 185);
        go_Streight29.setRotation(90);
        
        // second path
        Go_Streight go_Streight01 = new Go_Streight();
        addObject(go_Streight01, 470, 220);
        go_Streight01.setRotation(90);
        Go_Streight go_Streight02 = new Go_Streight();
        addObject(go_Streight02, 435, 220);
        go_Streight02.setRotation(90);
        Go_Left go_Left01 = new Go_Left();
        addObject(go_Left01, 400, 220);
        go_Left01.setRotation(90);
        Go_Streight go_Streight03 = new Go_Streight();
        addObject(go_Streight03, 400, 185);
        Go_Streight go_Streight04 = new Go_Streight();
        addObject(go_Streight04, 400, 150);
        Go_Streight go_Streight05 = new Go_Streight();
        addObject(go_Streight05, 400, 115);
        Go_Right go_Right01 = new Go_Right();
        addObject(go_Right01, 400, 80);
        go_Right01.setRotation(180);
        Go_Streight go_Streight06 = new Go_Streight();
        addObject(go_Streight06, 365, 80);
        go_Streight06.setRotation(90);
        Go_Right go_Right02 = new Go_Right();
        addObject(go_Right02, 330, 80);
        go_Right02.setRotation(90);
        Go_Streight go_Streight07 = new Go_Streight();
        addObject(go_Streight07, 330, 115);
        Go_Streight go_Streight08 = new Go_Streight();
        addObject(go_Streight08, 330, 150);
        Go_Streight go_Streight09 = new Go_Streight();
        addObject(go_Streight09, 330, 185);
        Go_Streight go_Streight010 = new Go_Streight();
        addObject(go_Streight010, 330, 220);
        Go_Streight go_Streight011 = new Go_Streight();
        addObject(go_Streight011, 330, 255);
        Go_Streight go_Streight012 = new Go_Streight();
        addObject(go_Streight012, 330, 290);
        Go_Streight go_Streight013 = new Go_Streight();
        addObject(go_Streight013, 330, 325);
        Go_Left go_Left02 = new Go_Left();
        addObject(go_Left02, 330, 360);
        Go_Streight go_Streight014 = new Go_Streight();
        addObject(go_Streight014, 295, 360);
        go_Streight014.setRotation(90);
        Go_Streight go_Streight015 = new Go_Streight();
        addObject(go_Streight015, 260, 360);
        go_Streight015.setRotation(90);
        Go_Streight go_Streight016 = new Go_Streight();
        addObject(go_Streight016, 225, 360);
        go_Streight016.setRotation(90);
        Go_Left go_Left03 = new Go_Left();
        addObject(go_Left03, 190, 360);
        go_Left03.setRotation(90);
        Go_Streight go_Streight017 = new Go_Streight();
        addObject(go_Streight017, 190, 325);
        Go_Streight go_Streight018 = new Go_Streight();
        addObject(go_Streight018, 190, 290);
        Go_Streight go_Streight019 = new Go_Streight();
        addObject(go_Streight019, 190, 255);
        Go_Streight go_Streight020 = new Go_Streight();
        addObject(go_Streight020, 190, 220);
        Go_Streight go_Streight021 = new Go_Streight();
        addObject(go_Streight021, 190, 185);
        Go_Streight go_Streight022 = new Go_Streight();
        addObject(go_Streight022, 190, 150);
        Go_Streight go_Streight023 = new Go_Streight();
        addObject(go_Streight023, 190, 115);
        Go_Right go_Right03 = new Go_Right();
        addObject(go_Right03, 190, 80);
        go_Right03.setRotation(180);
        Go_Streight go_Streight024 = new Go_Streight();
        addObject(go_Streight024, 155, 80);
        go_Streight024.setRotation(90);
        Go_Right go_Right04 = new Go_Right();
        addObject(go_Right04, 120, 80);
        go_Right04.setRotation(90);
        Go_Streight go_Streight025 = new Go_Streight();
        addObject(go_Streight025, 120, 115);
        Go_Streight go_Streight026 = new Go_Streight();
        addObject(go_Streight026, 120, 150);
        Go_Streight go_Streight027 = new Go_Streight();
        addObject(go_Streight027, 120, 185);
        Go_Left go_Left04 = new Go_Left();
        addObject(go_Left04, 120, 220);
        Go_Streight go_Streight028 = new Go_Streight();
        addObject(go_Streight028, 85, 220);
        go_Streight028.setRotation(90);
        Go_Streight go_Streight029 = new Go_Streight();
        addObject(go_Streight029, 50, 220);
        go_Streight029.setRotation(90);
    }
}
