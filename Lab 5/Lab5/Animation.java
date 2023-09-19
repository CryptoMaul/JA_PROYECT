import mayflower.*;

public class Animation{
    private MayflowerImage[] frames;
    private int frameRate;
    private int currentFrame;
    public Animation(int n, String[] arr){
        frameRate = n;
        frames = new MayflowerImage[arr.length];
        for(int i = 1; i <= arr.length; i++){
            frames[i-1] = new MayflowerImage(arr[i-1]);
            frames[i-1].scale(100, 87);
        }
    }
    public int getFrameRate(){
        return frameRate;
    }
    public MayflowerImage getNextFrame(){
        MayflowerImage temp = frames[currentFrame];
        
        if(currentFrame != frames.length - 1){
            currentFrame++;
        }
        else{
            currentFrame = 0;
        }
        return temp;
    }
    public void setTransparency(int percent){
        for(MayflowerImage frame: frames){
            frame.setTransparency(percent);
        }
    }
    public void setScale(int scaleX, int scaleY){
        for(MayflowerImage frame: frames){
            frame.scale(scaleX, scaleY);
        }
    }
}