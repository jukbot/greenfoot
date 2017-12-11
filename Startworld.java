import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startworld extends World
{

    /**
     * Constructor for objects of class Startworld.
     * 
     */
    public Startworld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        BirdStart flappy = new BirdStart();
        Groundstatic ground = new Groundstatic();
      
        addObject(flappy, 100 , 200);
        addObject(ground, 300 , 400);
      
        System.out.println("Start debuging console");
        
    }
    
    public void createground(){
        Ground ground = new Ground();
        ground.getImage();
        
        addObject(ground, 500, 400);
        
        
    }
}
