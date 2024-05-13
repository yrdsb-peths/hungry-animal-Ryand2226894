import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant the hero
 * 
 * @author Ryan
 * @version  2024
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3)
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
        
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Pie.class))
        {
        removeTouching(Pie.class);
        MyWorld World = (MyWorld) getWorld();
        World.createPie();
        World.increaseScore();
        }   
    }
}
