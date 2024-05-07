import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * food for the hero(elephant)
 * 
 * @author Ryan
 * @version 2024
 */
public class Pie extends Actor
{
    /**
     * Act - do whatever the Pie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + 1);
    }
}
