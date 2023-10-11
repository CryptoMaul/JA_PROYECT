package Actors;

import mayflower.MayflowerImage;

//Spike trap class, logic is in the DrakeMovableActor class
public class Spike extends Enemy{

    public Spike(){
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Traps/Spikes/Idle.png");
        img.scale(48, 24);

        setImage(img);
    }

    @Override
    public void act() {

    }
}
