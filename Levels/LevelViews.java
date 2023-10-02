package Levels;

import Actors.*;
import mayflower.World;

public class LevelViews extends World {

    public LevelViews(){
        addGroundTiles();
        addPlatforms();
        addBananas();
        addSpikes();
        addSpikesUpside();
        Drake drake = new Drake();
        addObject(drake, 100, 100);
    }

    @Override
    public void act() {

    }

    public void addGroundTiles(){
        String[][] levelSetup = LevelSetup.ViewsLevelOne;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("gS")){
                    addObject(new GreyStone(), j*48, i*48);
                }
            }
        }
    }

    public void addPlatforms(){
        String[][] levelSetup = LevelSetup.ViewsLevelOne;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("sP")){
                    addObject(new StonePlatform(), j*48, i*48);
                }
            }
        }
    }

    public void addBananas(){
        String[][] levelSetup = LevelSetup.ViewsLevelOne;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("b")){
                    addObject(new Banana(), j*48, i*48);
                }
            }
        }
    }

    public void addSpikes(){
        String[][] levelSetup = LevelSetup.ViewsLevelOne;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("s")){
                    addObject(new Spike(), j*48, i*48);
                }
            }
        }
    }

    public void addSpikesUpside(){
        String[][] levelSetup = LevelSetup.ViewsLevelOne;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("sU")){
                    addObject(new SpikeUpSideDown(), j*48, i*48);
                }
            }
        }
    }
}
