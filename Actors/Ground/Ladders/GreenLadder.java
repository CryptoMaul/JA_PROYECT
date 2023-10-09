package Actors.Ground.Ladders;

import mayflower.MayflowerImage;

public class GreenLadder extends Ladder{

    public GreenLadder(){
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Terrain/GreenLadder.png");
        img.scale(48, 48);
        setImage(img);
    }

    public void act(){

    }

}
