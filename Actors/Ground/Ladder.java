package Actors.Ground;

import mayflower.Actor;
import mayflower.MayflowerImage;

public class Ladder extends Actor {

    public Ladder(){
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Terrain/Ladder.png");
        img.scale(48, 48);
        setImage(img);
    }

    @Override
    public void act() {

    }
}