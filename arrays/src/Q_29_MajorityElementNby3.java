import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_29_MajorityElementNby3 {
    // At max there is only two numbers which appears for greater than n/3 time.
    // So after the iterating over arr you will get two el.
    // Then you have to run a for loop to verify that.
    public static List<Integer> majority(int[] arr){
        int max1 = -1;
        int max2 = -2;
        int count1 = 0;
        int count2 = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int el = arr[i];
            if(el == max1){
                count1++;
            } else if (el == max2) {
                count2++;
            } else if(count1 == 0){
                max1 = el;
                count1++;
            } else if(count2 == 0){
                max2 = el;
                count2++;
            } else {
                count2--;
                count1--;
            }
        }
        // You need to verify also that this number is appeared for n/3 times more or not
        List<Integer> ans = new ArrayList<>();
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==max1){
                c1++;
            } else if(arr[i]==max2){
                c2++;
            }
        }
        if(c1 > n/3){
            ans.add(max1);
        }
        if(c2 > n/3){
            ans.add(max2);
        }
        return ans;
    }
    // 1 2 2 4 5 6 => 4
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};
        System.out.println(Arrays.toString(majority(arr).toArray()));
    }
}
