package HashMap;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }

    static boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (map.containsKey(c1) && (map.get(c1) != c2)) {
                return false;
            }
            map.put(c1, c2);
            if (map2.containsKey(c2) && map2.get(c2) != c1) {
                return false;
            }
            map2.put(c2, c1);
        }
        return true;
    }
}
