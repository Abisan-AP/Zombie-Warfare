import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{
    private int score;
    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepObjects();
        path();
        score = 40;
        showScore();
        prepare();
    }

    private void prepObjects()
    {
        ZombieSpawner zombieSpawner1 = new ZombieSpawner();
        addObject(zombieSpawner1,530, 385);
        Player player = new Player();
        addObject(player, 86, 213);
        setPaintOrder(Player.class, Zombie.class, Bullet.class);
    }

    public void addScore(int points)
    {
        score -= points; 
        showScore();
        if (score == 30) {
            ZombieSpawner zombieSpawner2 = new ZombieSpawner();
            addObject(zombieSpawner2, 530, 385);
        }
        if (score == 20) {
            ZombieSpawner2 zombieSpawner3 = new ZombieSpawner2();
            addObject(zombieSpawner3, 530, 385);
        }
        if (score == 10) {
            ZombieSpawner2 zombieSpawner4 = new ZombieSpawner2();
            addObject(zombieSpawner4, 530, 385);
        }
        if (score == 0) {
            showText("YOU WIN!!!", 300, 155);
            goLevel3();
        }
    }

    public void showScore()
    {
        showText("Zombies Left: " + score,75,50);
    }

    private void path()
    {
        Tower tower = new Tower(2);
        addObject(tower,145,360);
        Go_Streight straight1 = new Go_Streight();
        addObject(straight1, 145, 325);
        Go_Streight straight2 = new Go_Streight();
        addObject(straight2, 145, 290);
        Go_Streight straight3 = new Go_Streight();
        addObject(straight3, 145, 255);
        Go_Streight straight4 = new Go_Streight();
        addObject(straight4, 145, 220);
        Go_Streight straight5 = new Go_Streight();
        addObject(straight5, 145, 185);
        Go_Streight straight6 = new Go_Streight();
        addObject(straight6, 145, 150);
        Go_Streight straight7 = new Go_Streight();
        addObject(straight7, 145, 115);

        Go_Left left = new Go_Left();
        addObject(left, 145, 80);
        left.turn(180);
        Go_Streight straight8 = new Go_Streight();
        addObject(straight8, 180,80);
        straight8.turn(90);
        Go_Left left1 = new Go_Left();
        addObject(left1, 215, 80);
        left1.turn(-90);

        Go_Streight straight10 = new Go_Streight();
        addObject(straight10, 215,115);
        Go_Streight straight11 = new Go_Streight();
        addObject(straight11, 215,150);
        Go_Streight straight12 = new Go_Streight();
        addObject(straight12, 215,185);
        Go_Streight straight13 = new Go_Streight();
        addObject(straight13, 215,220);
        Go_Streight straight14 = new Go_Streight();
        addObject(straight14, 215,255);
        Go_Streight straight15 = new Go_Streight();
        addObject(straight15, 215,290);
        Go_Streight straight16 = new Go_Streight();
        addObject(straight16, 215,325);

        Go_Right right2 = new Go_Right();
        addObject(right2,215, 360);
        Go_Streight straight57 = new Go_Streight();
        addObject(straight57,250,360);
        straight57.turn(90);
        Go_Right right3 = new Go_Right();
        addObject(right3,285,360);
        right3.turn(270);

        Go_Streight straight17 = new Go_Streight();
        addObject(straight17, 285,325);
        Go_Streight straight18 = new Go_Streight();
        addObject(straight18, 285,290);
        Go_Streight straight19 = new Go_Streight();
        addObject(straight19, 285,255);
        Go_Streight straight20 = new Go_Streight();
        addObject(straight20, 285,220);
        Go_Streight straight21 = new Go_Streight();
        addObject(straight21, 285,185);
        Go_Streight straight22 = new Go_Streight();
        addObject(straight22, 285,150);
        Go_Streight straight23 = new Go_Streight();
        addObject(straight23, 285,115);
        Go_Streight straight24 = new Go_Streight();
        addObject(straight24, 285,80);
        Go_Left left4 = new Go_Left();
        addObject(left4,285,45);
        left4.turn(180);
        Go_Streight straight25 = new Go_Streight();
        addObject(straight25, 320,45);
        straight25.turn(90);
        Go_Left left5 = new Go_Left();
        addObject(left5,355,45);
        left5.turn(-90);

        Go_Streight straight27 = new Go_Streight();
        addObject(straight27, 355,80);
        Go_Streight straight28 = new Go_Streight();
        addObject(straight28, 355,115);
        Go_Streight straight29 = new Go_Streight();
        addObject(straight29, 355,150);
        Go_Streight straight30 = new Go_Streight();
        addObject(straight30, 355,185);
        Go_Streight straight31 = new Go_Streight();
        addObject(straight31, 355,220);
        Go_Streight straight32 = new Go_Streight();
        addObject(straight32, 355,255);
        Go_Streight straight33 = new Go_Streight();
        addObject(straight33, 355,290);
        Go_Streight straight34 = new Go_Streight();
        addObject(straight34, 355,325);

        Go_Right right6 = new Go_Right();
        addObject(right6,355,360);
        Go_Streight straight56 = new Go_Streight();
        addObject(straight56,390,360);
        straight56.turn(90);
        Go_Right right7 = new Go_Right();
        addObject(right7,425,360);

        right7.turn(270);
        Go_Streight straight35 = new Go_Streight();
        addObject(straight35, 425,325);
        Go_Streight straight36 = new Go_Streight();
        addObject(straight36, 425,290);
        Go_Streight straight37 = new Go_Streight();
        addObject(straight37, 425,255);
        Go_Streight straight38 = new Go_Streight();
        addObject(straight38, 425,220);
        Go_Streight straight39 = new Go_Streight();
        addObject(straight39, 425,185);
        Go_Streight straight40 = new Go_Streight();
        addObject(straight40, 425,150);
        Go_Streight straight41 = new Go_Streight();
        addObject(straight41, 425,115);
        Go_Streight straight42 = new Go_Streight();
        addObject(straight42, 425,80);
        Go_Streight straight43 = new Go_Streight();
        addObject(straight43, 425,45);

        Go_Left left8 = new Go_Left();
        addObject(left8,425,10);
        left8.turn(180);
        Go_Streight straight44 = new Go_Streight();
        addObject(straight44,460,10);
        straight44.turn(90);
        Go_Streight straight45 = new Go_Streight();
        addObject(straight45,495,10);
        straight45.turn(90);
        Go_Left left9 = new Go_Left();
        addObject(left9,530,10);
        left9.turn(-90);

        Go_Streight straight46 = new Go_Streight();
        addObject(straight46, 530,45);
        Go_Streight straight47 = new Go_Streight();
        addObject(straight47, 530,80);
        Go_Streight straight48 = new Go_Streight();
        addObject(straight48, 530,115);
        Go_Streight straight49 = new Go_Streight();
        addObject(straight49, 530,150);
        Go_Streight straight50 = new Go_Streight();
        addObject(straight50, 530,185);
        Go_Streight straight51 = new Go_Streight();
        addObject(straight51, 530,210);
        Go_Streight straight52 = new Go_Streight();
        addObject(straight52, 530,245);
        Go_Streight straight53 = new Go_Streight();
        addObject(straight53, 530,280);
        Go_Streight straight54 = new Go_Streight();
        addObject(straight54, 530,315);
        Go_Streight straight55 = new Go_Streight();
        addObject(straight55, 530,350);
    }

    private void goLevel3() {
        showText("You are now being transported to the next level...", 300, 300);
        Greenfoot.delay(600);
        Greenfoot.setWorld(new World3());
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}