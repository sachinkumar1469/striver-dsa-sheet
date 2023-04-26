import java.util.*;

public class Q_30_3SumProblem {

    // Brute force approach find all the triplets and check if sum is zero
    public static List<int[]> threeSum(int[] arr){
        List<int[]> list = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        int[] ans = {arr[i],arr[j],arr[k]};
                        Arrays.sort(ans);
                        list.add(ans);
                    }
                }
            }
        }

        return list;
    }

    public static List<List<Integer>> hashing3Sum(int[] arr){
        int n = arr.length;
//        -1,0,1,2,-1,-4
        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],1)-1);
            for(int j=i+1;j<n;j++){
                map.put(arr[j],map.getOrDefault(arr[j],1)-1);
                int left = (arr[i]+arr[j])*(-1);
                if(map.getOrDefault(left,0)!=0){
                    List<Integer> ls = new ArrayList<>();
                    Collections.addAll(ls, arr[i], arr[j], left);
                    ans.add(ls);
                }
                map.put(arr[j],map.get(arr[j])+1);
            }
            map.put(arr[i],map.get(arr[i]+1));
        }

        return ans;
    }
    public static List<List<Integer>> twoPointer2Sum(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while (i<n){
            int j = i+1;
            int k = n - 1;
            while (j<k){
                if(arr[i]+arr[j]+arr[k]==0){
                    List<Integer> ls = new ArrayList<>();
                    ls.add(arr[i]);
                    ls.add(arr[j]);
                    ls.add(arr[k]);
                    ans.add(ls);
                    // Need to increment j and decrement k
                    while (j<n && arr[j+1]==arr[j]){
                        j++;
                    }
                    j++;
                    while (k>i && arr[k-1]==arr[k]){
                        k--;
                    }
                    k--;
                } else if(arr[j]+arr[k] < -1*arr[i]){
                    j++;
                }else{
                    k--;
                }
            }
            while (i<n-1 && arr[i+1]==arr[i]){
                i++;
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-2,-2,-1,-1,-1,0,0,0,2,2,2};
        for(List<Integer> ls:twoPointer2Sum(arr)){
            System.out.println(ls.toString());
        }
        System.out.println();
        for(int[] ls:threeSum(arr)){
            System.out.println(Arrays.toString(ls));
        }

    }
}
