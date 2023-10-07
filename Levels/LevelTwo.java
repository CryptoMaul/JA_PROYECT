package Levels;

import Actors.Drake;
import Actors.Enemies.Bound;
import Actors.Enemies.FrogMan;
import Actors.Ground.BrownStone;
import Actors.Ground.GreyStone;
import Actors.Ground.GreyStoneFake;
import Actors.Ground.Ladder;
import Actors.Items.Apple;
import Actors.Items.Banana;
import Actors.Spike;
import mayflower.World;

public class LevelTwo extends World {

    Drake drake;

    public LevelTwo(){
        addGroundTiles();
        addBananas();
        addApples();
        addSpike();
        addFrog();
        addLadders();
        drake = new Drake();
        addObject(drake, 100, 100);
        System.out.println(drake.getWorld());
    }
    @Override
    public void act() {

    }

    public void addGroundTiles(){
        String[][] levelSetup = LevelSetup.ViewsLevelTwo;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("bS")){

                    addObject(new BrownStone(), j*48, i*48);
                    addObject(new GreyStoneFake(), j*48, i*48 + 6);
                }
            }
        }
    }

    public void addBananas(){
        String[][] levelSetup = LevelSetup.ViewsLevelTwo;
        LevelSetup.addRandomItem(levelSetup, "b", "bS");
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("b")){
                    addObject(new Banana(), j*48, i*48);
                }
            }
        }
    }


    public void addApples(){
        String[][] levelSetup = LevelSetup.ViewsLevelTwo;
        LevelSetup.addRandomItem(levelSetup, "a", "bS");
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("a")){
                    addObject(new Apple(), j*48, i*48);
                }
            }
        }
    }

    public void addSpike(){
        String[][] levelSetup = LevelSetup.ViewsLevelTwo;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("s")){
                    addObject(new Spike(), j*48 + 1, i*48);
                }
            }
        }
    }


    public void addFrog(){
        String[][] levelSetup = LevelSetup.ViewsLevelTwo;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("fM")){
                    addObject(new FrogMan(), j*48, i*48);
                }
            }
        }
        addObject(new Bound(), 576, 520);
        addObject(new Bound(), 384, 520);
        addObject(new Bound(), 384, 260);
        addObject(new Bound(), 576, 260);
    }

    public void addLadders(){
        String[][] levelSetup = LevelSetup.ViewsLevelTwo;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("l")){
                    addObject(new Ladder(), j*48, i*48 - 48);
                }
            }
        }

    }
}
