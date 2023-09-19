import mayflower.*;


public class MyWorld extends World {

    private Cat cat;
    private DogAnimatedActor dog;
    private JackAnimatedActor jack;
    private NinjaAnimatedActor ninja;
    
    public MyWorld() 
    {
        setBackground("img/BG/BG.png");
        
        cat = new Cat();
        dog = new DogAnimatedActor();
        jack = new JackAnimatedActor();
        ninja = new NinjaAnimatedActor();
        
        addObject(cat, 100, 100);
        addObject(dog, 541, 400);
        addObject(jack, 503, 123);
        addObject(ninja, 374, 177);
    }
    
    public void act()
    {
    }
    
}