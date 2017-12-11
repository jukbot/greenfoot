import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private static final int speed = 2;
    public void act() 
    {
        setLocation(getX() - speed, getY());
        
        if(getX() < getWorld().getWidth()-590)
        {
            getWorld().removeObject(this);
        }
    }    
    
  
}
