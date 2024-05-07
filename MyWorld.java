import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the world is where our hero lives
 * 
 * @author Ryan dutton
 * @version 2024
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        createPie();
    }
    
    public  void createPie()
    {
       Pie pie = new Pie();
       int x = Greenfoot.getRandomNumber(600);
       int y = 0;
    addObject(pie, x, y); 
    }
}
