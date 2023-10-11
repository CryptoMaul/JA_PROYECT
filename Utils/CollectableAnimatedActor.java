package Utils;

import Actors.Drake;
import mayflower.Color;

import java.util.TimerTask;

//This script is dedicated to the author of this forum post, who 20 years ago saved the world
//https://forums.oracle.com/ords/apexds/post/cannot-resolve-symbol-in-a-timer-please-help-1124

//Child class of CollectableActor to change the animation and have special animations when collected
public class CollectableAnimatedActor extends CollectableActor {
    private Animation idle;
    private Animation collected;
    private String currentAction = "idle";
    private java.util.Timer remove = new java.util.Timer();
    private boolean alreadyCollected = false;
    private removeTask rt = new removeTask();
    protected Drake superDrake;

    public CollectableAnimatedActor(Drake d){
        superDrake = d;
    }


    @Override
    public void act() {
        if(currentAction.equals("idle")){
            setAnimation(idle);
        }

        if(isCollected()){
            setAnimation(collected);
            currentAction = "collected";

            if(!alreadyCollected) {
                superDrake.incrementScore();
                this.getWorld().showText("Score : " + superDrake.getScore(), 20 , 60, 80, Color.WHITE);
                //The object doesn't immediately disapear after being touched by the Drake class, but only after 500 milliseconds
                remove.schedule(rt, 500);
            }
            alreadyCollected = true;
        }

        super.act();
    }
//Set methods for animations
    public void setIdle(Animation a){
        idle = a;
    }
    public void setCollected(Animation a){
        collected = a;
    }

    /*public boolean isAlreadyCollected(){
        return !currentAction.equals("idle");
    }*/

    public boolean isCollected(){
        return this.isTouching(Drake.class);
    }

    public void setAnimation(Animation a) {
        super.setAnimation(a);
    }

    public CollectableAnimatedActor getClassForTimer(){
        return this;
    }

    //Private internal class for the java.util.Timer timer task
    private class removeTask extends TimerTask {
        @Override
        public void run() {
            getWorld().removeObject(getClassForTimer());
        }
    }

    protected void setDrake(Drake d){superDrake = d;}

}


