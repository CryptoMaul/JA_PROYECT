package Actors.Enemies;

import Utils.AnimatedActor;
import Utils.Animation;

public class SmasherAnimatedActor extends AnimatedActor {
    private int originalPosition;
    private int width = 54;
    private int height = 52;
    private boolean isIdle;
    public boolean readyToFall;
    private int frameCount;
    private boolean hasTouchedGround;
    private boolean isMoving;
    private int pastPosition = getY();
    private Animation blink, idle, hit;

    public SmasherAnimatedActor(){

        setAcc(0);

        String[] blink = new String[64];
        for(int i = 0; i<blink.length; i++){
            int x = i/16;
            System.out.println(x);
            blink[i] = "Pixel Adventure 1/Assets/Traps/Spike Head/Blink ("+x+").png";
        }
        this.blink = new Animation(50, blink);
        this.blink.setScale(width, height);

        String[] idle = {"Pixel Adventure 1/Assets/Traps/Spike Head/Idle.png"};
        this.idle = new Animation(50, idle);
        this.idle.setScale(width,height);

        String[] hit = {"Pixel Adventure 1/Assets/Traps/Spike Head/Bottom Hit.png"};
        this.hit = new Animation(50, hit);
        this.hit.setScale(width,height);



        readyToFall = false;


        originalPosition = 100;
        frameCount = 0;

        setAnimation(this.idle);
    }

    @Override
    public void act() {
        if (frameCount > 0 && frameCount % 100 == 0 && !isMoving) {
            setAnimation(blink);
            frameCount = 0;
            readyToFall = true;
            System.out.println("go");
        }else{
            setAnimation(idle);
        }

        if(readyToFall){
            isMoving = true;
            if(getY() < 300 && !hasTouchedGround) {//this is a number we probably will want to change
                setLocation(getX(), getY() + 10);
                System.out.println("falling");
                hasTouchedGround = (getY() == 300);
            }
            else if(100 < getY()) {
                setLocation(getX(), getY() - 5);
            }

            if(getY() == 100) {
                readyToFall = false;
                isMoving = false;
                hasTouchedGround = false;
            }
        }

        if(getY()-pastPosition>0 && getY() != originalPosition){
            setAnimation(hit);
        }else{
            setAnimation(idle);
        }

        pastPosition = getY();

        frameCount++;
        super.act();
    }

}


