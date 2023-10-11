package Actors.Ground;

import mayflower.*;

//Brown stone ground for one of our levels
public class BrownStone extends Ground {

    public BrownStone(){
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Terrain/BrownStone.png");
        img.scale(48, 48);

        setImage(img);

    }

    @Override
    public void act() {

    }
}
