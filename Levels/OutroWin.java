package Levels;

import mayflower.Mayflower;
import mayflower.World;

//Game over win screen
public class OutroWin extends World {

    public OutroWin(int s){
        setBackground("Pixel Adventure 1/OutroWin.png");
        showText(String.valueOf(s), 600, 370);
        Mayflower.playMusic("Pixel Adventure 1/drake2.mp3");
    }

    @Override
    public void act() {

    }
}
