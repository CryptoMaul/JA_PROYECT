package Levels;

import Actors.IntroButton;
import mayflower.Mayflower;
import mayflower.World;

//Title screen to start game
public class IntroWorld extends World {

    IntroButton b;

    public IntroWorld(){

        b = new IntroButton();
        setBackground("Pixel Adventure 1/IntroBackground.png");
        addObject(b, 420, 470);

        Mayflower.playMusic("Pixel Adventure 1/drake2.mp3");
    }

    @Override
    public void act() {
        if(b.isClicked()){
            Mayflower.stopMusic("Pixel Adventure 1/drake2.mp3");
            Mayflower.setWorld(new LevelViews());
        }
    }
}
