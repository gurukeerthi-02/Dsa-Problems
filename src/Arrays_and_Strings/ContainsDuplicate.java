package Arrays_and_Strings;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,3};

        HashMap<Integer,Integer> map = new HashMap<>();

        boolean flag = false;
        for(int value: nums){
            map.put(value, map.getOrDefault(value,0)+1);
        }
        for(int value: map.keySet()){
            if(map.get(value) > 1){
                System.out.println("Duplicate value "+value);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("No Duplicate value ");
        }
    }
}
