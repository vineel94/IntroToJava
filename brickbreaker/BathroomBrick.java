import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class BathroomBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BathroomBrick extends Brick
{

    public BathroomBrick()
    {
       GreenfootImage image = new GreenfootImage(40, 20);
       image.setColor(Color.red);
       image.fillRect(0, 0, 40, 20);
       image.setColor(Color.black);
       image.setColor(Color.black);
       image.fillOval(10, 2, 20, 8);
       image.fillRect( 15, 9, 10, 8);
       
       
    }    
    
    public int getScoreValue()
    {
        return -1100;

} 
}