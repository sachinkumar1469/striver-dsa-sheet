import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_22_LeaderInArray {

    public static List<Integer> leader(int[] arr){
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        int rightLeader = arr[n-1];
        list.add(rightLeader);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=rightLeader){
                list.add(arr[i]);
                rightLeader = arr[i];
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        System.out.println(Arrays.toString(leader(arr).toArray()));
    }
}
