import mayflower.*;

public class JackAnimatedActor extends AnimatedActor{
    private Animation walk;
    public JackAnimatedActor() 
    {
        String[] arr = new String[7];
        for(int i = 0; i < 7; i++){
            arr[i] = "img/jack/Walk (" + (i+1) + ").png";
        }
        walk = new Animation(50, arr);
        setAnimation(walk);
        walk.setTransparency(70);
        walk.setScale(125, 109);
    }
    public void act()
    {
        super.act();
    }
}