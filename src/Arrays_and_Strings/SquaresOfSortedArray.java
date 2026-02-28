package Arrays_and_Strings;
import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-15,10,5,9,1};
        for(int i=0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        System.out.println(nums);
    }
}
