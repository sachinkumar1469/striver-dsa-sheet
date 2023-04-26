import java.util.Arrays;
import java.util.HashMap;

public class Q_27_SubArraySumEqualsToK {
    public static int count(int[] arr, int k){
        int count = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k)
                    count++;
            }
        }
        return count;
    }

    public static int hashingCount(int[] arr,int k){
        int n=arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

            int left = sum - k;

            int leftCount = map.getOrDefault(left,0);
            if(leftCount!=0){
                count+=leftCount;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(map.toString());
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,-1,0};
        int[] arr1 = {1,-1,0};
        int k = 0;
        System.out.println(count(arr,k));
        System.out.println(hashingCount(arr1,k));
    }
}
