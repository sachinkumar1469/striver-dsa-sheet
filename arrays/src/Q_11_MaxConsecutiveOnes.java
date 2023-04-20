public class Q_11_MaxConsecutiveOnes {
    public static int max(int[] arr){
        int n = arr.length;
        if(n==0) return 0;
        int max = 0;
        int curr = 0;
        int i=0;
        while (i<n){
            if(arr[i]==1){
                curr++;
            }else{
                max = Math.max(max,curr);
                curr=0;
            }
            i++;
        }
        return max = Math.max(max,curr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1,1, 0, 1, 1};
        System.out.println(max(arr));
    }
}
