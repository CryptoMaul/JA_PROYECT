package Actors;

import Utils.Animation;
import Utils.GravityActor;
import mayflower.Actor;

public class Drake extends GravityActor {

    public Drake(){
        String[] idleArray = new String[11];
        for(int i = 0; i<idleArray.length; i++){
            idleArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Idle/Idle_"+(i+1)+".png";
        }
        Animation idleAnimation = new Animation(50, idleArray);
        idleAnimation.setScale(64, 64);

        String[] runRightArray = new String[12];
        for(int i = 0; i<runRightArray.length; i++){
            runRightArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Run/Run_"+(i+1)+".png";
        }
        Animation runRightAnimation = new Animation(50, runRightArray);
        runRightAnimation.setScale(64, 64);

        String[] runLeftArray = new String[12];
        for(int i = 0; i<runLeftArray.length; i++){
            runLeftArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Run/Run_"+(i+1)+".png";
        }
        Animation runLeftAnimation = new Animation(50, runLeftArray);
        runLeftAnimation.setScale(64, 64);
        runLeftAnimation.mirrorHorizontally();
    }

    @Override
    public void act() {
        super.act();
    }
}
