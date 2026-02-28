package Arrays_and_Strings;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = check(nums,target);
        System.out.println(Arrays.toString(result));
    }

    static int[] check(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int check = target - nums[i];
            if(map.containsKey(check)){
                return new int[] {map.get(check),i};
            }
            map.put(nums[i],i);

        }

        return null;
    }
}
