import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public int click_flag = 0;

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
       if(click_flag==0){
           GreenfootImage title = new GreenfootImage("かけぬけろ！せいきまつ！！", 120, Color.RED, new Color(0, 0, 0, 0));
           getBackground().drawImage(title, (getWidth()-title.getWidth())/2, (getHeight()-title.getHeight())/2);
           GreenfootImage disc = new GreenfootImage("開始するにはEnterを押してください...", 60, Color.YELLOW, new Color(0, 0, 0, 0));
           getBackground().drawImage(disc, (getWidth()-disc.getWidth())/2, (getHeight()-disc.getHeight())/2+200);
           
           if(Greenfoot.isKeyDown( "enter" )){
               click_flag=1;
               World select1 = new Select();
               Greenfoot.setWorld( select1 );
            }
       } 


       //noumin
<<<<<<< HEAD
       
       
=======
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

>>>>>>> 2e9095b9f4db6a19a4b253c1b1f9e5bf0dc12ad7
    }
    
    
}
