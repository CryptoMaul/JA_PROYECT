package Actors;

import Utils.Animation;
import Utils.MoveableAnimatedDrake;
import mayflower.Mayflower;
import mayflower.World;

import java.util.Arrays;

public class Drake extends MoveableAnimatedDrake {

    public static int health = 3;
    int x = 32;


    public Drake(){

        String[] idleRightArray = new String[11];
        for(int i = 0; i<idleRightArray.length; i++){
            idleRightArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Idle/Idle_"+(i+1)+".png";
        }
        Animation idleRightAnimation = new Animation(50, idleRightArray);
        idleRightAnimation.setScale(x, x);


        String[] idleLeftArray = new String[11];
        for(int i = 0; i<idleLeftArray.length; i++){
            idleLeftArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Idle/Idle_"+(i+1)+".png";
        }
        Animation idleLeftAnimation = new Animation(50, idleLeftArray);
        idleLeftAnimation.setScale(x, x);
        idleLeftAnimation.mirrorHorizontally();

        String[] runRightArray = new String[12];
        for(int i = 0; i<runRightArray.length; i++){
            runRightArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Run/Run_"+(i+1)+".png";
        }
        Animation runRightAnimation = new Animation(50, runRightArray);
        runRightAnimation.setScale(x, x);

        String[] runLeftArray = new String[12];
        for(int i = 0; i<runLeftArray.length; i++){
            runLeftArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Run/Run_"+(i+1)+".png";
        }
        Animation runLeftAnimation = new Animation(50, runLeftArray);
        runLeftAnimation.setScale(x, x);
        runLeftAnimation.mirrorHorizontally();

        String[] jumpRightArray = new String[1];
        Arrays.fill(jumpRightArray, "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Jump (32x32).png");
        Animation jumpRightAnimation = new Animation(50, jumpRightArray);
        jumpRightAnimation.setScale(x, x);

        String[] jumpLeftArray = new String[1];
        Arrays.fill(jumpLeftArray, "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Jump (32x32).png");
        Animation jumpLeftAnimation = new Animation(50, jumpLeftArray);
        jumpLeftAnimation.setScale(x, x);
        jumpLeftAnimation.mirrorHorizontally();

        String[] fallRightArray = new String[1];
        Arrays.fill(fallRightArray, "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Fall (32x32).png");
        Animation fallRightAnimation = new Animation(50, fallRightArray);
        fallRightAnimation.setScale(x, x);

        String[] fallLeftArray = new String[1];
        Arrays.fill(fallLeftArray, "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Fall (32x32).png");
        Animation fallLeftAnimation = new Animation(50, fallLeftArray);
        fallLeftAnimation.setScale(x, x);
        fallLeftAnimation.mirrorHorizontally();

        String[] climbRightArray = new String[5];
        for(int i = 0; i<climbRightArray.length; i++){
            climbRightArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Climb/Climb_"+(i+1)+".png";
        }
        Animation climbRightAnimation = new Animation(50, climbRightArray);
        climbRightAnimation.setScale(x, x);

        String[] climbLeftArray = new String[5];
        for(int i = 0; i<climbLeftArray.length; i++){
            climbLeftArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Climb/Climb_"+(i+1)+".png";
        }
        Animation climbLeftAnimation = new Animation(50, climbLeftArray);
        climbLeftAnimation.setScale(x, x);
        climbLeftAnimation.mirrorHorizontally();


        setWalkRightAnimation(runRightAnimation);
        setWalkLeftAnimation(runLeftAnimation);
        setIdleRightAnimation(idleRightAnimation);
        setIdleLeftAnimation(idleLeftAnimation);
        setJumpRightAnimation(jumpRightAnimation);
        setJumpLeftAnimation(jumpLeftAnimation);
        setFallLeft(fallLeftAnimation);
        setFallRight(fallRightAnimation);
        setClimbRight(climbRightAnimation);
        setClimbLeft(climbLeftAnimation);
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

    @Override
    public boolean isDone() {
        return super.isDone();
    }
}
