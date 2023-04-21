import java.util.HashMap;

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

//    Hashing and it's optimal solution for the array that contains both positive or negative
    public static int longestHashing(int[] arr,int k){
        int n = arr.length;
        HashMap<Integer,Integer> prefix = new HashMap<>();
        int max = 0;
        int sum = 0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum == k){
                max = Math.max(max,i+1);
            }
            int remainingSum = sum - k;
            int remainingSumExists = prefix.getOrDefault(remainingSum,-1);
            if(remainingSumExists!=-1){
                int size = i - remainingSumExists;
                max = Math.max(size,max);
            }
            if(!prefix.containsKey(sum)){
                prefix.put(sum,i);
            }
        }
        System.out.println(prefix.toString());
        return max;
    }

//    Two pointer approach is optimal for positive array
    public static int optimalForPositive(int[] arr,int k){
        int n = arr.length;
        int i = 0;
        int j=0;
        int max = 0;
        int currSum = 0;
        while (j<n && i<n){
//            1,2,1,3
            if(arr[j]==k){
                max = Math.max(max,1);
                i=j+1;
            }
            currSum += arr[j];
            if(currSum==k){
                max = Math.max(max,j-i+1);
            }else if(currSum>k){
                currSum -= arr[i];
                i++;
            }

            j++;
        }
        if(currSum==k){
            max = Math.max(max,j-i);
        }
        return max;
    }

    public static void main(String[] args) {
        int n = 5, k = 17;
        int[] array = {8, 15, 17,10, 11 };
        int[] sum =   {10,12,15,16,17,18,19,20};
        System.out.println(longest(array,k));
        System.out.println(longestHashing(array,k));
        System.out.println(optimalForPositive(array,k));

    }
}
