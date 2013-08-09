import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poop extends Actor
{
    /**
     * Act - do whatever the Poop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (hitGround)
        {
            delay = delay - 1;
            if (delay == 0)
            getWorld().removeobject(this);
        }
    }

    else if ( altitude > 10)
        { scale();
        }
        else
        {
            turnToSplat();
            hitGround = true;
        }
    }    
    
    public void()
    {altitude = =altitude - 1;
        getImage().scale(altitude / 4, altitude / 4);
    }
}
