package Actors;

import Actors.Enemies.SmasherAnimatedActor;
import Utils.Animation;
import Utils.MoveableAnimatedDrake;

import java.util.Arrays;

//Main playable character
public class Drake extends MoveableAnimatedDrake {

    //Setting the health
    public static int health = 3;
    private final int SCALE = 32;

    //Setting all the animations in the constructor from images
    public Drake() {
        String[] idleRightArray = new String[11];
        for (int i = 0; i < idleRightArray.length; i++) {
            idleRightArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Idle/Idle_" + (i + 1) + ".png";
        }
        Animation idleRightAnimation = new Animation(50, idleRightArray);
        idleRightAnimation.setScale(SCALE, SCALE);


        String[] idleLeftArray = new String[11];
        for (int i = 0; i < idleLeftArray.length; i++) {
            idleLeftArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Idle/Idle_" + (i + 1) + ".png";
        }
        Animation idleLeftAnimation = new Animation(50, idleLeftArray);
        idleLeftAnimation.setScale(SCALE, SCALE);
        idleLeftAnimation.mirrorHorizontally();

        String[] runRightArray = new String[12];
        for (int i = 0; i < runRightArray.length; i++) {
            runRightArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Run/Run_" + (i + 1) + ".png";
        }
        Animation runRightAnimation = new Animation(50, runRightArray);
        runRightAnimation.setScale(SCALE, SCALE);

        String[] runLeftArray = new String[12];
        for (int i = 0; i < runLeftArray.length; i++) {
            runLeftArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Run/Run_" + (i + 1) + ".png";
        }
        Animation runLeftAnimation = new Animation(50, runLeftArray);
        runLeftAnimation.setScale(SCALE, SCALE);
        runLeftAnimation.mirrorHorizontally();

        String[] jumpRightArray = new String[1];
        Arrays.fill(jumpRightArray, "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Jump (32x32).png");
        Animation jumpRightAnimation = new Animation(50, jumpRightArray);
        jumpRightAnimation.setScale(SCALE, SCALE);

        String[] jumpLeftArray = new String[1];
        Arrays.fill(jumpLeftArray, "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Jump (32x32).png");
        Animation jumpLeftAnimation = new Animation(50, jumpLeftArray);
        jumpLeftAnimation.setScale(SCALE, SCALE);
        jumpLeftAnimation.mirrorHorizontally();

        String[] fallRightArray = new String[1];
        Arrays.fill(fallRightArray, "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Fall (32x32).png");
        Animation fallRightAnimation = new Animation(50, fallRightArray);
        fallRightAnimation.setScale(SCALE, SCALE);

        String[] fallLeftArray = new String[1];
        Arrays.fill(fallLeftArray, "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Fall (32x32).png");
        Animation fallLeftAnimation = new Animation(50, fallLeftArray);
        fallLeftAnimation.setScale(SCALE, SCALE);
        fallLeftAnimation.mirrorHorizontally();

        String[] climbRightArray = new String[5];
        for (int i = 0; i < climbRightArray.length; i++) {
            climbRightArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Climb/Climb_" + (i + 1) + ".png";
        }
        Animation climbRightAnimation = new Animation(50, climbRightArray);
        climbRightAnimation.setScale(SCALE, SCALE);


        String[] climbLeftArray = new String[5];
        for (int i = 0; i < climbLeftArray.length; i++) {
            climbLeftArray[i] = "Pixel Adventure 1/Assets/Main Characters/Virtual Guy/Climb/Climb_" + (i + 1) + ".png";
        }
        Animation climbLeftAnimation = new Animation(50, climbLeftArray);
        climbLeftAnimation.setScale(SCALE, SCALE);
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

    //Act is the same as the act in DrakeMovableActor
    @Override
    public void act() {

        super.act();
    }

    public boolean isDone() {
        return super.isDone();
    }

    public int getScore() {
        return super.getScore();
    }

    public int getLives() {
        return super.getLives();
    }
}
