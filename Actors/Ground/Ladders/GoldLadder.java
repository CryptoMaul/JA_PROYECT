package Actors.Ground.Ladders;

import mayflower.MayflowerImage;

//Gold ladder class
public class GoldLadder extends Ladder{

    public GoldLadder(){
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Terrain/GoldLadder.png");
        img.scale(48, 48);
        setImage(img);
    }

    public void act(){

    }

}
