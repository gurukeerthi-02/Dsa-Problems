package Arrays_and_Strings;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        String str = "bbbbbb";

        System.out.println(checkBrute(str));

        System.out.println(checkOptimized(str));
    }

    static int checkBrute(String str){
        ArrayList<Character> list = new ArrayList<>();
        int longest = 0;

        for(char c : str.toCharArray()) {
            if(!list.contains(c)){
                list.add(c);
            }else{
                while(list.get(0) != c ){
                    list.remove(0);
                }
                list.remove(0);
                list.add(c);
            }
            longest =  Math.max(longest, list.size());
        }

        return longest;
    }

    static int checkOptimized(String str){
        HashSet<Character> set = new HashSet<>();
        int longest = 0;
        int left =0;
        int len =  str.length();
        for(int right =0; right < len; right++){

            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));
            if(right-left + 1 > longest){
                longest = right-left + 1;
            }
        }

        return longest;

    }
}
