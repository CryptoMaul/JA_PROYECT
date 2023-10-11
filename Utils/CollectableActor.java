package Utils;

import mayflower.Actor;
import mayflower.MayflowerImage;
import mayflower.Timer;

//Actor for all collectables
public class CollectableActor extends Actor {

    private Animation animation;
    private final Timer timer = new Timer(1000);
    public void setAnimation(Animation a){
        animation=a;
    }
    public void act(){
        if(animation!=null){
            //Use a timer to change the time to go through each frame
            if(timer.isDone()){
                timer.reset();
                MayflowerImage frame = animation.getNextFrame();
                setImage(frame);
            }
        }
    }
}
