package Levels;

import Actors.Drake;
import mayflower.*;

public class TitleScreen extends World {


    @Override
    public void act() {
        setBackground("testBackground/download.jpg");
        Drake d = new Drake();

        addObject(d, 143,43);
    }
}
