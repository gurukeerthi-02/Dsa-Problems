package Arrays_and_Strings;

import java.util.ArrayList;
import java.util.List;

public class Encode_and_Decode {
    public static void main(String[] args) {
        String[] inputs = {"Hello","Bye"};
        System.out.println("Input Array : ");
        for(String input: inputs){
            System.out.println(input);
        }
        String encoded = encode(inputs);
        System.out.println("Encoded String: " + encoded);
        List<String> decoded = decode(encoded);
        System.out.println("Decoded String: ");
        for (String s : decoded) {
            System.out.println(s);
        }

    }

    static String encode(String[] str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    static List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') j++;
            int len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1,j+1+len);
            result.add(word);
            i = j + 1 + len;
        }
        return result;
    }
}

