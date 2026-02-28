package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int[] nums = {-1,0,1,2,-1,-4};
        for(int i = 0; i < nums.length; i++){
            int first = nums[i];
            for(int j = i + 2; j < nums.length; j++){
                if(first + nums[j] + nums[j-1] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(first);
                    temp.add(nums[j]);
                    temp.add(nums[j-1]);
                    if(!list.contains(temp)) {
                        list.add(temp);
                    }
                }
            }
        }
        for(List<Integer> list1 : list){
            System.out.println(list1);
        }
    }
}
