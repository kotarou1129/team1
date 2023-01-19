import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stage1 extends World
{

    /**
     * Constructor for objects of class stage1.
     * 
     */
    public stage1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1650, 900, 1); 
        addObject( new murabito(), 825, 450 );
        addObject( new teki1(), 600, 210 );
        addObject( new teki1(), 450, 300 );
        addObject( new teki1(), 800, 850 );
        addObject( new teki1(), 1300, 20 );
        addObject( new teki2(), 900, 260 );
        addObject( new teki2(), 1400, 500 );
        addObject( new teki2(), 500, 790 );
        /*for(int i=0;i<4;i++){
            int A = 0;
            int B = 1650;
            int x = A + (int)(Math.random()*((B-A)+1));
            A = 0;
            B = 900;
            int y = A + (int)(Math.random()*((B-A)+1));
           addObject( new teki1(), x, y );
           
        }
        for(int i=0;i<3;i++){
            int A = 0;
            int B = 1650;
            int x = A + (int)(Math.random()*((B-A)+1));
            A = 0;
            B = 900;
            int y = A + (int)(Math.random()*((B-A)+1));
           addObject( new teki2(), x, y );
           
        }*/
    }
    
}
