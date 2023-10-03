package Actors;

import mayflower.Actor;
import mayflower.MayflowerImage;

public class SpikeUpSideDown extends Actor {

    public SpikeUpSideDown(){
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Traps/Spikes/Idle.png");
        img.scale(48, 48);
        img.rotate(180);

        setImage(img);
    }
    @Override
    public void act() {

    }
}
