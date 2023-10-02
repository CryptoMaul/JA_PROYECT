package Utils;

public class CollectableAnimatedActor extends AnimatedActor{
    private Animation idle;

    @Override
    public void act() {
        setAnimation(idle);
        super.act();
    }

    public void setIdle(Animation a){
        idle = a;
    }

    public void setAnimation(Animation a) {
        super.setAnimation(a);
    }
}
