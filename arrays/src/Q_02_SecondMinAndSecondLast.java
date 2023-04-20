public class Q_02_SecondMinAndSecondLast {

    public static void getElements(int[] arr,int n){
        if(n==0 || n==1){
            return;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int el = arr[i];
            if(el > max){
                secondMax = max;
                max = el;
            }else if(el < max && el>secondMax){
                secondMax = el;
            }

            if(el<min){
                secondMin = min;
                min = el;
            } else if(el>min && el<secondMin){
                secondMin = el;
            }
        }
        System.out.println(secondMax+" "+secondMin);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 7, 5,8,8};
        int n = arr.length;
        getElements(arr, n);
    }
}
