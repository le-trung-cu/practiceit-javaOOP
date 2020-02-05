package programmeOOP.array2D;

import java.util.ArrayList;

/**
 * removeEvenLengthClass
 */
public class removeEvenLengthClass {

    public void removeEvenLength(ArrayList<String> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() % 2 == 0){
                list.remove(i--);
            }
        }
    }
}