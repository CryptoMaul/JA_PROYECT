package Levels;

import Actors.Items.Apple;
import Actors.Items.Banana;
import Actors.Drake;
import Actors.GreyStone;
import Actors.StonePlatform;
import mayflower.World;

public class LevelViews extends World {

    public LevelViews(){
        addGroundTiles();
        addPlatforms();
        addBananas();
        addApples();
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
        LevelSetup.addRandomItem(levelSetup, "b");
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("b")){
                    addObject(new Banana(), j*48, i*48);
                }
            }
        }
    }


    public void addApples(){
        String[][] levelSetup = LevelSetup.ViewsLevelOne;
        LevelSetup.addRandomItem(levelSetup, "a");
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("a")){
                    addObject(new Apple(), j*48, i*48);
                }
            }
        }
    }
}
