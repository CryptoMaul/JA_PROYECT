package Utils;

import mayflower.*;

public class MoveableAnimatedDrake extends AnimatedActor {
    private Animation runRight;
    private Animation idleRight;
    private Animation runLeft;
    private Animation idleLeft;
    private Animation jump;
    private String currentAction = "idle";
    private String direction = "right";

    public void act() {
        int x = getX();
        int y = getY();

        System.out.println(getVelocity());
        if(getVelocity()>2){
            setAnimation(jump);
            System.out.println("jump");
        } else if (Mayflower.isKeyDown(Keyboard.KEY_SPACE) && y > 0 && !isJump() && !isBlocked()) {
            setJump(true);
            setVelocity();
        } else if (Mayflower.isKeyDown(Keyboard.KEY_RIGHT)) {
            setLocation(x + 5, y);
            setAnimation(runRight);
            direction = "right";
            if (isBlocked()) {
                setLocation(x - 5, y);
            }
        } else if (Mayflower.isKeyDown(Keyboard.KEY_LEFT)) {
            setLocation(x - 5, y);
            setAnimation(runLeft);
            direction = "left";
            if (isBlocked()) {
                setLocation(x + 5, y);
            }
        } else if (direction.equals("right")) {
            setAnimation(idleRight);
        } else if (direction.equals("left")) {
            setAnimation(idleLeft);
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

    public void setJumpAnimation(Animation a){
        jump = a;
    }
}