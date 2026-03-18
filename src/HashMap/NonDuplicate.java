package HashMap;

import java.util.HashMap;

public class NonDuplicate {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        int[] nums3 = {1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int key: map.keySet()){
            if(map.get(key)==1){
                System.out.println(key);
            }
        }
        optimised(nums2);
    }

    static void optimised(int[] nums){
        int result = 0;
        for(int i: nums){
            result ^=  i;
        }
        System.out.println(result);
    }
}
