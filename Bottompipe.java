import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bottompipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bottompipe extends Actor
{
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
