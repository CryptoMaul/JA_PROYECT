package Actors;

import Utils.Animation;
import Utils.CollectableAnimatedActor;

public class Banana extends CollectableAnimatedActor {

    public Banana(){
        String[] idleArray = new String[11];
        for(int i = 0; i<idleArray.length; i++){
            idleArray[i] = "Pixel Adventure 1/Assets/Items/Fruits/Banana/Banana_"+(i+1)+".png";
        }
        Animation idleAnimation = new Animation(50, idleArray);
        idleAnimation.setScale(32, 32);
        setIdle(idleAnimation);
    }

    @Override
    public void act() {
        super.act();
    }
}
