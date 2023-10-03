package Actors;

import mayflower.MayflowerImage;

public class Spike extends Enemy{

    public Spike(){
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Traps/Spikes/Idle.png");
        img.scale(48, 48);

        setImage(img);
    }

    @Override
    public void act() {

    }
}
