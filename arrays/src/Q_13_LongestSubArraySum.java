public class Q_13_LongestSubArraySum {
//    Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
    public static int longest(int[] arr,int k){
        int i = 0,n=arr.length,max = 0;

        while (i<n){
            int rem = k;
            int curr = 0;
            int j = i;
            while (rem>0 && j<n){
                rem -= arr[j];
                curr++;
                j++;
            }
            if(rem == 0){
                max = Math.max(curr,max);
            }
            i++;
        }


        return max;
    }

    public static void main(String[] args) {
        int n = 5, k = 10;
        int[] array = {2,3,5,1,1,1,1,1,9};
        System.out.println(longest(array,k));
    }
}
