package Levels;

import Actors.Drake;
import mayflower.*;

public class TitleScreen extends World {

    public TitleScreen(){
        Drake drake = new Drake();
        addObject(drake, 100, 100);
    }

    @Override
    public void act() {
        //setBackground("testBackground/download.jpg");




    }
}
