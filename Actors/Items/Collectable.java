package Actors.Items;

import Actors.Drake;
import Utils.CollectableAnimatedActor;

public class Collectable extends CollectableAnimatedActor {

    public Collectable(Drake drake) {
        super(drake);
    }

    public void setDrake(Drake d){
        super.setDrake(d);
    }
}