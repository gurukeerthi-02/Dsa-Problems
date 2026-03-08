package MockTests;

import java.util.ArrayList;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        ArrayList<Character> list = new ArrayList<>();
        int longest = 0;
        for(char c:s.toCharArray()){
            while(list.contains(c)){
                list.remove(0);
            }
            list.add(c);
            if(list.size() > longest){
                longest = list.size();
            }
        }
        System.out.println(longest);
    }
}
