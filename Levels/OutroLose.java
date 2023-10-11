package Levels;

import Actors.IntroButton;
import mayflower.Mayflower;
import mayflower.World;

//Game over lose screen
public class OutroLose extends World {

    IntroButton b;
    public OutroLose(){
        b = new IntroButton();
        setBackground("Pixel Adventure 1/OutroLose.png");
        addObject(b, 420, 470);
        Mayflower.playMusic("Pixel Adventure 1/drake2.mp3");
    }

    @Override
    public void act() {
        if(b.isClicked()){
            Mayflower.setWorld(new LevelViews());
        }
    }

}
