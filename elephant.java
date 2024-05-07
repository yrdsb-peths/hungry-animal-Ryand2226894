import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant the hero
 * 
 * @author Ryan
 * @version  2024
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
            
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(+1);
        }
    }
}
