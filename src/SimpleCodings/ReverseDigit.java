package SimpleCodings;

public class ReverseDigit {
    public static void main(String[] args) {
        int num = 2010;
        String revv = "";
        int rev = 0;
        while(num>0){
            int last = num %10;
            revv += last;
            num /= 10;
        }
        System.out.println(revv);
    }
}
