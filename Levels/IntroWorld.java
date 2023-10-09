package Levels;

import Actors.IntroButton;
import mayflower.Mayflower;
import mayflower.World;

public class IntroWorld extends World {

    IntroButton b;

    public IntroWorld(){
        b = new IntroButton();
        setBackground("Pixel Adventure 1/IntroBackground.png");
        addObject(b, 420, 470);
    }

    @Override
    public void act() {
        if(b.isClicked()){
            Mayflower.setWorld(new LevelViews());
        }
    }
}
