package Utils;

import Actors.Ground;
import mayflower.*;


public class GravityActor extends Actor{
    private Timer timer = new Timer(20000);
    private static int increase = 0;
    public void act(){
        if(timer.isDone() && increase < 7){
            increase++;
            timer.reset();
        }

        setLocation(getX(),getY()+1 + increase);
        if(isBlocked()){
            setLocation(getX(),getY()-1- increase);
        }
    }
    public boolean isBlocked(){
        //TODO actually change Ground to actual class name
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