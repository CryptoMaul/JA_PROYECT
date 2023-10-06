package Actors;


import mayflower.Actor;
import mayflower.MayflowerImage;

public class GreyStoneFake extends FakePlatform {

    public GreyStoneFake(){
        MayflowerImage img = new MayflowerImage("Pixel Adventure 1/Assets/Terrain/GreyStoneFake.png");
        img.scale(48, 42);

        setImage(img);
    }

    @Override
    public void act() {

    }
}
