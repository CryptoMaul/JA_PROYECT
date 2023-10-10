package Utils;

import Levels.IntroWorld;
import mayflower.Mayflower;

public class StartMayflower extends Mayflower {
    public StartMayflower(){
        super("project", 970, 778);
        Mayflower.showBounds(true);
    }

    @Override
    public void init() {
        Mayflower.setFullScreen(false);
        IntroWorld w =  new IntroWorld();
        Mayflower.setWorld(w);
    }
}
