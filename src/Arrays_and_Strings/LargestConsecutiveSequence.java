package Arrays_and_Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class LargestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        HashSet<Integer> set = new HashSet<>();
        for (int j : nums) set.add(j);

        int max_count = 0;
        for (Integer integer : set) {
            int current_num = 0;
            int current_count = 0;
            int num = integer;
            if (!set.contains(num - 1)) {
                current_num = num;
                current_count = 1;
                while (set.contains(current_num + 1)) {
                    current_num++;
                    current_count++;
                }
                max_count = Math.max(max_count, current_count);
            }
        }
        System.out.println(max_count);
    }
}
