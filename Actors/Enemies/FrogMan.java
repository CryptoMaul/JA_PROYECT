package Actors.Enemies;

import Utils.Animation;
import Utils.EnemyAnimatedActor;

//Frog enemy class
public class FrogMan extends EnemyAnimatedActor {

    //constant scale
    private final int SCALE = 40;

    //setting animations and images in the constructor
    public FrogMan(){
        String[] runRightArray = new String[12];
        for(int i = 0; i<runRightArray.length; i++){
            runRightArray[i] = "Pixel Adventure 1/Assets/Main Characters/Ninja Frog/Run/Run_"+(i+1)+".png";
        }
        Animation runRightAnimation = new Animation(50, runRightArray);
        runRightAnimation.setScale(SCALE, SCALE);

        String[] runLeftArray = new String[12];
        for(int i = 0; i<runLeftArray.length; i++){
            runLeftArray[i] = "Pixel Adventure 1/Assets/Main Characters/Ninja Frog/Run/Run_"+(i+1)+".png";
        }
        Animation runLeftAnimation = new Animation(50, runLeftArray);
        runLeftAnimation.mirrorHorizontally();
        runLeftAnimation.setScale(SCALE, SCALE);

        setRunLeft(runLeftAnimation);
        setRunRight(runRightAnimation);
    }

    //act method is the parent act method in EnemyAnimatedActor
    @Override
    public void act() {
        super.act();
    }
}
