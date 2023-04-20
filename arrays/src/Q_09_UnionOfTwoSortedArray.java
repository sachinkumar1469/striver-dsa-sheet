import java.util.*;

public class Q_09_UnionOfTwoSortedArray {
    public static void union(int[] arr1,int[] arr2){
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(var i=0;i<arr1.length;i++){
            int el = arr1[i];
            if(!map.containsKey(el)){
                map.put(el,true);
            }
        }
        for(var i=0;i<arr2.length;i++){
            int el = arr2[i];
            if(!map.containsKey(el)){
                map.put(el,true);
            }
        }
        System.out.println(map.toString());
    }

    public static void intersection(int[] arr1,int[] arr2){
        Set<Integer> set = new HashSet<>();
        for(var i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        Set<Integer> result = new HashSet<>();
        for(var i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                result.add(arr2[i]);
            }
        }
        System.out.println(result.toString());
    }

    public static void intersectionSorted(int[] arr1,int[] arr2){
        int i=0,j=0;
        List<Integer> ls = new ArrayList<>();
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                ls.add(arr1[i]);
                i++;j++;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else{
                i++;
            }
        }
        System.out.println(ls.toString());
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,4,5,6};
        union(arr1,arr2);
        intersection(arr1,arr2);
        intersectionSorted(arr1,arr2);
    }
}
