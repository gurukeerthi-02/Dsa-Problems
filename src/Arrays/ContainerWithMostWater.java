package Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maximum = 0;
        int left = 0;
        int right = height.length - 1;

        while(left <= right){
            if(height[left] <= height[right]){
                int area = height[left] * (right - left);
                maximum = Math.max(maximum, area);
                left++;
            }else{
                int area = height[right] * (right - left);
                maximum = Math.max(maximum, area);
                right--;
            }
        }

        System.out.println(maximum);
    }
}
