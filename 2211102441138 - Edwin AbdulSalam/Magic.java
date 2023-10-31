import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Magic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magic extends Food
{
    Random r = new Random();
    /**
     * Act - do whatever the Magic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        while(getOneIntersectingObject(Body.class)!=null)setLocation(r.nextInt(MyWorld.getMyWidth()), r.nextInt(MyWorld.getMyHeight()));
    }
}