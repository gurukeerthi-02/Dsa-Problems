package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumInputSorted {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = checkTwoSum(nums, target);
        System.out.println(Arrays.toString(result));
     }

    static int[] checkTwoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<numbers.length;i++) {
            int rem = target - numbers[i];
            if (map.containsKey(rem)) {
                return new int[]{map.get(rem) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        return numbers;
    }
}
