public class Q_19_StockBuyAndSell {
    public static int maxProfit(int[] arr){
        int n = arr.length;
        int maxProfit = 0;
        int minSoFar = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]<minSoFar){
                minSoFar = arr[i];
            } else {
                int profit = arr[i] - minSoFar;
                maxProfit = Math.max(maxProfit,profit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
