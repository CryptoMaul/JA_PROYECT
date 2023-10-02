package Actors;

import mayflower.*;
public class GreyStone extends Ground{

    public GreyStone(){
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Terrain/GreyStone.png");
        img.scale(48, 48);

        setImage(img);

    }

    @Override
    public void act() {

    }
}
