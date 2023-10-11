package Actors.Enemies;

import Utils.AnimatedActor;
import Utils.Animation;

//Smasher enemy class
public class SmasherAnimatedActor extends AnimatedActor {
    //setting necessary values
    private int originalPosition;
    private int width = 54;
    private int height = 52;
    public boolean readyToFall;
    private int frameCount;
    private boolean hasTouchedGround;
    private boolean isMoving;
    private int pastPosition = getY();
    private Animation blink, idle, hit;

    //creating animations and images
    public SmasherAnimatedActor(int setOriginalY) {

        setAcc(0);

        String[] blink = new String[64];
        for (int i = 0; i < blink.length; i++) {
            int x = i / 16;
            System.out.println(x);
            blink[i] = "Pixel Adventure 1/Assets/Traps/Spike Head/Blink (" + x + ").png";
        }
        this.blink = new Animation(50, blink);
        this.blink.setScale(width, height);

        String[] idle = {"Pixel Adventure 1/Assets/Traps/Spike Head/Idle.png"};
        this.idle = new Animation(50, idle);
        this.idle.setScale(width, height);

        String[] hit = {"Pixel Adventure 1/Assets/Traps/Spike Head/Bottom Hit.png"};
        this.hit = new Animation(50, hit);
        this.hit.setScale(width, height);


        //boolean to make the smasher not fall yet
        readyToFall = false;

        //Set original position from the world
        originalPosition = setOriginalY;

        //setting frame count to 0
        frameCount = 0;

        setAnimation(this.idle);
    }

    @Override
    public void act() {
        //After 100 frames, smasher ready to fall
        if (frameCount > 0 && frameCount % 100 == 0 && !isMoving) {
            setAnimation(blink);
            frameCount = 0;
            readyToFall = true;
            System.out.println("go");
        } else {
            setAnimation(idle);
        }

        //Moving the smasher up and down to certain positions
        if (readyToFall) {
            isMoving = true;
            if (getY() < (originalPosition + 500) && !hasTouchedGround) {//this is a number we probably will want to change
                setLocation(getX(), getY() + 10);
                System.out.println("falling");
                hasTouchedGround = (getY() == 300);
            } else if (originalPosition < getY()) {
                setLocation(getX(), getY() - 5);
            }

            //Reseting all the booleans
            if (getY() == originalPosition) {
                readyToFall = false;
                isMoving = false;
                hasTouchedGround = false;
            }
        }

        //Setting animations based off movement
        if (getY() - pastPosition > 0 && getY() != originalPosition) {
            setAnimation(hit);
        } else {
            setAnimation(idle);
        }

        //reseting pastPosition
        pastPosition = getY();

        //Increasing frame count
        frameCount++;
        super.act();
    }

}


