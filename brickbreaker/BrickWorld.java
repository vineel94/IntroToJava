import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BrickWorld extends World
{
    private ScoreCounter counter;

    /**
     * Constructor for the BrickWorld.
     */
    public BrickWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        // Add the default beginning objects to the world.
        prepare();
    }

    /**
     * Tells the ScoreCounter object in the BrickWorld to add an amount to the score.
     */
    public void addScore(int amount)
    {
        counter.addScore(amount);
    }

    /**
     * Creates the bricks for this world.
     */
    public void createBricks()
    {
        int x = 50;
        int y = 50;
        
        while ( y < 200 )
        {
        
        while ( x < 400 )
        {
            addObject(new RedBrick(), x, y);
            x = x + 50;

        }
        y = y + 30;
        x = 50;

        
    }
}

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        // Create the paddle.
        Paddle paddle = new Paddle();
        addObject(paddle, 200, 550);
        paddle.spawnBall();
        // Create the score counter.
        counter = new ScoreCounter();
        addObject(counter, 100, 0); 
        // Create the bricks
        createBricks();
    }
}
