package Levels;

import Actors.*;
import Actors.Enemies.Bound;
import Actors.Enemies.FrogMan;
import Actors.Enemies.SmasherAnimatedActor;
import Actors.Ground.GreyStone;
import Actors.Ground.GreyStoneFake;
import Actors.Ground.Ladder;
import Actors.Items.Apple;
import Actors.Items.Banana;
import mayflower.Mayflower;
import mayflower.World;

public class LevelViews extends World {

    Drake drake;

    public LevelViews(){
        addGroundTiles();
        addBananas();
        addApples();
        addSpike();
        addFrog();
        addLadders();
        drake = new Drake();
        addObject(drake, 100, 100);
        addObject(new SmasherAnimatedActor(),200,100);
        System.out.println(drake.getWorld());
    }

    @Override
    public void act() {
        if(drake.isDone()) {
            System.out.println(drake.isDone());
            Mayflower.setWorld(new LevelTwo());
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
                    addObject(new Spike(), j*48, i*48+24);
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
        addObject(new Bound(), 576, 520);
        addObject(new Bound(), 384, 520);
        addObject(new Bound(), 384, 260);
        addObject(new Bound(), 576, 260);
    }

    public void addLadders(){

        String[][] levelSetup = LevelSetup.ViewsLevelOne;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("l")){
                    System.out.println("add");
                    addObject(new Ladder(), j*48, i*48 - 48);
                }
            }
        }

    }
}
