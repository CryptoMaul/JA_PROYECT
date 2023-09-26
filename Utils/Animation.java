package Utils;

import mayflower.*;



public class Animation{
    private final MayflowerImage[] frames;
    private final int framerate;
    private int currentFrame;
    public Animation(int x, String[] imageFiles)
    {
        framerate = x;
        frames = new MayflowerImage[imageFiles.length];
        for(int i=0;i<imageFiles.length;i++){
            frames[i] = new MayflowerImage(imageFiles[i]);
            frames[i].scale(100,87);
        }
    }
    public int getFrameRate()
    {
        return framerate;
    }
    public MayflowerImage getNextFrame()
    {
        MayflowerImage placeholder= frames[currentFrame];
        if(currentFrame<frames.length-1){
            currentFrame++;
        }
        else{
            currentFrame=0;
        }
        return placeholder;
    }
    public void Transparency(int x){
        for(MayflowerImage frame:frames){
            frame.setTransparency(x);
        }
    }
    public void setScale(int x,int y){
        for(MayflowerImage frame:frames){
            frame.scale(x,y);
        }
    }
    public void mirrorHorizontally(){
        for(MayflowerImage frame:frames){
            frame.mirrorHorizontally();
        }
    }
    public void setBounds(int x, int y, int w, int h){
        for(MayflowerImage frame:frames){
            frame.crop(x,y,w,h);
        }
    }
}
