import java.util.Arrays;

public class Q_14_2SumProblem {

    public static int[] exist(int[] arr, int k){
        int[] ans = new int[2];
        Arrays.sort(arr);
        int i = 0;
        int j= arr.length-1;
        while (i<j){
            int sum = arr[i]+arr[j];
            if(sum == k){
                ans[0] = arr[i];
                ans[1] = arr[j];
                return ans;
            }else if(sum>k){
                j--;
            }else{
                System.out.println("Inside if condition");
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int[] ans = exist(arr,6);
        System.out.println(Arrays.toString(ans));
    }
}
