import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
         
        prepare();
        random();
        
        
        Player p = new Player();
        addObject(p, 600 /2, 400 / 2);
    }
    private void prepare()
        {
        Food[] sheep = new Food[18];
        for(int i=0; i<sheep.length; i++)
        {
        sheep[i] = new Food();
        int FoodX = Greenfoot.getRandomNumber(getWidth());
        int FoodY = Greenfoot.getRandomNumber(getHeight());
        addObject(sheep[i], FoodX, FoodY);
    
}
}
private void random()
{
    Enemies[] enemy = new Enemies[4];
    for(int e=0; e<enemy.length; e++)
    {
        enemy[e] = new Enemies();
        int EnemiesX = Greenfoot.getRandomNumber(getWidth());
        int EnemiesY = Greenfoot.getRandomNumber(getHeight());
        addObject(enemy[e], EnemiesX, EnemiesY);
    }
}
}


