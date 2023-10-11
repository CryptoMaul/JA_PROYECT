package Levels;

import Actors.Drake;
import Actors.Enemies.Bound;
import Actors.Enemies.FrogMan;
import Actors.Ground.BrownStone;
import Actors.Ground.GreenStone;
import Actors.Ground.GreyStoneFake;
import Actors.Ground.Ladders.GoldLadder;
import Actors.Ground.Ladders.GreenLadder;
import Actors.Items.Apple;
import Actors.Items.Banana;
import Actors.Spike;
import mayflower.Color;
import mayflower.Mayflower;
import mayflower.World;

//Level three
public class LevelThree extends World {

    Drake drake;

    //Constructor takes the score and health from the past level
    public LevelThree(int s, int h){
        setBackground("Pixel Adventure 1/BackGround3.png");
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
        Mayflower.playMusic("Pixel Adventure 1/drake1.mp3");
    }

    @Override
    public void act() {
        if(drake.isDone()) {
            Mayflower.setWorld(new OutroWin(drake.getScore()));
        }
        if(drake.isDead()){
            Mayflower.setWorld(new OutroLose());
        }
    }

    //Methods to add elements
    public void addGroundTiles(){
        String[][] levelSetup = LevelSetup.ViewsLevelThree;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("bS")){

                    addObject(new GreenStone(), j*48, i*48);
                    addObject(new GreyStoneFake(), j*48, i*48 + 6);
                }
            }
        }
    }

    public void addBananas(){
        String[][] levelSetup = LevelSetup.ViewsLevelThree;
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
        String[][] levelSetup = LevelSetup.ViewsLevelThree;
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
        String[][] levelSetup = LevelSetup.ViewsLevelThree;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("s")){
                    addObject(new Spike(), j*48, i*48+24);
                }
            }
        }
    }

    public void addFrog(){
        String[][] levelSetup = LevelSetup.ViewsLevelThree;
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
        String[][] levelSetup = LevelSetup.ViewsLevelThree;
        for(int i = 0; i < levelSetup.length; i++){
            for(int j = 0; j < levelSetup[0].length; j++){
                if(levelSetup[i][j].equals("l")){
                    addObject(new GreenLadder(), j*48, i*48 - 48);
                }
            }
        }

    }
}
