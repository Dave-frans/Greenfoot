import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends World
{

    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    private void prepare()
    {
        Text text = new Text();
        addObject(text, 400, 300);
        Greenfoot.stop();
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        Greenfoot.setWorld( new Background());
    }
}
