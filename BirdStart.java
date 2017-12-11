import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BirdStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BirdStart extends Actor{
    int dy = -20;
    int gravity = 1;
  
    PlayingWorld play = new PlayingWorld();
    public void act() {
        
        setLocation(getX(),getY() + dy);
        if (dy == 20){
            dy = -21;
            setRotation(-30);
        }
        
        if(dy < 10 && dy > -5){
            setRotation(0);
        }
        
        if(dy > 10){
            setRotation(30);
        }
        
        if(Greenfoot.isKeyDown("space") == true){
            Greenfoot.setWorld(play);  
        }
        
      
        
        dy = dy+gravity;
    }
    
    
}
