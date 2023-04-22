import java.util.Arrays;

public class Q_25_RotateTheImageBy90 {

    public static void rotate(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int[][] ans = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[j][col-i-1] = arr[i][j];
            }
        }
        for(int[] a:ans){
            System.out.println(Arrays.toString(a));
        }
    }

    public static void reverse(int[] arr,int si, int ei){
        while (si<ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    public static void rotateInplace(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        // transpose the matrix and then reverse each row
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int[] rowArr : arr){
            reverse(rowArr,0,rowArr.length-1);
        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,  2,  3,  4},    // {13, 9,5,1}  // i = 0; j 0-3 => arr[j][col-i-1]
                {5,  6,  7,  8},    // {14,10,6,2}  // i = 1; j 0-3 => arr[j][col-1-1]
                {9, 10, 11, 12},    // {15,11,7,3}
                {13, 14, 15, 16}    // {16,12,8,4}
        };
//        rotate(arr);
        rotateInplace(arr);
    }
}
