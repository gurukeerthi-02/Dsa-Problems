package Arrays;
import java.util.*;


public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            char[] letters = arr[i].toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);

            if(!map.containsKey(key)){
                map.put(key, new  ArrayList<>());
            }
            map.get(key).add(arr[i]);
        }
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }
}
