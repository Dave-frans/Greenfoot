import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    int rightSideOfScreen;
    int bottomOfScreen;
    
   public void addedToWorld(World water)
    {
        rightSideOfScreen = water.getWidth() - 1;
        bottomOfScreen = water.getHeight() - 1;
    }
    
   public void act() 
    {
        move(4);
        if (Greenfoot.getRandomNumber(20) == 1)
        {
            setRotation(Greenfoot.getRandomNumber(360));
        }
        int x = getX();
        int y = getY();
        
        if(x<=0 || y<=0 || x >= rightSideOfScreen || y >= bottomOfScreen)
        {
            turn(180);
        }
    }
}
       
    
 

