import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZombieWorld extends World
{

    /**
     * Constructor for objects of class ZWorld.
     * 
     */
    public ZombieWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1150, 950, 1); 
    }
    public void prepare(){
        ZombieHunter hunter = new ZombieHunter();
        addObject(hunter, 387, 127);
    
    }
}
