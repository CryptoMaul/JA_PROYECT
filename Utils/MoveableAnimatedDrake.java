package Utils;

import Actors.Drake;
import Actors.Ground.Ladder;
import Actors.Items.Collectable;
import Actors.Spike;
import Levels.LevelSetup;
import mayflower.*;

public class MoveableAnimatedDrake extends AnimatedActor {
    private Animation runRight;
    private Animation idleRight;
    private Animation runLeft;
    private Animation idleLeft;
    private Animation jumpRight;
    private Animation jumpLeft;
    private Animation fallRight;
    private Animation fallLeft;
    private Animation climbRight;
    private Animation climbLeft;
    private String direction = "right";
    private int health = 5;
    private int score = 0;

    public void act() {
        int x = getX();
        int y = getY();

        if(getVelocity()>2){
            if(direction.equals("right")){
                setAnimation(jumpRight);
                if (Mayflower.isKeyDown(Keyboard.KEY_RIGHT)) {
                    setLocation(x + 5, y);
                }
            } else if(direction.equals("left")){
                setAnimation(jumpLeft);
                if (Mayflower.isKeyDown(Keyboard.KEY_LEFT)) {
                    setLocation(x - 5, y);
                }
            }
        } else if(getVelocity() < -2){
            if(direction.equals("right")){
                setAnimation(fallRight);
                if (Mayflower.isKeyDown(Keyboard.KEY_RIGHT)) {
                    setLocation(x + 5, y);
                }
            } else if(direction.equals("left")){
                setAnimation(fallLeft);
                if (Mayflower.isKeyDown(Keyboard.KEY_LEFT)) {
                    setLocation(x - 5, y);
                }
            }

        } else if ((Mayflower.isKeyDown(Keyboard.KEY_SPACE) || Mayflower.isKeyDown(Keyboard.KEY_W)) && y > 0 && !isJump() && !isBlocked()) {
            setJump(true);
            setVelocity();
        } else if (Mayflower.isKeyDown(Keyboard.KEY_RIGHT) || Mayflower.isKeyDown(Keyboard.KEY_D)) {
            setLocation(x + 5, y);
            setAnimation(runRight);
            direction = "right";
            if (isBlocked() || isTouchingFake()) {
                setLocation(x - 5, y);
            }
        } else if (Mayflower.isKeyDown(Keyboard.KEY_LEFT) || Mayflower.isKeyDown(Keyboard.KEY_A)) {
            setLocation(x - 5, y);
            setAnimation(runLeft);
            direction = "left";
            if (isBlocked() || isTouchingFake()) {
                setLocation(x + 5, y);
            }
        } else if(isClimbing()){
            if(direction.equals("right")){
                setAnimation(climbRight);
            } else {
                setAnimation(climbLeft);
            }
        } else if (direction.equals("right")) {
            setAnimation(idleRight);
        } else if (direction.equals("left")) {
            setAnimation(idleLeft);
        }


        if(isTouching(Ladder.class) && Mayflower.isKeyDown(Keyboard.KEY_UP)){
            setLocation(getX(), getY() - 5);
        } else if(isTouching(Ladder.class) && Mayflower.isKeyDown(Keyboard.KEY_DOWN) && !isBlocked()){
            setLocation(getX(), getY() + 5);
        }


        if(isTouching(CollectableAnimatedActor.class)){
            score++;
        }

        if(isTouching()){
            health--;
            setLocation(100, 100);
        }


        super.act();
    }

    public void setAnimation(Animation a) {
        super.setAnimation(a);
    }

    public void setWalkRightAnimation(Animation a) {
        runRight = a;
    }

    public void setIdleRightAnimation(Animation a) {
        idleRight = a;
    }

    public void setIdleLeftAnimation(Animation a) {
        idleLeft = a;
    }

    public void setWalkLeftAnimation(Animation a) {
        runLeft = a;
    }

    public void setJumpRightAnimation(Animation a){
        jumpRight = a;
    }

    public void setJumpLeftAnimation(Animation a){jumpLeft = a;}

    public void setFallRight(Animation a){
        fallRight = a;
    }

    public void setFallLeft(Animation a){
        fallLeft = a;
    }

    public void setClimbRight(Animation a){climbRight = a;}
    public void setClimbLeft(Animation a){climbLeft = a;}

    public boolean isTouching(){
        return isTouching(Spike.class);
    }

    public boolean isClimbing(){return isTouching(Ladder.class) && (Mayflower.isKeyDown(Keyboard.KEY_UP) || Mayflower.isKeyDown(Keyboard.KEY_DOWN));}

    public boolean isDone(){
        return this.getWorld().getObjects(Collectable.class).size() == 0 && this.getX() > 960;
    }
}