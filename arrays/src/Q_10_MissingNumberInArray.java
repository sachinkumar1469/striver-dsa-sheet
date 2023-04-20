public class Q_10_MissingNumberInArray {
//    Input: nums = [3,0,1]
//    Output: 2
//    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
//    2 is the missing number in the range since it does not appear in nums.
    public static int missing(int[] arr){
        int n = arr.length;
        if(n==0){
            return 0;
        }

        int[] hashArr = new int[n+1];
        for(int el:arr){
            hashArr[el] = hashArr[el] + 1;
        }
        for(int i=0;i<hashArr.length;i++){
            if(hashArr[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missing(nums));
    }
}
