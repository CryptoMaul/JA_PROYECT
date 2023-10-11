package Utils;

import Levels.IntroWorld;
import mayflower.Mayflower;

//Creating the screen using the MayFlower library
public class StartMayflower extends Mayflower {
    public StartMayflower(){
        //Screen created with width of 970 pixels of width and 778 pixels of height
        super("project", 970, 778);
    }

    //Setting IntroWorld as the first world to be in used
    @Override
    public void init() {
        Mayflower.setFullScreen(false);
        IntroWorld w =  new IntroWorld();
        Mayflower.setWorld(w);
    }
}
