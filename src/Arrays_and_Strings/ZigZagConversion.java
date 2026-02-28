package Arrays_and_Strings;

public class ZigZagConversion {
    public static void main(String[] args) {
        String input = "PAYPAL";
        int rows = 3;

        System.out.println(convert(input, rows));


    }

    static StringBuilder convert(String input, int rows){
//        String[] arr = new String[rows];
        StringBuilder[] arr = new StringBuilder[rows];
        for(int i = 0; i < rows; i++){
            arr[i] = new StringBuilder();
        }
//        Arrays.fill(arr,"");
        int current_row = 0;
        boolean going_down = false;
        for(int i=0;i<input.length();i++) {
            char letter = input.charAt(i);
            arr[current_row].append(letter);
            if (current_row == 0 || current_row == rows - 1) {
                going_down = !going_down;
            }

            if (going_down) {
                current_row++;
            } else {
                current_row--;
            }
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder row : arr){
            result.append(row);
        }

        return result;
    }
}
