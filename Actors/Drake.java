package Actors;

import Utils.Animation;
import Utils.MoveableAnimatedDrake;
import mayflower.Mayflower;
import mayflower.World;

import java.util.Arrays;

public class Drake extends MoveableAnimatedDrake {

    public static int health = 3;

    public Drake(){

        String[] idleRightArray = new String[11];
        for(int i = 0; i<idleRightArray.length; i++){
            idleRightArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Idle/Idle_"+(i+1)+".png";
        }
        Animation idleRightAnimation = new Animation(50, idleRightArray);
        idleRightAnimation.setScale(40, 40);


        String[] idleLeftArray = new String[11];
        for(int i = 0; i<idleLeftArray.length; i++){
            idleLeftArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Idle/Idle_"+(i+1)+".png";
        }
        Animation idleLeftAnimation = new Animation(50, idleLeftArray);
        idleLeftAnimation.setScale(40, 40);
        idleLeftAnimation.mirrorHorizontally();

        String[] runRightArray = new String[12];
        for(int i = 0; i<runRightArray.length; i++){
            runRightArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Run/Run_"+(i+1)+".png";
        }
        Animation runRightAnimation = new Animation(50, runRightArray);
        runRightAnimation.setScale(40, 40);

        String[] runLeftArray = new String[12];
        for(int i = 0; i<runLeftArray.length; i++){
            runLeftArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Run/Run_"+(i+1)+".png";
        }
        Animation runLeftAnimation = new Animation(50, runLeftArray);
        runLeftAnimation.setScale(40, 40);
        runLeftAnimation.mirrorHorizontally();

        String[] jumpRightArray = new String[1];
        Arrays.fill(jumpRightArray, "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Jump (32x32).png");
        Animation jumpRightAnimation = new Animation(50, jumpRightArray);
        jumpRightAnimation.setScale(64, 64);

        String[] jumpLeftArray = new String[1];
        Arrays.fill(jumpLeftArray, "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Jump (32x32).png");
        Animation jumpLeftAnimation = new Animation(50, jumpLeftArray);
        jumpLeftAnimation.setScale(64, 64);
        jumpLeftAnimation.mirrorHorizontally();

        String[] fallRightArray = new String[1];
        Arrays.fill(fallRightArray, "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Fall (32x32).png");
        Animation fallRightAnimation = new Animation(50, fallRightArray);
        fallRightAnimation.setScale(64, 64);

        String[] fallLeftArray = new String[1];
        Arrays.fill(fallLeftArray, "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Fall (32x32).png");
        Animation fallLeftAnimation = new Animation(50, fallLeftArray);
        fallLeftAnimation.setScale(64, 64);
        fallLeftAnimation.mirrorHorizontally();


        setWalkRightAnimation(runRightAnimation);
        setWalkLeftAnimation(runLeftAnimation);
        setIdleRightAnimation(idleRightAnimation);
        setIdleLeftAnimation(idleLeftAnimation);
        setJumpRightAnimation(jumpRightAnimation);
        setJumpLeftAnimation(jumpLeftAnimation);
        setFallLeft(fallLeftAnimation);
        setFallRight(fallRightAnimation);
    }

    @Override
    public void act() {
        super.act();

        if(this.isTouching(Enemy.class)){
            health--;
            System.out.println(health);
            //Mayflower.playSound();
        }

        if(this.isTouching(AppleHealth.class)){
            health++;
        }


    }
}
