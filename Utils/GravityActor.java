package Utils;

import Actors.Ground;
import mayflower.*;

public class GravityActor extends Actor{
    public void act(){
        setLocation(getX(),getY()+1);
        if(isBlocked()){
            setLocation(getX(),getY()-1);
        }
    }
    public boolean isBlocked(){

        return isTouching(Ground.class);
    }
    public boolean isFalling(){
        boolean ret;
        setLocation(getX(),getY()+1);
        ret=isTouching(Ground.class);
        setLocation(getX(),getY()-1);
        return !ret;
    }
}
