import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZombieHunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZombieHunter extends Actor
{   int health = 200;
    public void act() 
    {
        checkKeys();
        CheckFireKeys(); 
        checkForZombieBite();        
    }    
    public void checkKeys(){
        if (Greenfoot.isKeyDown("up")){
        move (5);
        }
        if (Greenfoot.isKeyDown("left")){
        turn (-4);
        }
        if (Greenfoot.isKeyDown("right")){
        turn (4);
        }           
        if (Greenfoot.isKeyDown("down")){
        move (-3);
        }
        if (Greenfoot.isKeyDown("t")){
            setLocation(Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(1000) );
        }     
    }
    public void CheckFireKeys(){
         if (Greenfoot.isKeyDown("space")) {
            fireProjectile();
        }
    }
    public void fireProjectile(){
        Bullet bullet= new Bullet();
        World w = getWorld();
        w.addObject(bullet, getX(), getY());
        
        bullet.setRotation( getRotation() );
    }   
     public void checkForZombieBite()
    {
        Bullet bullet = (Bullet) getOneObjectAtOffset(10, 10, Bullet.class);
        if ( bullet != null ) {
            health = health - 10;
        }
    }
}
