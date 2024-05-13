import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant the hero
 * 
 * @author Ryan
 * @version  2024
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    
public Elephant()
{
    for(int i = 0; i < 8; i++)
    {
        idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
        idle[i].scale(100, 100);
    }
    setImage(idle[0]); 
}
int imageIndex = 0;

public void animateElephant()
{
    setImage(idle[imageIndex]);
    imageIndex = (imageIndex + 1) % idle.length;
}

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
        animateElephant();
        
    }
    
    public void eat()
    {
        if(isTouching(Pie.class))
        {
        removeTouching(Pie.class);
        MyWorld World = (MyWorld) getWorld();
        World.createPie();
        World.increaseScore();
        elephantSound.play();
        }   
    }
}
