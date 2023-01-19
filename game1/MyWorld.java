import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels

        super(1650, 900, 1);
    }
    public void act()
    {
       //noumin
       if( Greenfoot.isKeyDown( "1" ) ){
        World game1 = new stage1();
        Greenfoot.setWorld( game1 );
        }
       //murabito
       if( Greenfoot.isKeyDown( "2" ) ){
        World game2 = new stage2();
        Greenfoot.setWorld( game2 );
        }
       //shagi
       if( Greenfoot.isKeyDown( "3" ) ){
        World game3 = new stage3();
        Greenfoot.setWorld( game3 );
        }

    }
}
