package Actors;

import Utils.Animation;
import Utils.MoveableAnimatedDrake;
import mayflower.Mayflower;
import mayflower.World;

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

        setWalkRightAnimation(runRightAnimation);
        setWalkLeftAnimation(runLeftAnimation);
        setIdleRightAnimation(idleRightAnimation);
        setIdleLeftAnimation(idleLeftAnimation);
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
