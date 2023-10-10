package Actors;

import mayflower.Actor;
import mayflower.Mayflower;

import java.awt.event.ActionListener;

public class IntroButton extends Actor {

    public IntroButton(){
        setImage("Pixel Adventure 1/IntroButton.png");
    }

    @Override
    public void act() {
        if(Mayflower.mouseHovered(this)){
            setRotation(15);
        } else {
            setRotation(0);
        }
    }

    public boolean isClicked(){return Mayflower.mouseClicked(this);}
}
