import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    int speed = (int)((Math.random()*10)+3);
    public void act() 
    {
        setLocation(getX() - speed, getY());
        
        if(getX() < getWorld().getWidth()-590)
        {
            getWorld().removeObject(this);
        }
    }    
    
    
}
