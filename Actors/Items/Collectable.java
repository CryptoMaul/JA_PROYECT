package Actors.Items;

import Actors.Drake;
import Utils.CollectableAnimatedActor;

//Collectable actor has special animations which needs its own parent class
public class Collectable extends CollectableAnimatedActor {

    public Collectable(Drake drake) {
        super(drake);
    }

    public void setDrake(Drake d){
        super.setDrake(d);
    }
}