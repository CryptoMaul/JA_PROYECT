package Actors.Ground;


import mayflower.MayflowerImage;

//Fake platform used in all levels
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
