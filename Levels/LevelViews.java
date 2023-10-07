package Levels;

import Actors.*;
import Actors.Enemies.Bound;
import Actors.Enemies.FrogMan;
import Actors.Ground.GreyStone;
import Actors.Ground.StoneGoldLadder;
import Actors.Items.Apple;
import Actors.Items.Banana;
import mayflower.Mayflower;
import mayflower.World;

public class LevelViews extends World {

    Drake drake = new Drake();

    public LevelViews(){
        addGroundTiles();
        addPlatforms();
        addSpike();
        addBananas();
        addApples();
        addSpikes();
        addSpikesUpside();
        addFrog();
        addLadders();
        Drake drake = new Drake();
        addObject(drake, 100, 100);
    }

    @Override
    public void act() {
        if(drake.isDone()) {
            System.out.println("ran");
            Mayflower.setWorld(new Level2());
        }
    }

    public void addGroundTiles(){
        String[][] levelSetup = LevelSetup.ViewsLevelOne;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("gS")){

                    addObject(new GreyStone(), j*48, i*48);
                    addObject(new GreyStoneFake(), j*48, i*48 + 6);
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
        LevelSetup.addRandomItem(levelSetup, "b", "gS");
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
        LevelSetup.addRandomItem(levelSetup, "a", "gS");
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("a")){
                    addObject(new Apple(), j*48, i*48);
                }
            }
        }
    }

    public void addSpike(){
        String[][] levelSetup = LevelSetup.ViewsLevelOne;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("s")){
                    addObject(new Spike(), j*48 + 1, i*48);
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

    public void addFrog(){
        String[][] levelSetup = LevelSetup.ViewsLevelOne;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("fM")){
                    addObject(new FrogMan(), j*48, i*48);
                }
            }
        }
        addObject(new Bound(), 528, 520);
        addObject(new Bound(), 360, 520);
        addObject(new Bound(), 96, 700);
        addObject(new Bound(), 528, 700);
    }

    public void addLadders(){
        String[][] levelSetup = LevelSetup.ViewsLevelOne;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("sgL")){
                    addObject(new StoneGoldLadder(), j*48, i*48 - 48);
                }
            }
        }
    }
}

}
