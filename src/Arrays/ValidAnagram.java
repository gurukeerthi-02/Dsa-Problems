package Arrays;
import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();

        Arrays.sort(s_array);
        Arrays.sort(t_array);

        s = new String(s_array);
        t = new String(t_array);

        System.out.println(s.equals(t));
    }
}
