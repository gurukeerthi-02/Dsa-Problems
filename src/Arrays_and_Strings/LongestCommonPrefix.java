package Arrays_and_Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {""};
        Arrays.sort(strs);
        String word = strs[0];
        String second = strs[strs.length - 1];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j =0;
        while(i < word.length() && j < second.length()){
            if(word.charAt(i) == second.charAt(j)){
                sb.append(word.charAt(i));
            }
            i++;
            j++;
        }
        System.out.println(sb.toString());
    }
}
