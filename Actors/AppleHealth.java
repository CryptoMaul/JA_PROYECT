package Actors;

import mayflower.Actor;
import mayflower.MayflowerImage;

public class AppleHealth extends Actor {

    public AppleHealth(){
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Items/Fruits/Apple.png");
        img.scale(30, 32);

        setImage(img);
    }
    @Override
    public void act() {
        if(this.isTouching(Drake.class)){
            getWorld().removeObject(this);
        }
    }
}
