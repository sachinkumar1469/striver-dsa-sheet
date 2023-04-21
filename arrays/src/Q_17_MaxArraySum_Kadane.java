public class Q_17_MaxArraySum_Kadane {

    public static int kadanes(int[] arr){
        int n = arr.length;
        if(n==0) return 0;
        int maxSum = 0;
        int currentSum = 0;
        for(int i=0;i<n;i++){
            currentSum+=arr[i];
            if(currentSum<0){
                currentSum = 0;
            }else{
                maxSum = Math.max(currentSum,maxSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,-1,2,2,-1,0};
        System.out.println(kadanes(arr));
    }
}
