import mayflower.*;

public class NinjaAnimatedActor extends AnimatedActor{
    private Animation walk;
    public NinjaAnimatedActor() 
    {
        String[] arr = new String[9];
        for(int i = 0; i < 9; i++){
            arr[i] = "img/ninjagirl/Slide__00" + (i+1) + ".png";
        }
        walk = new Animation(50, arr);
        setAnimation(walk);
        walk.setTransparency(85);
        walk.setScale(75,66);
    }
    public void act()
    {
        super.act();
    }
}