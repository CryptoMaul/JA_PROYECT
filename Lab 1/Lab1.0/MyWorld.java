import mayflower.*;

public class MyWorld extends World{
    public MyWorld(){
        setBackground("img/bluebonnets.jpg");
        Cat a = new Cat();
        Dog b = new Dog();
        Yarn c = new Yarn();
        Yarn d = new Yarn();
        Yarn e = new Yarn();
        addObject(a, 400, 300);
        addObject(b, 200, 150);
        addObject(c, 600, 150);
        addObject(d, 200, 450);
        addObject(e, 600, 450);
    }
    public void act(){
        
    }
}