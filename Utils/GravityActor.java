package Utils;

import Actors.GreyStone;
import Actors.Ground;
import mayflower.*;


public class GravityActor extends Actor{

    public int initialVelocity = 25;
    private int increase = 0;
    private boolean jump = false;
    private int acc = 2;
    private int velocity;


    public void act(){
        int x = getX();
        int y = getY();

        if(isBlocked()) {
            jump = false;
            velocity = 0;

        }
        if (Mayflower.isKeyDown(Keyboard.KEY_SPACE) && y > 0 && !jump && isBlocked()) {
            jump = true;
            velocity = initialVelocity;
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
            while (!oldBlocked && isBlocked())
                setLocation(x, --y);
            velocity = 0;

        }

    }
    public boolean isBlocked(){
        return isTouching(Ground.class);
    }
    public boolean isFalling(){
        boolean ret;
        setLocation(getX(),getY()+1+increase);
        ret=isTouching(Ground.class);
        setLocation(getX(),getY()-1-increase);
        return !ret;
    }
}