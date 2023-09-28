package Utils;

import mayflower.*;

public class MoveableAnimatedDrake extends AnimatedActor{
    private Animation runRight;
    private Animation idleRight;
    private Animation runLeft;
    private Animation idleLeft;
    private String currentAction="idle";
    private String direction="right";
    public void act(){
        /*
        String newAction = null;
        if(currentAction==null){
            newAction="idle";
        }
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        if(isFalling()){
            if(direction.equals("left")){
                newAction="fallingLeft";
            }
            if(direction.equals("right")){
                newAction="fallingRight";
            }
        }
        else if(Mayflower.isKeyDown(Keyboard.KEY_RIGHT) && (x+h)<800){
            setLocation(x+1,y);
            direction="right";
            newAction="walkRight";
            if(isBlocked()){
                setLocation(x-1,y);
            }
        }
        else if(Mayflower.isKeyDown(Keyboard.KEY_LEFT) && x>0){
            setLocation(x-1,y);
            direction="left";
            newAction="walkLeft";
            if(isBlocked()){
                setLocation(x+1,y);
            }
        }
        else{
            newAction="idle";
            if(direction!=null && direction.equals("left")){
                newAction="idleLeft";
            }
        }
        if(newAction!=null){
            if(!currentAction.equals(newAction)){
                if(newAction.equals("walkRight")){
                    currentAction="walkRight";
                    setAnimation(runRight);
                }
                if(newAction.equals("idle")){
                    currentAction="idle";
                    setAnimation(idleRight);
                }
                if(newAction.equals("walkLeft")){
                    currentAction="walkLeft";
                    setAnimation(runLeft);
                }
                if(newAction.equals("idleLeft")){
                    currentAction="idleLeft";
                    setAnimation(idleLeft);
                }
            }
        }
         */
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        
        if(Mayflower.isKeyDown(Keyboard.KEY_RIGHT)){
            setLocation(x+1,y);
            setAnimation(runRight);
            direction = "right";
        } else if(Mayflower.isKeyDown(Keyboard.KEY_LEFT)){
            setLocation(x-1,y);
            setAnimation(runLeft);
            direction = "left";
        } else if (direction.equals("right")){
            setAnimation(idleRight);
        } else if(direction.equals("left")){
            setAnimation(idleLeft);
        }
        
        
        

        super.act();
    }
    public void setAnimation(Animation a){
        super.setAnimation(a);
    }
    public void setWalkRightAnimation(Animation a){
        runRight=a;
    }
    public void setIdleRightAnimation(Animation a){
        idleRight=a;
    }
    public void setIdleLeftAnimation(Animation a){
        idleLeft=a;
    }
    public void setWalkLeftAnimation(Animation a){
        runLeft=a;
    }
}