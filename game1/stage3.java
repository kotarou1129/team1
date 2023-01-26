import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stage3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stage3 extends World
{
    private int time = 1000;
    /**
     * Constructor for objects of class stage3.
     * 
     */
    public stage3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1650, 900, 1); 
        addObject( new syagi(), 825, 450 );
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
        showText( ""+time, 825, 450 );
        if(time == 0){
            GreenfootImage title = new GreenfootImage("ステージ３", 120, Color.RED, new Color(0, 0, 0, 0));
            getBackground().drawImage(title, (getWidth()-title.getWidth())/2, 550);
            GreenfootImage title2 = new GreenfootImage("完", 300, Color.RED, new Color(0, 0, 0, 0));
            getBackground().drawImage(title2, 710, (getHeight()-title.getHeight())/4);
            
            Greenfoot.stop();
        }
    }
}
