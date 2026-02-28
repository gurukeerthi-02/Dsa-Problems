package Arrays_and_Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String input = "0P";
        input=input.toLowerCase().replaceAll("[^a-z0-9]","");
//        System.out.println(input);
        int first = 0;
        int last = input.length()-1;
        while(first < last){
            if(!(input.charAt(first) == input.charAt(last))){
                System.out.println("Not a valid palindrome");
            }
            first++;
            last--;
        }
        System.out.println("Palindrome is valid");

    }
}
