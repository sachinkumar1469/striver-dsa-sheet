public class Q_03_ArrayIsSortedOrNot {
    public static void isSorted(int[] arr){
        int i = 1;
        while (i<arr.length){
            if(arr[i-1]<=arr[i]){
                i++;
                continue;
            }
            System.out.println("False");
            return;

        }
        System.out.println("True");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,5,6};
        isSorted(arr);
    }
}
