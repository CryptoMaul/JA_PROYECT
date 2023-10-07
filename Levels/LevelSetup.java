package Levels;

public class LevelSetup {

    public static int itemNumber = 0;

    public static String[][] ViewsLevelOne = {{"gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS"},
                                      {"gS", "", "", "", "sU", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "gS", "gS", "", "", "", "", "", "", "", ""},
                                      {"gS", "", "", "", "", "s", "", "", "", "gS", "", "", "", "gS", "", "", "", "", "", ""},
                                      {"gS", "", "gS", "gS", "gS", "gS", "", "", "", "", "", "", "", "", "gS", "gS", "", "", "", ""},
                                      {"gS", "sgL", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS", "gS", "gS"},
                                      {"gS", "sgL", "", "", "", "", "", "gS", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "sgL", "", "", "", "", "", "", "", "fM", "", "s", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "sgL", "", "", "", "", "", "", "gS", "gS", "gS", "gS", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "sgL", "", "", "", "", "gS", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "sgL", "", "gS", "gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "sgL", "", "", "", "", "", "", "fM", "", "", "", "s", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS", "gS", "gS"},
                                      {"gS", "", "", "", "", "", "", "gS", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "gS", "gS", "gS", "gS", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "gS", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "gS", "gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "gS"},
                                      {"gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS", "gS"}};

    public static String[][] LevelTwo = {{"bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS"},
                                      {"bS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "bS"},
                                      {"bS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "bS"},
                                      {"bS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "bS"},
                                      {"bS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "bS"},
                                      {"bS", "", "", "", "", "", "", "", "", "", "bS", "bS", "", "", "", "", "", "", "", ""},
                                      {"bS", "", "", "", "", "s", "", "", "", "bS", "", "", "", "bS", "", "s", "", "", "", ""},
                                      {"bS", "", "bS", "bS", "bS", "bS", "", "", "", "", "", "", "", "", "bS", "bS", "", "", "", ""},
                                      {"bS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "bS", "bS", "bS"},
                                      {"bS", "", "", "", "", "", "", "bS", "", "", "", "", "", "", "", "", "", "", "", "bS"},
                                      {"bS", "", "", "", "", "", "", "", "", "fM", "", "s", "", "", "", "", "", "", "", "bS"},
                                      {"bS", "", "", "", "", "", "", "", "bS", "bS", "bS", "bS", "", "", "", "", "", "", "", "bS"},
                                      {"bS", "", "", "", "", "", "bS", "", "", "", "", "", "", "", "", "", "", "", "", "bS"},
                                      {"bS", "", "", "bS", "bS", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "bS"},
                                      {"bS", "", "", "", "", "", "", "", "", "", "", "", "s", "", "s", "", "", "", "", "bS"},
                                      {"bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS", "bS"}};

    public static void addRandomItem(String[][] arr, String item, String groundName){

        for(int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[0].length - 1; j++) {
                if (isEmpty(arr, i, j, groundName) && (int) ((Math.random() * 18) + 1) == 18) {
                    arr[i][j] = item;
                    itemNumber++;
                }
            }
        }
    }

    public static boolean isEmpty(String[][] arr, int i, int j, String groundName){
        return arr[i][j].equals("") && !arr[i + 1][j].equals("s") && arr[i + 1][j].equals(groundName);

    }


}
