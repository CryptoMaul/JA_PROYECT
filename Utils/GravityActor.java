package Utils;

import Actors.Ground.FakePlatform;
import Actors.Ground.Ground;
import Actors.Ground.Ladders.Ladder;
import mayflower.*;


public class GravityActor extends Actor{
    //hey
    final int initialVelocity = 25;
    private int increase = 0;
    private boolean jump = false;
    private int acc = 2;
    private int velocity;
    private boolean justJumped;


    public void act(){
        int x = getX();
        int y = getY();
        justJumped = jump;
        jump = true;

        if(isBlocked()) {
            jump = false;
            velocity = 0;
        }

        if(jump && !isClimbing()){
            setLocation(x, y-velocity);
            velocity -= acc;
        }

        if(!jump && !isBlockedDown()){
            setLocation(x, y+initialVelocity);

            velocity += acc;
                System.out.println("ran");

            //velocity += acc;
        }

        if(isTouchingFake()){
            jump = true;
            setLocation(x, y);
            velocity = 0;
        }

        if(isBlocked()) {
            jump = false;
            if (isBlocked())
                setLocation(x, y);
            velocity = 0;
        }

        if(isClimbing()){
            velocity = 0;
        }

        if(isClimbing()){
            jump = false;
        }



    }
    public boolean hasJustJumped() {
        return justJumped;
    }
    public boolean isBlocked(){

        return isTouching(Ground.class);

    }

    public boolean isTouchingFake(){
        return isTouching(FakePlatform.class);
    }

    public boolean isBlockedDown(){
        Actor a = this.getOneIntersectingObject(Ground.class);

        if(a == null)
            return false;

        return (this.getCenterY()-a.getCenterY()< 0);
    }

   /* public boolean isFalling(){
        boolean ret;
        setLocation(getX(),getY()+1+increase);
        ret=isTouching(Ground .class);
        setLocation(getX(),getY()-1-increase);
        return !ret;
    }*/



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

    public boolean isClimbing(){
        return isTouching(Ladder.class) && (Mayflower.isKeyDown(Keyboard.KEY_UP) || Mayflower.isKeyDown(Keyboard.KEY_DOWN));
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }
}