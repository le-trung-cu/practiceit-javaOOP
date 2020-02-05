package programmeOOP.array2D;

import java.util.ArrayList;

/**
 * minToFrontClass
 */
public class minToFrontClass {

    public void minToFront(ArrayList<Integer> list) {
        int minIndex = 0;
        for(int i = 1; i < list.size(); i ++){
            if(list.get(minIndex) > list.get(i)){
                minIndex = i;
            }
        }
        list.add(0, list.remove(minIndex));
    }
}