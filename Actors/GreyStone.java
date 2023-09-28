package Actors;

import mayflower.*;
public class GreyStone extends Ground{

    @Override
    public void act() {
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Terrain/GreyStone.png");
        img.scale(48, 48);
        setImage(img);
    }
}
