package Levels;

import Actors.Drake;
import Actors.GreyStone;
import mayflower.World;

public class LevelViews extends World {

    public LevelViews(){
        addGroundTiles();
        Drake drake = new Drake();
        addObject(drake, 100, 100);
    }

    @Override
    public void act() {

    }

    public void addGroundTiles(){
        String[][] levelSetup = LevelSetup.Views;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("gS")){
                    addObject(new GreyStone(), j*48, i*48);
                }
            }
        }
    }
}