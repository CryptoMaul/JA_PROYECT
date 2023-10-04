package Levels;

public class LevelSetup {

    public static String[][] ViewsLevelOne = {{"gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "gS", "gS", "", "", "", "", "", "", "", ""},
                                      {"gS", "", "", "", "", "", "", "", "", "gS", "", "", "", "gS", "", "", "", "", "", ""},
                                      {"gS", "", "gS", "gS", "gS", "gS", "", "", "", "", "", "", "", "", "gS", "gS", "", "", "", ""},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS", "gS", "gS"},
                                      {"gS", "", "", "", "", "", "", "gS", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "gS", "gS", "gS", "gS", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "gS", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "gS", "gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS"}};

    public static void addRandomItem(String[][] arr, String item){
            for(int j = 0; j < arr[0].length; j++){
                if(randomItemNotInColumn(arr, j, item)){
                    int randInt = (int) (Math.random()*3);
                    if(randInt == 0 && arr[1][j].equals("")){
                        arr[1][j] = item;
                    }
                }
            }
    }

    public static boolean randomItemNotInColumn(String[][] arr, int j, String item){
        for (String[] strings : arr) {
            if (strings[j].equals(item)) {
                return false;
            }
        }
        return true;
    }


}
