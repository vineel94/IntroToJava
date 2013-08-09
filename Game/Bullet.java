import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{   
    public Bullet(){
        GreenfootImage image = getImage();
        image.scale(9,9);
    
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (atWorldEdge()){
               getWorld().removeObject(this);
           }
           else {
            }     
    }    
    public boolean atWorldEdge(){
        if (getX() < 10 || getX() >1190){
            return true;
        }
        if (getY() < 10 || getX() >1990){
            return true;
        }
        return false;
    }
}
