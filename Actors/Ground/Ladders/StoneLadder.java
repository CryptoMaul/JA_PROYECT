package Actors.Ground.Ladders;

import mayflower.MayflowerImage;

//Stone lader class
public class StoneLadder extends Ladder{

    public StoneLadder(){
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Terrain/StoneLadder.png");
        img.scale(48, 48);
        setImage(img);
    }

    public void act(){

    }

}
