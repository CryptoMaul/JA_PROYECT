package Utils;

import Levels.LevelTwo;
import Levels.LevelViews;
import Levels.TitleScreen;
import mayflower.Keyboard;
import mayflower.Mayflower;

public class StartMayflower extends Mayflower {
    public StartMayflower(){
        super("project", 970, 778);
        Mayflower.showBounds(true);
    }

    @Override
    public void init() {
        Mayflower.setFullScreen(false);
        TitleScreen w =  new TitleScreen();
        LevelViews views = new LevelViews();
        LevelTwo viewTwo = new LevelTwo();
        Mayflower.setWorld(views);


    }
}
