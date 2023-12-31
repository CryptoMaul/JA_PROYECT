package Levels;

import Actors.Drake;
import Actors.Enemies.Bound;
import Actors.Enemies.FrogMan;
import Actors.Ground.BrownStone;
import Actors.Ground.GreyStoneFake;
import Actors.Ground.Ladders.GoldLadder;
import Actors.Ground.Ladders.Ladder;
import Actors.Ground.Ladders.StoneLadder;
import Actors.Items.Apple;
import Actors.Items.Banana;
import Actors.Spike;
import mayflower.Color;
import mayflower.Mayflower;
import mayflower.World;

public class LevelTwo extends World {

    Drake drake;

    //Level two takes the score and health from the previos level
    public LevelTwo(int s, int h){
        setBackground("Pixel Adventure 1/BackGround2.png");
        addGroundTiles();
        drake = new Drake();
        addBananas();
        addApples();
        addSpike();
        addFrog();
        addLadders();
        addObject(drake, 100, 100);
        drake.setScore(s);
        drake.setLives(h);
        showText("Score : " + drake.getScore(), 20 , 60, 80, Color.WHITE);
        showText("Lives : " + drake.getLives(), 20 , 760, 80, Color.WHITE);
        System.out.println(drake.getWorld());

    }
    @Override
    public void act() {
        if(drake.isDone()) {

            Mayflower.setWorld(new LevelThree(drake.getScore(), drake.getLives()));
        }
        if(drake.isDead()){
            Mayflower.stopMusic("Pixel Adventure 1/drake1.mp3");
            Mayflower.setWorld(new OutroLose());
        }
    }

    //Methods to add in elements from the 2d array
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
                    addObject(new Banana(drake), j*48, i*48);
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
                    addObject(new Apple(drake), j*48, i*48);
                }
            }
        }
    }

    public void addSpike(){
        String[][] levelSetup = LevelSetup.ViewsLevelTwo;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("s")){
                    addObject(new Spike(), j*48, i*48+24);
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
                    addObject(new GoldLadder(), j*48, i*48 - 48);
                }
            }
        }
    }
}
