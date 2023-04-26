import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_41_4SumProblem {

    // Approach 1 => 3 Pointer and Binary Search
    // Run three nested for loop i,j,k => int left = target - (arr[i] + arr[j] + arr[k])
    // Now search the left in remaining array using binary search
    // If left exist then its 4Sum.
    // Time complexity will be N^3 + logN + NlogN

    // Better Approach
    // Sort the array
    // Run two outer loops i and j now search for left between j+1 and n-1 using two pointer sum
    public static List<List<Integer>> fourSum(int[] arr, int t) {
        int n = arr.length;
//        2,-4,-5,-2,-3,-5,0,4,-2
//        1000000000,1000000000,1000000000,1000000000
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        while (i<n){
            int j = i+1;
            while (j<n){
                int max = Math.max(t,arr[i]+arr[j]);
                int min = Math.min(t,arr[i]+arr[j]);
                int left = max - min;
                // Now search for k between j+1 to n-1
                int k = j+1;
                int l = n-1;
                while (k<l){
                    System.out.println("K is: "+k+" L is: "+l+" sum is: "+(arr[k]+arr[l])+" and left is"+left);
                    if(arr[k]+arr[l]==left){

                        List<Integer> ls = new ArrayList<>();
                        ls.add(arr[i]);
                        ls.add(arr[j]);
                        ls.add(arr[k]);
                        ls.add(arr[l]);
                        ans.add(ls);
                        System.out.println(ls.toString());
                        while (k<n-1 && arr[k]==arr[k+1]){
                            k++;
                        }
                        while (l>j+1 && arr[l]==arr[l-1]){
                            l--;
                        }
                        k++;
                        l--;
                    }else if(arr[k]+arr[l]<left){
                        k++;
                    }else {
                        l--;
                    }
                }
                while (j<n-1 && arr[j]==arr[j+1]){
                    j++;
                }
                j++;
            }
            while (i<n-1 && arr[i]==arr[i+1]){
                i++;
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1000000000,1000000000,1000000000,1000000000};
        for(List<Integer> ls: fourSum(arr,-294967296)){
            System.out.println(ls.toString());
        }
        System.out.println();
        System.out.println(-294967296-2000000000);
    }
}
