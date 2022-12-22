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
    public void act() 
    {
      int A = 0;
      int B = 360;
      int C = A + (int)(Math.random()*((B-A)+1));
      setRotation(C);
      for(int i=0;i<3;i++){    
          move(5);
        }
      
        
        
      /*Actor actor = getOneIntersectingObject( teki1.class );
      if( actor != null ){
    
          getWorld().showText( "GAME OVER", 100, 50 );
          Greenfoot.stop();
          
          }*/
    }    
}
