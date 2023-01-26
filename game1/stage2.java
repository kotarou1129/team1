
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stage2 extends World
{
    private int time = 1000;
    /**
     * Constructor for objects of class stage2.
     * 
     */
    public stage2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1650, 900, 1); 
        addObject( new farmer(), 825, 450 );
        addObject( new teki1(), 100, 100 );
        addObject( new teki2(), 400, 100 );
        for(int i=0;i<4;i++){
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
           
        }
    }
    public void act()
    {
        time--;
        showText( ""+time, 100, 100 );
        if(time == 0){
            GreenfootImage title = new GreenfootImage("Stage2", 80, Color.RED, new Color(0, 0, 0, 0));
            getBackground().drawImage(title, ((getWidth()-title.getWidth())/2), ((getHeight()-title.getHeight())/2)-350);            
            GreenfootImage endtitle = new GreenfootImage("完", 300, Color.RED, new Color(0, 0, 0, 0));
            getBackground().drawImage(endtitle, ((getWidth()-endtitle.getWidth())/2), ((getHeight()-endtitle.getHeight())/2));
            Greenfoot.stop();            
        }
    }
    
}
