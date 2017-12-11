import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayingWorld extends World
{
    
    
    /**
     * Constructor for objects of class PlayingWorld.
     * 
     */
    public PlayingWorld()
       
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
     
        Bird flappy = new Bird();
        Ground ground = new Ground();
       
        addObject(flappy, 100 , 200);
        addObject(ground, 300 , 400);
    }
    int count = 0;
    int start = 0;
    int point = 0;
    public void act(){
       count++;
 
       if(count % 200 == 0){
           createpipe();
           
       }
       if (count % 300 == 0){
           createfood();
        }
        
       if(count % 20 == 0){
           createground();
       }
       
  
       
       
       
       
    }
    
    public void createpipe(){
        Toppipe toppipe = new Toppipe();
        Bottompipe bottompipe = new Bottompipe();
        int between = (int)((Math.random()*10)+3);
        
        GreenfootImage image = bottompipe.getImage();
        GreenfootImage image2 = toppipe.getImage();
        
        addObject(toppipe, getWidth(), getHeight()/2  + ((image.getHeight()- (between *10)  )));
        addObject(bottompipe, getWidth(), - getHeight()/2  + ((image.getHeight() - (between *10) )));
    }
    
    public void createground(){
        Ground ground = new Ground();
        ground.getImage();
        
        addObject(ground, 500, 400);
        
        
    }
    
    public void createfood(){
        Food food = new Food();
        int point = 0;
        
        GreenfootImage image = food.getImage();
        addObject(food, getWidth(), getHeight()/2);
        
        
        
        // -(int)(Math.random()*400)+1
        
    }
    
   
    
    
    
    
    
    
    
    
    }

        
    
   



