import java.util.Scanner;

class Solution {
    public int maxprofit(int[] prices){
        int maxprofit=0;
        int buy = 0;

        for(int i=0;i<prices.length;i++){
            if (prices[buy] > prices[i]) {
                buy = i;
            }else {
                int profit = prices[i] - prices[buy]; 
                if (profit > maxprofit) {
                    maxprofit = profit; 
                }
            }
        }
    
        return maxprofit; 
    }
}

public class problem121 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println("enter array length");
        int length = sc.nextInt();

        int prices[] = new int[length];

        for(int i=0; i<length;i++){
            prices[i] = sc.nextInt();
        }

        int maxprofit = solution.maxprofit(prices);

        System.out.println(maxprofit);
 }   
}
