import java.util.Arrays;

public class Q_20_Rearrange_Array_Elements {
//    Problem Statement:
//    There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.
    public static int[] rearrange(int[] arr){
        int n = arr.length;
        int[] newArr = new int[n];
        int i=0;
        int j=1;
        for(int k=0;k<n;k++){
            if(arr[k]>=0){
                newArr[i] = arr[k];
                i+=2;
            }else{
                newArr[j]=arr[k];
                j+=2;
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,-4,-5};
        arr = rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}
