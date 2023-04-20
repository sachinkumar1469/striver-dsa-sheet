import java.util.Arrays;

public class Q_07_MoveAllZerosToEnd {

    public static void move(int[] arr){
        int n=arr.length;
        if(n==0) return;
        int nonZero = -1;
        int i=0;
        while (i<n){
            if(arr[i]!=0){
                nonZero++;
                int temp = arr[nonZero];
                arr[nonZero] = arr[i];
                arr[i] = temp;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
}
