package Utils;

import Actors.Enemies.Bound;

public class EnemyAnimatedActor extends AnimatedActor{

    private Animation runRight;

    private Animation runLeft;

    private String direction = "right";

    public EnemyAnimatedActor(){

    }

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

    public void setRunRight(Animation a){runRight = a;}

    public void setRunLeft(Animation a){runLeft = a;}

    public void setAnimation(Animation a){
        super.setAnimation(a);
    }
}
