import mayflower.*;


public class MyWorld extends World {

    private Cat cat;
    
    public MyWorld() 
    {
        setBackground("img/BG/BG.png");
        cat = new Cat();
        
        Block block = new Block();
        Block block2 = new Block();
        addObject(block,400,500);
        addObject(block2,528,372);
        addObject(cat, 400, 100);
        
        Mayflower.showBounds(true);
    }
    
    public void act()
    {
    }
    
}