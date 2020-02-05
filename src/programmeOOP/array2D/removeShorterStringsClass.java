package programmeOOP.array2D;

import java.util.ArrayList;

/**
 * removeShorterStringsClass
 */
public class removeShorterStringsClass {

    public void removeShorterStrings(ArrayList<String> list) {
        for(int i = 0; i + 1 < list.size(); i++){
           if(list.get(i).length() > list.get(i + 1).length()){
                list.remove(i+1);
           }else{
            list.remove(i);
           }
        }
    }
}