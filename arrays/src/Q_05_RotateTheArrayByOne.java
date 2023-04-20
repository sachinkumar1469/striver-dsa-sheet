import java.util.Arrays;

public class Q_05_RotateTheArrayByOne {

    public static void rotate(int[] arr){
        int firstEl = arr[0];
        int i = 1;
        while (i<arr.length){
            arr[i-1] = arr[i];
            i++;
        }
        arr[i-1] = firstEl;
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr);
    }
}
