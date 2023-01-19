import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Select here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Select extends World
{
    private int timecount = 1000;
    public int click_flag = 0;
    /**
     * Constructor for objects of class Select.
     * 
     */
    public Select()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels

       super(1650, 900, 1);
       
       GreenfootImage title = new GreenfootImage("キャラクターを選択してください...", 80, Color.MAGENTA, new Color(0, 0, 0, 0));
       getBackground().drawImage(title, ((getWidth()-title.getWidth())/2), ((getHeight()-title.getHeight())/2)-350);
       GreenfootImage drawedImage1 = new GreenfootImage("komebukuro_man-removebg-preview (1).png");
       GreenfootImage name = new GreenfootImage("    市民         農民     シャギ様", 60, Color.RED, new Color(0, 0, 0, 0));
       getBackground().drawImage(name, (getWidth()-name.getWidth())/2, (getHeight()-name.getHeight())/2-100);//the image that is drawed;
       getBackground().drawImage(drawedImage1,((getWidth()-drawedImage1.getWidth())/2)-210,((getHeight()-drawedImage1.getHeight())/2)+80);
       GreenfootImage drawedImage2 = new GreenfootImage("war_noumin_ikki-removebg-preview.png");//the image that is drawed;
       getBackground().drawImage(drawedImage2,((getWidth()-drawedImage2.getWidth())/2),((getHeight()-drawedImage2.getHeight())/2)+80);
       GreenfootImage drawedImage3 = new GreenfootImage("seikimatsu_man-removebg-preview.png");//the image that is drawed;
       getBackground().drawImage(drawedImage3,((getWidth()-drawedImage3.getWidth())/2)+210,((getHeight()-drawedImage3.getHeight())/2)+80);
       GreenfootImage disc = new GreenfootImage("Press:1   Press:2   Press:3", 60, Color.ORANGE, new Color(0, 0, 0, 0));
       getBackground().drawImage(disc, (getWidth()-disc.getWidth())/2, (getHeight()-disc.getHeight())/2+200);
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
