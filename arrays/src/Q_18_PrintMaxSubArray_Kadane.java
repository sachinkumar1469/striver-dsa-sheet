public class Q_18_PrintMaxSubArray_Kadane {
    public static void print(int[] arr){
        int n= arr.length;
        int currentSum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int si = -1;
        int ei = -1;
        for(int i=0;i<n;i++){
            if(currentSum<0){
                currentSum = arr[i];
                si = i;
            }else{
                currentSum += arr[i];
                if(currentSum>maxSum){
                    maxSum = currentSum;
                    ei = i;
                }
            }
        }
        System.out.println(si+""+ei);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,-1,2,2,-1,0};
        print(arr);
    }
}
