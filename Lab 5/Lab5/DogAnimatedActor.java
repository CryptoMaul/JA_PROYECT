import mayflower.*;

public class DogAnimatedActor extends AnimatedActor{
    private Animation walk;
    public DogAnimatedActor() 
    {
        String[] arr = new String[10];
        for(int i = 0; i < 10; i++){
            arr[i] = "img/dog/Walk (" + (i+1) + ").png";
        }
        walk = new Animation(50, arr);
        setAnimation(walk);
    }
    public void act()
    {
        super.act();
    }
}