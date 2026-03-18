package SimpleCodings;

public class Fibonacci {
    public static void main(String[] args) {

        printFibo(0,1,8);
    }

    static void printFibo(int first, int second, int term){
        if(term == 0){
            return;
        }
        if(first == 0 && second == 1){
            System.out.print(first + " " + second+" ");
        }
        int next = first + second;
        System.out.print(next+" ");
        first = second;
        second = next;
        term--;
        printFibo(first,second,term);

    }
}
