import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class syagi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class syagi extends Actor
{
    /**
     * Act - do whatever the syagi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(10);
        }
        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(0);
        move(-10);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(-90);
        move(10);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(10);
        }
        // Add your action code here.
        Actor teki1 = getOneIntersectingObject( teki1.class );
            if( teki1 != null ){
                Greenfoot.stop();
            } 
        Actor teki2 = getOneIntersectingObject( teki2.class );
            if( teki2 != null ){
                Greenfoot.stop();
            } 
    }    
}
