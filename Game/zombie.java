import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zombie extends Actor
{   int health = 100;
    /**
     * Act - do whatever the zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkForBurn();
        checkForDeath();
    }    
    public void checkForBurn(){
        if (isTouching(Bullet.class)){
            health = health - 10;        
        }
    }    
    public void checkForDeath(){
        if (health <= 0){
            
        }
    }
}
