import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class teki1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class teki1 extends Actor
{
    /**
     * Act - do whatever the teki1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int  cnt=0;
    
    public void act() 
    {  
      move(5);
      if(cnt%40==0){
              int A = 0;
              int B = 360;
              int C = A + (int)(Math.random()*((B-A)+1));
              setRotation(C);
              cnt=1;
      }
      cnt++;
      
    }    
}
