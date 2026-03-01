package Arrays_and_Strings;

import java.util.Arrays;

public class ProductOfAnArrayExceptItself {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
//        nums = byDivision(nums);
//        for(int i : nums){
//            System.out.println(i);
//        }
        int[] pre_result = getPrefix(nums);
        int[] suf_result = getSuffix(nums);
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = pre_result[i] * suf_result[i];
        }
        System.out.println(Arrays.toString(result));



    }

    static int[] byDivision(int[] nums){
        int sum = 0;
        sum = Arrays.stream(nums).reduce(1,(a,b) -> a*b);
        System.out.println(sum);
        for(int i=0;i<nums.length;i++){
            nums[i] = sum/nums[i];
        }
        return nums;
    }

    static int[] getPrefix(int[] nums){
        int[] prefixProd = new int[nums.length];
        prefixProd[0] = 1;
        for(int i=1;i<nums.length;i++){
            prefixProd[i] = prefixProd[i-1] * nums[i-1];
        }
//        for(int value:prefixSum){
//            System.out.println(value);
//        }
//        System.out.println();
        return prefixProd;
    }

    static int[] getSuffix(int[] nums){
        int[] suffixProd = new int[nums.length];
        suffixProd[nums.length-1] = 1;
        for(int i=nums.length-2;i>=0;i--){
            suffixProd[i] = suffixProd[i+1]*nums[i+1];
        }
//        for(int value:suffixSum){
//            System.out.println(value);
//        }
        return  suffixProd;
    }
}
