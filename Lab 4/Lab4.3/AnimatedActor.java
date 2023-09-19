import mayflower.*;

public class AnimatedActor extends Actor{
    private Animation walk;
    private Timer animationTimer = new Timer(100000000);
    public void setAnimation(Animation a){
        walk = a;
    }
    public void act(){
        if(animationTimer.isDone()){
            animationTimer.reset();
            MayflowerImage img = walk.getNextFrame();
            setImage(img);
        }
    }
}