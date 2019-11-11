import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
   int score = 0;
   public void act() 
    {
        getWorld().showText("Score = "+score, 50, 20);
        if(Greenfoot.isKeyDown("up"))
        move(3);
        if(Greenfoot.isKeyDown("left"))
        turn(-3);
        if(Greenfoot.isKeyDown("Right"))
        turn(3);
        
       hitEnemies();
       youWin();
       if(isTouching(Food.class))
        eat();
       
      
    }
    public void hitEnemies()
    {
        if (isTouching (Enemies.class))
        {
            getWorld().addObject(new GameOver(), 400, 300);
            Greenfoot.stop();
            score = score + 1;
        }
    }
    public void youWin()
    {
        if(score == 18)
        {
            getWorld().addObject(new YouWin(), 400, 325);
            Greenfoot.stop();
        }
    }
   private void eat(){
        removeTouching(Food.class);
        score++;
        
}
}
     





