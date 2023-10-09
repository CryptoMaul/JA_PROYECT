package Levels;

import Actors.*;
import Actors.Enemies.Bound;
import Actors.Enemies.FrogMan;
import Actors.Ground.GreyStone;
import Actors.Ground.GreyStoneFake;
import Actors.Ground.Ladders.Ladder;
import Actors.Ground.Ladders.StoneLadder;
import Actors.Items.Apple;
import Actors.Items.Banana;
import mayflower.Color;
import mayflower.Font;
import mayflower.Mayflower;
import mayflower.World;

public class LevelViews extends World {

    Drake drake;
    Font score;
    Font lives;

    public LevelViews(){
        setBackground("Pixel Adventure 1/BackGround1.png");
        drake = new Drake();
        addGroundTiles();
        addBananas();
        addApples();
        addSpike();
        addFrog();
        addLadders();
        addObject(drake, 100, 100);
        showText("Score : " + drake.getScore(), 20 , 60, 80, Color.WHITE);
        showText("Lives : " + drake.getLives(), 20 , 760, 80, Color.WHITE);
        System.out.println(drake.getWorld());
    }

    @Override
    public void act() {
        if(drake.isDone()) {
            Mayflower.setWorld(new LevelTwo(drake.getScore(), drake.getLives()));
        }
        if(drake.isDead()){
            Mayflower.setWorld(new OutroLose());
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
                    addObject(new Banana(drake), j*48, i*48);
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
                    addObject(new Apple(drake), j*48, i*48);
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
                    addObject(new StoneLadder(), j*48, i*48 - 48);
                }
            }
        }

    }
}
