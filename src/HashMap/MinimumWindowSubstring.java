package HashMap;

import java.util.HashMap;
public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        HashMap<Character, Integer> needed = new HashMap<>();
        for (char c : t.toCharArray()) {
            needed.put(c, needed.getOrDefault(c, 0) + 1);
        }

        int minimum = Integer.MAX_VALUE;
        String minimumString = "";


        for (int left = 0; left < s.length(); left++) {
            HashMap<Character, Integer> windowMap = new HashMap<>();

            for (int right = left; right < s.length(); right++) {
                char c = s.charAt(right);
                windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

                if (containsAll(windowMap, needed)) {
                    int windowLen = right - left + 1;
                    if (windowLen < minimum) {
                        minimum = windowLen;
                        minimumString = s.substring(left, right + 1);
                    }
                    break;
                }
            }
        }

        System.out.println(minimumString);
    }
    public static boolean containsAll(HashMap<Character, Integer> window,
                                      HashMap<Character, Integer> needed) {
        for (char c : needed.keySet()) {
            if (window.getOrDefault(c, 0) < needed.get(c)) {
                return false;
            }
        }
        return true;
    }
}
