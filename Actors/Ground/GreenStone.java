package Actors.Ground;

import mayflower.Mayflower;
import mayflower.MayflowerImage;

//Green stone ground class
public class GreenStone extends Ground{

    public GreenStone(){
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Terrain/GreenScales.png");
        img.scale(48, 48);
        setImage(img);

    }

    @Override
    public void act() {
        super.act();
    }
}
