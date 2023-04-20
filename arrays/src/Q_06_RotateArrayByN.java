import java.util.Arrays;

public class Q_06_RotateArrayByN {

    // Brute force create a temp array
    public static void rotate(int[] arr,int n){
        if(n % arr.length == 0){
            return;
        }
        int len = arr.length;
        n = n % len;
        // 1,2,3,4,5,6,7
        // 4,5,6,7,1,2,3
        int[] temp = new int[n];
        System.arraycopy(arr, 0, temp, 0, n);
        for(int j=n;j<len;j++){
            arr[j-n] = arr[j];
        }
        for(int j=len-n;j<len;j++){
            arr[j] = temp[j-(len - n)];
        }
        System.out.println(Arrays.toString(arr));
    }

    // Reversal Algorithm
    public static void reversal(int[] arr, int d) {
        int n = arr.length;
        if(n==0) return;
        d = d%n;
        if(d==0) return;
        reverse(arr,0,n-d-1);
        System.out.println(Arrays.toString(arr));
        System.out.println("d is:"+ d);
        reverse(arr,n-d,n-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr,int si,int ei){
        while (si<=ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;ei--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        rotate(arr,3);
        reversal(arr,3);
    }
}
