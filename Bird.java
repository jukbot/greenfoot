import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor{
    int dy = 0;
    public static final int gravity = 1;
    public int point = 0;
    
    Score Score = new Score();
    
    public void act() {
        
        setLocation(getX(),getY() + dy);
        if(Greenfoot.isKeyDown("space") == true){
            dy = 0;
            setRotation(-30);
        }
        
        if(dy < 5 && dy > -5){
            setRotation(0);
        }
        
        if(dy > 10){
            setRotation(30);
        }
        
        /**if(getOneIntersectingObject(Bottompipe.class) != null){
              Gameover();
        }
        if(getOneIntersectingObject(Toppipe.class) != null){
              Gameover();
        }
        if(getOneIntersectingObject(Ground.class) != null){
              Gameover();
        }
        */
       
       if(getOneIntersectingObject(Food.class) != null){
            point++;
            System.out.println(getPoint());
            getWorld().removeObjects(getWorld().getObjects(Food.class));
        }
       
        dy = dy;
        
        // dy = dy + gravity;
    }
    
    public int getPoint() {
        return point;
    }
    public void Gameover(){
        Greenfoot.setWorld(Score);
    }
    

    
    
        
}

        
    
    
  
    
   
        

    
    
        
    
    

