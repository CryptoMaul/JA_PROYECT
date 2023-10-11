package Utils;

import Actors.Enemies.Bound;

//Movement of enemy actor, mainly the frog enemy
public class EnemyAnimatedActor extends AnimatedActor{

    private Animation runRight;

    private Animation runLeft;

    private String direction = "right";

    public EnemyAnimatedActor(){

    }

    //Will move one way until touches a bounds, then will turn the other way
    @Override
    public void act() {


        if(direction.equals("right")){
            setLocation(getX()+1, getY());
            setAnimation(runRight);
        } else {
            setLocation(getX()-1, getY());
            setAnimation(runLeft);
        }

        if(isTouching(Bound.class)){
            if(direction.equals("right")){
                direction = "left";
            } else {
                direction = "right";
            }
        }
        super.act();
    }

    //Setters for animations
    public void setRunRight(Animation a){runRight = a;}

    public void setRunLeft(Animation a){runLeft = a;}

    public void setAnimation(Animation a){
        super.setAnimation(a);
    }
}
