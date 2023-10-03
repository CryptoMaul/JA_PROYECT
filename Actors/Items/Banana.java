package Actors.Items;

import Utils.Animation;
import Utils.CollectableAnimatedActor;

public class Banana extends CollectableAnimatedActor {

    public Banana(){
        String[] idleArray = new String[17];
        for(int i = 0; i<idleArray.length; i++){
            idleArray[i] = "Pixel Adventure 1/Assets/Items/Fruits/Banana/Banana_"+(i+1)+".png";
        }
        Animation idleAnimation = new Animation(50, idleArray);
        idleAnimation.setScale(48, 48);
        setIdle(idleAnimation);

        String[] collectedArray = new String[6];
        for(int i = 0; i<collectedArray.length; i++){
            collectedArray[i] = "Pixel Adventure 1/Assets/Items/Fruits/Collected/Collected_"+(i+1)+".png";
        }
        Animation collectedAnimation = new Animation(50, collectedArray);
        collectedAnimation.setScale(48, 48);
        setCollected(collectedAnimation);
    }

    @Override
    public void act() {
        super.act();
    }
}
