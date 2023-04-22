import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q_24_SetMatrixZero {
    public static void setToZero(int[][] arr){
        int[] iSet = new int[arr.length];
        int[] jSet = new int[arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){

                if(arr[i][j]==0){
                    // Mark all the elements in ith row and jth column with -1 only if it is one.
                    iSet[i] = 1;
                    jSet[j] = 1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(iSet[i]==1 || jSet[j]==1){
                    arr[i][j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
//        int[][] arr = {
//                {1,1,1},
//                {1,0,1},
//                {1,1,1}
//        };
        int[][] arr = {
                {1 , 2, 3, 4},
                {5 , 0, 7, 8},
                {0, 10,11,12},
                {13,14,15, 0}};
        setToZero(arr);
        for(int[] it:arr){
            System.out.println(Arrays.toString(it));
        }
    }
}
