package programmeOOP.array2D;

import java.util.ArrayList;

/**
 * interleaveClass
 */
public class interleaveClass {

    public static void main(String[] s) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        a2.add(1);
        a2.add(2);
        a2.add(3);
        interleave(a1, a2);

        System.out.println(a1.toString());
    }

    public static void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {

        if(a1.size() == 0){
            for(int i = 0; i < a2.size(); i++){
                a1.add(a2.get(i));
            }
            return;
        }

        int minLength = Math.min(a1.size(), a2.size());
         
        if(a1.size() <= a2.size()){
            
            for(int i = 0; i < minLength - 1; i++){
                a1.add(2*i + 1, a2.get(i));
            }
            for(int i = minLength - 1; i < a2.size(); i++){
                a1.add(a2.get(i));
            }
        }else{
            for(int i = 0; i < a2.size(); i++){
                a1.add(2 * i + 1, a2.get(i));
            }
        }
    }
}