package Arrays_and_Strings;
import java.util.*;

public class BestBuy1 {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int min = prices[0];
        int max_profit = 0;

        for(int i =1;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }else if (prices[i] -  min > max_profit){
                max_profit = prices[i]-min;
            }
        }

        System.out.println(max_profit);
    }
}
