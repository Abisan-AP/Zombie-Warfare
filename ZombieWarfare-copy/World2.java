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
        score = 0;
        showScore();
    }
    private void prepObjects()
    {
        Player player = new Player();
        addObject(player, 86, 213);
        Zombie zombie = new Zombie();
        addObject(zombie, 550, 350);
        zombie.turn(270);
    }
    public void addScore(int points)
    {
        score += points; 
        if (score > 7) {
           showText("YOU WIN!!!", 300, 200);
           //Greenfoot.stop();
           
        }
    }
    
    public void showScore()
    {
        showText("Score: " + score,75,50);
    }
    
    private void path()
    {
        Tower tower = new Tower();
        addObject(tower,200,350);
        Go_Streight straight1 = new Go_Streight();
        addObject(straight1, 200, 320);
        Go_Streight straight2 = new Go_Streight();
        addObject(straight2, 200, 290);
        Go_Streight straight3 = new Go_Streight();
        addObject(straight3, 200, 260);
        Go_Streight straight4 = new Go_Streight();
        addObject(straight4, 200, 230);
        Go_Streight straight5 = new Go_Streight();
        addObject(straight5, 200, 200);
        Go_Streight straight6 = new Go_Streight();
        addObject(straight6, 200, 170);
        Go_Streight straight7 = new Go_Streight();
        addObject(straight7, 200, 140);
        
        Go_Right right = new Go_Right();
        addObject(right, 200, 110);
        right.turn(90);
        Go_Streight straight8 = new Go_Streight();
        addObject(straight8, 235,110);
        straight8.turn(90);
        Go_Streight straight9 = new Go_Streight();
        addObject(straight9, 260,110);
        straight9.turn(90);
        Go_Right right1 = new Go_Right();
        addObject(right1, 290, 110);
        right1.turn(180);
       
        Go_Streight straight10 = new Go_Streight();
        addObject(straight10, 290,140);
        Go_Streight straight11 = new Go_Streight();
        addObject(straight11, 290,170);
        Go_Streight straight12 = new Go_Streight();
        addObject(straight12, 290,200);
        Go_Streight straight13 = new Go_Streight();
        addObject(straight13, 290,230);
        Go_Streight straight14 = new Go_Streight();
        addObject(straight14, 290,260);
        Go_Streight straight15 = new Go_Streight();
        addObject(straight15, 290,290);
        Go_Streight straight16 = new Go_Streight();
        addObject(straight16, 290,320);
        
        Go_Right right2 = new Go_Right();
        addObject(right2,290, 350);
        Go_Right right3 = new Go_Right();
        addObject(right3,320,350);
        right3.turn(270);
        
        Go_Streight straight17 = new Go_Streight();
        addObject(straight17, 320,320);
        Go_Streight straight18 = new Go_Streight();
        addObject(straight18, 320,290);
        Go_Streight straight19 = new Go_Streight();
        addObject(straight19, 320,260);
        Go_Streight straight20 = new Go_Streight();
        addObject(straight20, 320,230);
        Go_Streight straight21 = new Go_Streight();
        addObject(straight21, 320,200);
        Go_Streight straight22 = new Go_Streight();
        addObject(straight22, 320,170);
        Go_Streight straight23 = new Go_Streight();
        addObject(straight23, 320,140);
        Go_Streight straight24 = new Go_Streight();
        addObject(straight24, 320,110);
        Go_Right right4 = new Go_Right();
        addObject(right4,320,80);
        right4.turn(90);
        Go_Streight straight25 = new Go_Streight();
        addObject(straight25, 350,80);
        straight25.turn(90);
        Go_Streight straight26 = new Go_Streight();
        addObject(straight26, 380,80);
        straight26.turn(90);
        Go_Right right5 = new Go_Right();
        addObject(right5,410,80);
        right5.turn(180);
       
        Go_Streight straight27 = new Go_Streight();
        addObject(straight27, 410,110);
        Go_Streight straight28 = new Go_Streight();
        addObject(straight28, 410,140);
        Go_Streight straight29 = new Go_Streight();
        addObject(straight29, 410,170);
        Go_Streight straight30 = new Go_Streight();
        addObject(straight30, 410,200);
        Go_Streight straight31 = new Go_Streight();
        addObject(straight31, 410,230);
        Go_Streight straight32 = new Go_Streight();
        addObject(straight32, 410,260);
        Go_Streight straight33 = new Go_Streight();
        addObject(straight33, 410,290);
        Go_Streight straight34 = new Go_Streight();
        addObject(straight34, 410,320);
        
        Go_Right right6 = new Go_Right();
        addObject(right6,410,350);
        Go_Right right7 = new Go_Right();
        addObject(right7,440,350);
        
        right7.turn(270);
        Go_Streight straight35 = new Go_Streight();
        addObject(straight35, 440,320);
        Go_Streight straight36 = new Go_Streight();
        addObject(straight36, 440,290);
        Go_Streight straight37 = new Go_Streight();
        addObject(straight37, 440,260);
        Go_Streight straight38 = new Go_Streight();
        addObject(straight38, 440,230);
        Go_Streight straight39 = new Go_Streight();
        addObject(straight39, 440,200);
        Go_Streight straight40 = new Go_Streight();
        addObject(straight40, 440,170);
        Go_Streight straight41 = new Go_Streight();
        addObject(straight41, 440,140);
        Go_Streight straight42 = new Go_Streight();
        addObject(straight42, 440,110);
        Go_Streight straight43 = new Go_Streight();
        addObject(straight43, 440,80);
       
        Go_Right right8 = new Go_Right();
        addObject(right8,440,50);
        right8.turn(90);
        Go_Streight straight44 = new Go_Streight();
        addObject(straight44,470,50);
        straight44.turn(90);
        Go_Streight straight45 = new Go_Streight();
        addObject(straight45,500,50);
        straight45.turn(90);
        Go_Right right9 = new Go_Right();
        addObject(right9,530,50);
        right9.turn(180);
        
        Go_Streight straight46 = new Go_Streight();
        addObject(straight46, 530,80);
        Go_Streight straight47 = new Go_Streight();
        addObject(straight47, 530,110);
        Go_Streight straight48 = new Go_Streight();
        addObject(straight48, 530,140);
        Go_Streight straight49 = new Go_Streight();
        addObject(straight49, 530,170);
        Go_Streight straight50 = new Go_Streight();
        addObject(straight50, 530,200);
        Go_Streight straight51 = new Go_Streight();
        addObject(straight51, 530,230);
        Go_Streight straight52 = new Go_Streight();
        addObject(straight52, 530,260);
        Go_Streight straight53 = new Go_Streight();
        addObject(straight53, 530,290);
        Go_Streight straight54 = new Go_Streight();
        addObject(straight54, 530,320);
        Go_Streight straight55 = new Go_Streight();
        addObject(straight55, 530,350);
    }
}