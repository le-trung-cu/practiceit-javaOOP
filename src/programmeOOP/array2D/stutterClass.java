package programmeOOP.array2D;

import java.util.ArrayList;

/**
 * stutterClass
 */
public class stutterClass {

    public void stutter(ArrayList<String> list, int k) {
        if(k < 1){
            list.clear();
        }
        for(int i = 0; i < list.size(); i += k){
            for(int replace = 1; replace < k; replace++){
                list.add(i, list.get(i));
            }
        }
    }
}