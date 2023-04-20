import java.util.HashMap;
import java.util.Map;

public class Q_12_SingleNumber {

    public static int single(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        System.out.println(single(arr));
    }
}
