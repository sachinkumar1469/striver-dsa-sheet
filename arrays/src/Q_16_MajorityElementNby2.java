public class Q_16_MajorityElementNby2 {
//  Problem Statement: Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.
    public static int max(int[] arr){
        int count = 0;
        int value = -1;
        for(int i=0;i<arr.length;i++){
            System.out.println("Count is:"+count);
            if(count==0){
                value = arr[i];
                count = 1;
                continue;
            }
            if(arr[i]==value){
                count++;
            }else{
                count--;
            }
        }
        return value;
    }
    public static void main(String[] args) {
        int[] arr = {6,5,5};
        System.out.println(max(arr));
    }
}
