package Utils;

import Actors.Drake;
import mayflower.Mayflower;
import mayflower.Timer;

import java.util.TimerTask;

//This script is dedicated to the author of this forum post, who 20 years ago saved the world
//https://forums.oracle.com/ords/apexds/post/cannot-resolve-symbol-in-a-timer-please-help-1124

public class CollectableAnimatedActor extends AnimatedActor{
    private Animation idle;
    private Animation collected;
    private String currentAction = "idle";
    private java.util.Timer remove = new java.util.Timer();
    private boolean alreadyCollected = false;
    private removeTask rt = new removeTask();

    @Override
    public void act() {
        if(currentAction.equals("idle")){
            setAnimation(idle);
        }

        if(isCollected()){
            setAnimation(collected);
            currentAction = "collected";

            if(!alreadyCollected) {
                remove.schedule(rt, 500);
            }
            alreadyCollected = true;

        }


        super.act();
    }

    public void setIdle(Animation a){
        idle = a;
    }
    public void setCollected(Animation a){
        collected = a;
    }

    public boolean isCollected(){
        return this.isTouching(Drake.class);
    }

    public void setAnimation(Animation a) {
        super.setAnimation(a);
    }

    public CollectableAnimatedActor getClassForTimer(){
        return this;
    }

    private class removeTask extends TimerTask {
        @Override
        public void run() {
            getWorld().removeObject(getClassForTimer());
        }
    }

}


