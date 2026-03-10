package Arrays_and_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// can be equal to or greater than the target when checking.
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int i = 0;
        int start = 0;
        int sum = 0;
        int min_length = Integer.MAX_VALUE;
        while(i<nums.length){
            sum += nums[i];
            while(sum>=target){
                if(min_length > i-start){
                    min_length = i-start;
                }
                sum -= nums[start];
                start++;
            }
            i++;
        }
        System.out.println(min_length+1);
    }
}
