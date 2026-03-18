//73,74,75,71,69,72,76,73
package Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
//        bruteForce(temperatures);
        optimised(temperatures);
    }


    private static void optimised(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prev = stack.pop();
                result[prev] = i - prev;
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(result));
    }


    private static void bruteForce(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for(int i = 0; i< temperatures.length; i++){
            int temp =  temperatures[i];
            int countDays = 0;
            for(int j = i+1; j< temperatures.length; j++){
                if(temp >= temperatures[j]){
                    ++countDays;
                }else{
                    result[i] =  ++countDays;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
