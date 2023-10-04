package Levels;

public class LevelSetup {

    public static String[][] ViewsLevelOne = {{"gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "gS", "gS", "", "", "", "", "", "", "", ""},
                                      {"gS", "", "", "", "", "s", "", "", "", "gS", "", "", "", "gS", "", "s", "", "", "", ""},
                                      {"gS", "", "gS", "gS", "gS", "gS", "", "", "", "", "", "", "", "", "gS", "gS", "", "", "", ""},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS", "gS", "gS"},
                                      {"gS", "", "", "", "", "", "", "gS", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "s", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "gS", "gS", "gS", "gS", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "gS", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "gS", "gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "s", "", "s", "", "", "", "", "gS"},
                                      {"gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS"}};

    public static void addRandomItem(String[][] arr, String item){

        for(int i = 1; i < arr.length - 1; i++){
            for(int j = 1; j < arr[0].length-1; j++){
                if(isEmpty(arr, i, j) && (int) ((Math.random()*18)+1) == 18){
                    arr[i][j] = item;
                }
            }
        }

        /*


            for(int j = 0; j < arr[0].length; j++){
                if(randomItemNotInColumn(arr, j, item)){
                    int randInt = (int) (Math.random()*3);
                    if(randInt == 0 && arr[1][j].equals("")){
                        arr[1][j] = item;
                    }
                }
            }

         */
    }

    public static boolean randomItemNotInColumn(String[][] arr, int j, String item){
        for (String[] strings : arr) {
            if (strings[j].equals(item)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(String[][] arr, int i, int j){
        return arr[i][j].equals("") && !arr[i + 1][j].equals("s") && arr[i + 1][j].equals("gS");
    }


}
