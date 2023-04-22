import java.util.*;

public class Q_23_LongestConsecutiveSequence {

    public static int longestSequence(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int max = 0;
        int prev = arr[0];
        int curr = 1;

        for(int i=1;i<n;i++){
            if(arr[i]==prev+1){
                curr++;
            }else if(arr[i]!=prev){
                curr = 1;
            }
            max = Math.max(max,curr);
            prev = arr[i];
        }
        return max;
    }
    public static int better(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int el:arr){
            set.add(el);
        }
        int max = 0;
        for(int i=0;i<arr.length;i++){
            int el = arr[i];
            if(set.contains(el-1)){
                // Do nothing
                continue;
            }else{
                // Prev el doesn't exist
                int next = el;
                int count = 1;
                while (set.contains(next+1)){
                    count++;
                    next = next + 1;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
//        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestSequence(arr));
        System.out.println(better(arr));
    }
}
