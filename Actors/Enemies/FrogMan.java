package Actors.Enemies;

import Utils.Animation;
import Utils.EnemyAnimatedActor;

public class FrogMan extends EnemyAnimatedActor {

    int x = 40;

    public FrogMan(){
        String[] runRightArray = new String[12];
        for(int i = 0; i<runRightArray.length; i++){
            runRightArray[i] = "Pixel Adventure 1/Assets/Main Characters/Ninja Frog/Run/Run_"+(i+1)+".png";
        }
        Animation runRightAnimation = new Animation(50, runRightArray);
        runRightAnimation.setScale(x, x);

        String[] runLeftArray = new String[12];
        for(int i = 0; i<runLeftArray.length; i++){
            runLeftArray[i] = "Pixel Adventure 1/Assets/Main Characters/Ninja Frog/Run/Run_"+(i+1)+".png";
        }
        Animation runLeftAnimation = new Animation(50, runLeftArray);
        runLeftAnimation.mirrorHorizontally();
        runLeftAnimation.setScale(x, x);

        setRunLeft(runLeftAnimation);
        setRunRight(runRightAnimation);
    }

    @Override
    public void act() {
        super.act();
    }
}
