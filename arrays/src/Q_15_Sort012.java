import java.util.Arrays;

public class Q_15_Sort012 {

    public static void sort(int[] arr){
        int n = arr.length;
        int start = 0;
        int zero = -1;
        int two = n;
        while (start<two){
//            {1,2,0}
            if(arr[start]==0){
                zero++;
                arr[start] = arr[zero];
                arr[zero] = 0;

            }
            if(arr[start]==2){
                two--;
                arr[start] = arr[two];
                arr[two] = 2;
                continue;
            }
            start++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
