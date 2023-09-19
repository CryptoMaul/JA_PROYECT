import mayflower.*;

public class MoveableAnimatedActor extends AnimatedActor{
    private Animation walkRight;
    private Animation idle;
    private Animation walkLeft;
    private Animation idleLeft;
    private Animation fallingLeft;
    private Animation fallingRight;
    private String currentAction="idle";
    private String direction="right";
    public void act(){
        String newAction = null;
        if(currentAction==null){
            newAction="idle";
        }
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        if(isFalling()==true){
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
                    setAnimation(walkRight);
                }
                if(newAction.equals("idle")){
                    currentAction="idle";
                    setAnimation(idle);
                }
                if(newAction.equals("walkLeft")){
                    currentAction="walkLeft";
                    setAnimation(walkLeft);
                }
                if(newAction.equals("idleLeft")){
                    currentAction="idleLeft";
                    setAnimation(idleLeft);
                }
                if(newAction.equals("fallingLeft")){
                    currentAction="fallingLeft";
                    setAnimation(fallingLeft);
                }
                if(newAction.equals("fallingRight")){
                    currentAction="fallingRight";
                    setAnimation(fallingRight);
                }
            }
        }
        super.act();
    }
    public void setAnimation(Animation a){
        super.setAnimation(a);
    }
    public void setWalkRightAnimation(Animation a){
        walkRight=a;
    }
    public void setIdleAnimation(Animation a){
        idle=a;
    }
    public void setIdleLeftAnimation(Animation a){
        idleLeft=a;
    }
    public void setWalkLeftAnimation(Animation a){
        walkLeft=a;
    }
    public void setFallingLeftAnimation(Animation a){
        fallingLeft=a;
    }
    public void setFallingRightAnimation(Animation a){
        fallingRight=a;
    }
}