package Utils;

import Levels.LevelViews;
import Levels.TitleScreen;
import mayflower.Mayflower;

public class StartMayflower extends Mayflower {
    public StartMayflower(){
        super("project", 960, 768);
    }

    @Override
    public void init() {
        Mayflower.setFullScreen(false);
        TitleScreen w =  new TitleScreen();
        LevelViews views = new LevelViews();
        Mayflower.setWorld(views);
    }
}
