package programmeOOP.array2D;

import java.util.ArrayList;

/**
 * Write a method removeDuplicates that takes as a parameter a
 *  sorted ArrayList of Strings and that eliminates any duplicates 
 * from the list. For example, suppose that a variable called list
 *  contains the following values: {"be", "be", "is", "not", "or", 
 * "question", "that", "the", "to", "to"} After calling removeDuplicates(list); 
 * the list should store the following values: {"be", "is", "not", "or", "question", 
 * "that", "the", "to"} 
 * 
 * Because the values will be sorted, all of the duplicates will be grouped together.
 */
public class removeDuplicatesClass {

    public void removeDuplicates(ArrayList<String> list) {
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) == list.get(i - 1)){
                list.remove(i--);
            }
        }
    }
}