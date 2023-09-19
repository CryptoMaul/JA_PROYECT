import mayflower.*;


public class MyWorld extends World {

    private Cat cat;
    private DogAnimatedActor dog;
    private JackAnimatedActor jack;
    private NinjaAnimatedActor ninja;
    private String[][] tiles;
    
    public MyWorld() 
    {
        setBackground("img/BG/BG.png");
        tiles = new String[6][8];
        /*
        cat = new Cat();
        dog = new DogAnimatedActor();
        jack = new JackAnimatedActor();
        ninja = new NinjaAnimatedActor();
        */
        addObject(cat, 100, 100);
        addObject(dog, 541, 400);
        addObject(jack, 503, 123);
        addObject(ninja, 374, 177);
        buildWorld();
        addRandomObjects();
        addMainCharacter();
        addMainCharacter2();
    }
    // nitish is a monkey
    public void buildWorld(){
        for(int r = 0; r < tiles.length; r++){
            for(int c = 0; c < tiles[r].length; c++){
                if(r != 5){
                    tiles[r][c] = " ";
                    
                } else{
                    tiles[r][c] = "ground";
                    addObject(new Block(), c * 100, r * 100);
                }
            }
        }

    }
    public void addRandomObjects(){
        for(int r = 0; r < tiles.length - 1; r++){
            for(int c = 0; c < tiles[r].length; c++){
                if((int)(Math.random() * (6)) < 3){
                    if((int) (Math.random() * 2 + 1) % 2 == 0){
                        tiles[r][c] = "yarn";
                        addObject(new Yarn(), c * 100, r * 100);
                    }else{
                        tiles[r][c] = "gurl";
                        addObject(new NinjaAnimatedActor(), c * 100, r * 100);
                    }
                    
                }
            }
        }
    }
    public void addMainCharacter(){
        cat = new Cat();
        int row = (int)(Math.random() * tiles.length);
        int col = (int)(Math.random() * tiles[0].length);
        boolean added = false;
        while(added == false){
            if((tiles[row][col].equals(" "))){
                addObject(cat, col * 100, row * 100);
                added = true;
            } else{
                row = (int)(Math.random() * tiles.length);
                col = (int)(Math.random() * tiles[0].length);
            }
        }
    }
    public void addMainCharacter2(){
        dog = new DogAnimatedActor();
        int row = (int)(Math.random() * tiles.length);
        int col = (int)(Math.random() * tiles[0].length);
        boolean added = false;
        while(added == false){
            if((tiles[row][col].equals(" "))){
                addObject(dog, col * 100, row * 100);
                added = true;
            } else{
                row = (int)(Math.random() * tiles.length);
                col = (int)(Math.random() * tiles[0].length);
            }
        }
    }
    public void act(){
        
    }
}