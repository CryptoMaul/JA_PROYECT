package Actors;

import mayflower.Actor;
import mayflower.MayflowerImage;

public class Token extends Actor {
    public static int count;

    public Token(){
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Other/Dust Particle.png");
        img.scale(32, 32);

        setImage(img);
    }

    @Override
    public void act() {
        if(this.isTouching(Drake.class)){
            count--;
            getWorld().removeObject(this);
        }
    }
}
