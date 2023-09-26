package Utils;

import Levels.TitleScreen;
import mayflower.Mayflower;

public class StartMayflower extends Mayflower {
    public StartMayflower(){
        super("project", 800, 600);
    }

    @Override
    public void init() {
        Mayflower.setFullScreen(false);
        TitleScreen w =  new TitleScreen();
        Mayflower.setWorld(w);
    }
}
