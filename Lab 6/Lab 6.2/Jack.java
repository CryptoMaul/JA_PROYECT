import mayflower.*;

public class Jack extends AnimatedActor
{
    private Animation slide;
    public Jack() 
    {
        String[] arr = new String[10];
        for(int i=0;i<10;i++){
            arr[i]="img/jack/Slide ("+(i+1)+").png";
        }
        slide=new Animation(50,arr);
        setAnimation(slide);
        slide.Transparency(80);
    }
    public void act()
    {
        super.act();
    }
}
