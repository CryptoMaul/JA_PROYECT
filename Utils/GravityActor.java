package Utils;

import Actors.GreyStone;
import Actors.Ground;
import mayflower.*;


public class GravityActor extends Actor{

    public int initialVelocity = 28;
    private int increase = 0;
    private boolean jump = false;
    private int acc = 2;
    private int velocity;


    public void act(){
        int x = getX();
        int y = getY();
        jump = true;

        if(isBlocked()) {
            jump = false;
            velocity = 0;

        }

        if(jump){
            setLocation(x, y-velocity);
            velocity -= acc;
        }

        boolean oldBlocked = isBlocked();
        if(!jump && !isBlocked()){
            setLocation(x, y+initialVelocity);
            velocity += acc;
        }
        if(isBlocked()) {
            jump = false;
            if (isBlocked())
                setLocation(x, y);
            velocity = 0;

        }

    }
    public boolean isBlocked(){

        return isTouching(Ground.class);

    }
    public boolean isFalling(){
        boolean ret;
        setLocation(getX(),getY()+1+increase);
        ret=isTouching(Ground .class);
        setLocation(getX(),getY()-1-increase);
        return !ret;
    }

    public boolean isJump() {
        return jump;
    }

    public void setJump(boolean jump) {
        this.jump = jump;
    }

    public void setVelocity() {
        this.velocity = initialVelocity;
    }

    public int getVelocity() {
        return velocity;
    }
}