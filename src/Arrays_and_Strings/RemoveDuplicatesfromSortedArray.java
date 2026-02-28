package Arrays_and_Strings;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
//        Set<Integer> set = new HashSet<>();
//        for(Integer val: arr){
//            set.add(val);
//        }
//
//        System.out.println(set.toArray().length);
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] arr) {
        int k =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[k]){
                k++;
                arr[k] = arr[i];
            }
        }
        return k+1;
    }
}
