import mayflower.*;

public class Cat extends AnimatedActor
{
    private Animation walk;
    public Cat() 
    {
        String[] arr = new String[10];
        for(int i = 0; i < 10; i++){
            arr[i] = "img/cat/Walk (" + (i+1) + ").png";
        }
        walk = new Animation(50, arr);
        setAnimation(walk);
        walk.setTransparency(50);
    }
    public void act()
    {
        super.act();
    }
}
