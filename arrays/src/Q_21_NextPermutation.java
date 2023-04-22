import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_21_NextPermutation {
    public static void swap(int i, int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void allPermutations(int[] arr, int index, List<Integer> ans){
        if(index == arr.length){
            int num = 0;
            for(int i=0;i<arr.length;i++){
                num = num * 10 + arr[i];
            }
            ans.add(num);
            return;
        }
        for(int i = index;i<arr.length;i++){

            swap(i,index,arr);
            allPermutations(arr,index+1,ans);
            swap(i,index,arr);
        }

    }
    public static void bruteForce(int[] arr){
        int n = arr.length;
        int num = 0;
        for(int i=0;i<arr.length;i++){
            num = num * 10 + arr[i];
        }
        Arrays.sort(arr);
        List<Integer> ans = new ArrayList<>();
        allPermutations(arr,0,ans);
        int j = 0;
        while (j<ans.size()){
            if(ans.get(j)>num){
                System.out.println(ans.get(j));
                return;
            }
            j++;
        }
        System.out.println(ans.get(0));
        return;
    }

    public static void reverseArray(int[] arr, int si,int ei){
        while (si<ei){
            int temp = arr[ei];
            arr[ei] = arr[si];
            arr[si] = temp;
            si++;
            ei--;
        }
    }

    // Better approach
    public static int[] better(int[] arr){
        // Find the first element from the right such that arr[i]<arr[i+1]
        // If it doesn't exist that means array is sorted in descending order and it's last permutation
        // that means we have to return the first permutation in increasing order. Just reverse the array.
        int index = -1;
        for(int j=arr.length-2;j>=0;j--){
            if(arr[j]<arr[j+1]){
                index = j;
                break;
            }
        }
        if(index==-1){
            reverseArray(arr,0,arr.length-1);
            return arr;
        }
        // Now find smallest in the right part from j+1 to n-1
        int smallIndex = index+1;
        int smallEl = arr[index+1];
        for(int i=index+1;i<arr.length;i++){
            if(arr[i]<smallEl){
                smallIndex = i;
                smallEl = arr[i];
            }
        }
        swap(index,smallIndex,arr);
        reverseArray(arr,index+1,arr.length-1);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr1 = {1,2,3};
        bruteForce(arr);
        System.out.println(Arrays.toString(better(arr1)));
    }
}
