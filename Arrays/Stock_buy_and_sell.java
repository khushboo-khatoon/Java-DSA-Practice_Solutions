
// Time Complexity: O(n)  | Time Complexity = O(n)
public class Stock_buy_and_sell {
     int stockBuySell(int arr[]) {
        
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit+=arr[i]-arr[i-1];
            }
                
        }
        return profit;
        
        
    }
    public static void main(String[] args) {
        Stock_buy_and_sell sbs=new Stock_buy_and_sell();
        int arr[]={7,1,5,3,6,4};
        int result=sbs.stockBuySell(arr);
        System.out.println("The maximum profit is: "+result);
    }

    
}
