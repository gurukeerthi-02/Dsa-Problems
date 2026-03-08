package MockTests;

import java.util.HashMap;

public class TwoSumVarient {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
    }

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem = target-nums[i];
            if(map.containsKey(rem)){
//                System.out.println(map.get(rem)+" "+i);
                return new int[] {map.get(rem),i};
            }
            map.put(nums[i],i);
        }

        return null;
    }
}
