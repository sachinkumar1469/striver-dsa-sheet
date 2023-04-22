import java.util.ArrayList;
import java.util.List;

public class Q_26_PrintMatrixInSpiral {

    public static void print(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int hf = row/2;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<=hf;i++){ // 0
            for(int j=i;j<row-i;j++){
                list.add(arr[i][j]);
            }
            for(int j=i+1;j<col-i;j++){
                list.add(arr[j][row-i-1]);
            }
            for(int j=col-i-2;j>=i;j--){
                list.add(arr[col-i-1][j]);
            }
            for(int j=col-i-2;j>i;j--){
                list.add(arr[j][i]);
            }
        }
        System.out.println(list.toString());
    }
    public static void print2(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int rh = (row+1)/2;
        int ch = (col+1)/2;
        System.out.println("Rh is:"+rh+" and ch is:"+ch);
        int half = Math.min(rh,ch);
        List<Integer> list = new ArrayList<>();
        System.out.println("Half is: "+half);
        for(int i=0;i<half;i++){
            int j=i;
            int k=i;
            while (k<col-i){
                list.add(arr[j][k]);
                k++;
            }
            k--;
            j++;
            while (j<row-i){
                list.add(arr[j][k]);
                j++;
            }
            j--;
            k--;
            System.out.println("K is :"+k+" And j is:"+j);
            if(i!=j && k>i) {
                while (k >= i) {
                    list.add(arr[j][k]);
                    k--;
                }

                k++;
                j--;
                while (j > i) {
                    System.out.println("loop 4");
                    list.add(arr[j][k]);
                    j--;
                }
            }
        }
        System.out.println(list.toString());
    }
    public static void main(String[] args) {
        int[][] arr = {
                {2,3,4},
                {5,6,7},
                {8,9,10},
//                {11,12,13},
//                {14,15,16},

        };
        print2(arr);
    }
}
