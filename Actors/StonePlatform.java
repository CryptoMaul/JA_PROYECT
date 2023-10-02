package Actors;

import mayflower.MayflowerImage;

public class StonePlatform extends Ground{

    public StonePlatform(){
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Terrain/StonePlatform.png");
        img.scale(48, 5);
        System.out.println("work");
        setImage(img);
    }

    @Override
    public void act() {

    }
}
