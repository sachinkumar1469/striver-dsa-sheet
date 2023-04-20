import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_04_RemoveDuplicatesFromSortedArray {

    public static void remove(int[] arr){
        List<Integer> ls = new ArrayList<>();
        int listSize = 0;
        int i = 1;
        ls.add(arr[0]);
        while (i<arr.length){
            if(arr[i] == ls.get(listSize)){
                i++;
                continue;
            }
            ls.add(arr[i]);
            listSize++;
            i++;
        }
        System.out.println(Arrays.toString(ls.toArray()));
    }

    public static void removeBetter(int[] arr){
//        1,1,1,2,2,3,3,3,3,3,4,4,5,6
        int i = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        for(int j=0;j<=i;j++){
            System.out.print(arr[j]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,3,3,3,3,4,4,5,6};
        remove(arr);
        removeBetter(arr);
    }
}
