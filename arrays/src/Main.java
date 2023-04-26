import java.util.Scanner;

public class Main {
//
//    4 2 -3 1 6  Yes
//-3 1 3 5 6 No
//4 2 0 1 6 Yes
    public static boolean isZero(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum == 0){
                    return true;
                }
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        int[] arr = {-3, 1, 0, 5, 6};
        System.out.println(isZero(arr));
    }
}