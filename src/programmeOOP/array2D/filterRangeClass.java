package programmeOOP.array2D;

import java.util.ArrayList;

/**
 * filterRangeClass
 */
public class filterRangeClass {

    public static void filterRange(ArrayList<Integer> list, int min, int max) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) >= min && list.get(i) <= max){
                list.remove(i--);
            }
        }
    }
}