package Utils;

import mayflower.*;

//Animated actor from lab that sets animations based on what setAnimation gets as a parameter
public class AnimatedActor extends GravityActor{
    private Animation animation;
    private final Timer timer = new Timer(1000);
    public void setAnimation(Animation a){
        animation=a;
    }
    public void act(){
        if(animation!=null){
            if(timer.isDone()){
                timer.reset();
                MayflowerImage frame = animation.getNextFrame();
                setImage(frame);
                super.act();
            }
        }
    }
}