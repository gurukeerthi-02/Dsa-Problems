package Stack;

public class SmallestNumAfterRemovingK {
    public static void main(String[] args) {
        String num = "10";
        int k = 2;
        StringBuilder result = new StringBuilder();

        for(char letter : num.toCharArray()){
            while(!result.isEmpty() && result.charAt(result.length() - 1) > letter && k > 0){
                result.deleteCharAt(result.length() - 1);
                k--;
            }
            result.append(letter);

        }


        while(!result.isEmpty() && result.charAt(0) == '0'){
            result.deleteCharAt(0);
        }

        System.out.println(result.isEmpty() ? "0" : result.toString());

    }
}
