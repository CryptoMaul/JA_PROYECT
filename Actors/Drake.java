package Actors;

import Utils.Animation;
import Utils.MoveableAnimatedDrake;

import java.util.Arrays;

public class Drake extends MoveableAnimatedDrake {

    public Drake(){

        String[] idleRightArray = new String[11];
        for(int i = 0; i<idleRightArray.length; i++){
            idleRightArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Idle/Idle_"+(i+1)+".png";
        }
        Animation idleRightAnimation = new Animation(50, idleRightArray);
        idleRightAnimation.setScale(64, 64);


        String[] idleLeftArray = new String[11];
        for(int i = 0; i<idleLeftArray.length; i++){
            idleLeftArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Idle/Idle_"+(i+1)+".png";
        }
        Animation idleLeftAnimation = new Animation(50, idleLeftArray);
        idleLeftAnimation.setScale(64, 64);
        idleLeftAnimation.mirrorHorizontally();

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

        String[] jumpArray = new String[1];
        Arrays.fill(jumpArray, "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Jump (32x32).png");
        Animation jumpAnimation = new Animation(50, jumpArray);
        jumpAnimation.setScale(64, 64);
        jumpAnimation.mirrorHorizontally();

        setWalkRightAnimation(runRightAnimation);
        setWalkLeftAnimation(runLeftAnimation);
        setIdleRightAnimation(idleRightAnimation);
        setIdleLeftAnimation(idleLeftAnimation);
        setJumpAnimation(jumpAnimation);
    }

    @Override
    public void act() {
        super.act();
    }
}
