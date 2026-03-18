//Example 1:
//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true
//Explanation:
//The bijection can be established as:
//        'a' maps to "dog".
//        'b' maps to "cat".
//Example 2:
//Input: pattern = "abba", s = "dog cat cat fish"
//Output: false
//Example 3:
//Input: pattern = "aaaa", s = "dog cat cat dog"
//Output: false

package HashMap;
import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {


        String pattern = "aaaa";
        String s = "dog cat cat dog";
        System.out.println(checkBijection(pattern, s));
    }

    static boolean checkBijection(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        char[] p_array = pattern.toCharArray();
        String[] s_array = s.split(" ");
        if(p_array.length != s_array.length){
            return false;
        }
        for(int i = 0; i < s_array.length; i++){
            char c = p_array[i];
            String word = s_array[i];
            if(map.containsKey(c) && !map.get(c).equals(word)){
                return false;
            }
            if(map2.containsKey(word) && map2.get(word) != c){
                return false;
            }
            map.put(c, word);
            map2.put(word, c);
        }
        return true;
    }
}

